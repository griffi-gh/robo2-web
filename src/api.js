import {
  DataOutput
} from './java.js';
import * as pg from 'pg';
export function verifyLevelName(name) {
  return name && (name.length <= 32) && (name.toLowerCase() != "standart");
}

export default class Api {
  constructor() {
    this.db = new pg.Pool();
    this.db.query(`
      CREATE TABLE IF NOT EXISTS levelsets (
        ID SERIAL PRIMARY KEY,
        name VARCHAR(32),
        levels bytea[],
      );
    `);
  }
  async roboDesc() {
    //TODO get level list from db
    const out = new DataOutput();
    out.writeShort(strings.length);
    strings.forEach(str => {
      console.log("Writing lvl " + str);
      out.writeUTF(str);
      out.writeShort(1); //amount of levels in a levelpack (?)
    });
    return out.toBuffer();
  }
  async roboLevel(name) {
    if (!verifyLevelName(name)) {
      return null;
    }
    //TODO get data from db
    const out = new DataOutput();
    //level data
    //TODO add loop to support multiple levels in levelpack
    out.writeShort(data.length);
    out.writeArr(data);
    //level names?
    out.writeShort(1);
    out.write(0);
    return out.toBuffer();
  }
}