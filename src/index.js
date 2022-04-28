import 'dotenv/config';
import * as fs from 'fs/promises';
import express from 'express';
import Api from './api.js';
console.log("Starting...");

console.log("\tConnecting to database...");
const api = await (new Api()).connect();

console.log("\tStarting a web server...");

function procNull(res, data) {
  if(data == null) {
    res.status(400).send();
  } else {
    res.send(data);
  }
}

const app = express();

app.use('/web/robo/editor', express.static('editor'));

app.use((req, res, next) => {
  console.log(req.path);
  next();
});

app.get('/', (req, res) => {
  res.send(`
    <a href="web/robo/editor/">
      <button type="button">
        Level editor
      </button>
    </a>
    <br><hr><br>
    Use this Robo 2 API endpoint:<br>
    <a href="/web/robo">
      <span id="url">/</span>web/robo 
    </a>
    <script type="module">
      document.getElementById("url").textContent = window.location.href
    </script>
  `);
});

app.get('/web/robo/levels/desc', async (req, res) => {
  let data = await api.roboDesc();
  procNull(res, data);
});

app.get('/web/robo/levels/:id', async (req, res) => {
  let data = res.send(req.params.id);
  procNull(res, data);
});

const port = 3000;
app.listen(port, () => {
  console.log(`Done!\nRunning on port ${port}`);
});