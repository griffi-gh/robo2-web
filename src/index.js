import * as fs from 'fs/promises';
import express from 'express';
import {
  DataOutput
} from './java.js';

console.log("Robo2 backend");

const app = express();

app.use((req, res, next) => {
  console.log(req.path);
  next();
});

app.get('/', (req, res) => {
  res.send("hero-craft.com backend is hosted at /web");
});

app.get('/web/robo/levels/desc', (req, res) => {
  console.log("Requested desc");
  const strings = [
    "Hello, world",
    "short name",
    "Тест UTF-8!",
  ];

  const out = new DataOutput();
  out.writeShort(strings.length);
  strings.forEach(str => {
    console.log("Writing lvl " + str);
    out.writeUTF(str);
    out.writeShort(1); //amount of levels in a levelpack (?)
  });
  const buf = out.toBuffer();

  console.log("Sent array with size of " + buf.length + " bytes.\nres:");
  console.log(buf);

  res.send(buf);
});

app.get('/web/robo/levels/:id', async (req, res) => {
  const id = req.params.id;
  console.log(`Level "${id}" requested`);

  let data = Array.from(await fs.readFile('./data/0'));
  console.log("Data ready");

  const out = new DataOutput();
  out.writeShort(data.length);
  out.writeArr(data);

  out.writeShort(1);
  out.write(0);
  
  const buf = out.toBuffer();
  console.log("Sent array with size of " + buf.length);
  console.log(buf);
  res.send(buf);
});

app.listen(3000);