import {
  DataOutput
} from './java.js';
import pg from 'pg';

const NO_SETS = "No level sets available";

export function verifyLevelName(name) {
  return name && (name.length >= 1) && (name.length <= 32) && (name.toLowerCase() != "standart") && (name != NO_SETS);
}

export default class Api {
  constructor() {}
  async connect(opt) {
    this.db = new pg.Pool(opt);
    await this.db.query(`
      create table if not exists levelsets (
        id serial primary key,
        name varchar(32),
        levels bytea[]
      );
    `);
    return this;
  }
  
  async roboUpload(body) {
    if(!(
      body && 
      (body instanceof Object) && 
      body.name && 
      body.levels 
    )) {
      return null;
    }
    if(!verifyLevelName(body.name)) {
      return null;
    }
    let {name, levels} = body;
    levels = levels.map(v => {
      return Buffer.from(v, 'base64');
    });
    await this.db.query(`
      insert into levelsets 
        (name, levels) 
        values ($1, $2);
    `, [body.name, levels]);
    return "ok";
  }
  
  async roboDesc() {
    const {rows} = await this.db.query(`
      select
        name,
        array_length(levels, 1) as level_count
      from levelsets limit 255;
    `);
    const out = new DataOutput();
    if(rows.length) {
      out.writeShort(rows.length);
      rows.forEach(row => {
        out.writeUTF(row.name);
        out.writeShort(row.level_count); 
      });
    } else {
      out.writeShort(1);
      out.writeUTF(NO_SETS);
      out.writeShort(0);
    }
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