import {
  DataOutput
} from './java.js';
import pg from 'pg';

export function verifyLevelName(name) {
  return name && (name.length <= 32) && (name.toLowerCase() != "standart");
}

export default class Api {
  constructor() {}
  async connect(opt) {
    this.db = new pg.Pool(opt);
    await this.db.query(`
      CREATE TABLE IF NOT EXISTS levelsets (
        id SERIAL PRIMARY KEY,
        name VARCHAR(32),
        levels bytea[],
      );
    `);
    return this;
  }
  
  async roboDesc() {
    //TODO get level list from db
    let res = await db.query(`
      SELECT name, array_length(levels, 1) FROM levelsets;
    `);
    console.log(res);
    return;
    
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