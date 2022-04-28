import 'dotenv/config';
import express from 'express';
import Api from './api.js';

console.log("Starting robo2-web...");
console.log("- Connecting to database...");

const api = await (new Api()).connect();

console.log("- Starting the server...");

function procNull(res, data) {
  if(data == null) {
    res.status(400).send();
  } else {
    res.send(data);
  }
}

const app = express();
app.set('trust proxy', true);

//Log requests
app.use((req, res, next) => {
  console.log(`REQUEST ${req.ip} => ${req.method} ${req.path}`);
  next();
});

//Static
app.use('/web/robo/editor', express.static('editor'));
app.use('/', express.static('static'));

//Parse JSON
app.use(express.json());

//Robo 2 API
app.get('/web/robo/levels/desc', async (req, res) => {
  procNull(res, await api.roboDesc());
});

app.get('/web/robo/levels/:id', async (req, res) => {
  procNull(res, await api.roboLevel(req.params.id));
});

//Client side api
app.post('/web/robo/upload', async (req, res) => {
  procNull(res, await api.roboUpload(req.body));
});

//Start server
const port = 3000;
app.listen(port, () => {
  console.log(`Done! Running on port ${port}\n`);
});