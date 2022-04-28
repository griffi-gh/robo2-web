const encoder = new TextEncoder();

export class DataOutput {
  constructor() {
    this.data = [];
  }
  write(b) {
    this.data.push(b & 0xFF);
  }
  writeArr(a) {
    Array.from(a).forEach(v => this.write(v));
  }
  writeShort(v) {
    const modulo = Math.abs(v) & 0x7FFF;
    const sign = (v < 0) | 0;
    const raw = (sign << 15) | modulo;
    this.write(raw >> 8);
    this.write(raw);
  }
  writeUTF(str) {
    const buf = encoder.encode(str);
    this.writeShort(buf.length);
    this.writeArr(buf);
  }
  toBuffer() {
    return Buffer.from(this.data);
  }
}