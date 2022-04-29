import base64 from './base64.js';

const $id = id => document.getElementById(id);

const filePicker = $id('file');
const addButton  = $id('add');
const submButton = $id('submit');
const lvlCounter = $id('lv-count');
const setName    = $id('name');

const levels = [];

addButton.addEventListener('click', () =>  {
  const file = filePicker.files.item(0);
  if(!file) return;
  const reader = new FileReader();
  reader.addEventListener('load', () => {
    levels.push(reader.result);
    lvlCounter.value = (lvlCounter.value >>> 0) + 1;
  });
  reader.readAsArrayBuffer(file);
});

submButton.addEventListener('click', event => {
  event.target.disabled = true;
  const body = {
    name: setName.value, 
    levels: levels.map(v => base64(v))
  };
  fetch('/web/robo/upload', {
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(body)
  }).then(() => {
    event.target.disabled = false;
  });
});

console.log("ready.");