import javax.microedition.lcdui.Image;

public class b {

   public static final byte[] goto = new byte[]{(byte)0, (byte)1, (byte)2, (byte)3, (byte)4, (byte)4, (byte)4, (byte)4, (byte)5, (byte)6};
   public static final byte[] char = new byte[]{(byte)6, (byte)5, (byte)4, (byte)4, (byte)4, (byte)4, (byte)3, (byte)2, (byte)1, (byte)0};
   public static d[] for = new d[4];
   public static d[] if = new d[20];
   public static int else = -1;
   public static int[] byte = new int[]{11382189, 9754358, 14274964, 5486110};
   public static d b;
   public static d case;
   public static d c;
   public static d new;
   public static d[] do = new d[4];
   public static d[] void = new d[2];
   public static d[] a;
   d int;
   public int try;
   public int d;
   public int null;
   public int long;


   public b(byte var1, int var2, int var3) {
      if(var1 == 0) {
         this.try = 0;
      } else if(var1 == 1) {
         this.d = var1;
         this.try = 1;
      } else if(var1 == 2) {
         this.d = 15;
         this.try = 3;
      } else if(var1 == 3) {
         this.try = 2;
         this.int = new;
      } else if(var1 == 4) {
         this.try = 6;
         this.int = case;
      } else if(var1 != 5 && var1 != 6) {
         if(var1 >= 7 && var1 <= 10) {
            this.try = 5;
            this.d = (byte)(var1 - 7);
            this.int = do[this.d];
         }
      } else {
         this.try = 4;
         this.d = (byte)(var1 - 5);
         this.int = void[this.d];
      }

      this.do(var2, var3);
   }

   public void do(int var1, int var2) {
      this.null = (var1 << 3) + (var1 << 2);
      this.long = (var2 << 3) + (var2 << 2);
   }

   public void a(int var1, int var2) {
      if((this.d & 4) == 0) {
         this.d |= 4;
         if(this.try == 6) {
            this.int = new d(b);
         } else if(this.try == 0) {
            Game.a(Game.case);
            this.int = new d(c);
         }

         short var3;
         if(this.try == 5) {
            Game.a(Game.aI);
            var3 = 20;
         } else {
            var3 = (short)(this.int.do * this.int.new);
         }

         if(this.try == 6 || this.try == 5) {
            Game.if(var3);
         }

         new g(var1, var2, this, var3);
      }
   }

   public static void if(int var0, int var1) {
      if(var0 >= 0 && var1 >= 0 && var0 < c.if && var1 < c.byte) {
         b var3 = c.int[var0][var1];
         int var2 = var3.try;
         if(var2 == 2 || var2 == 4 || var2 == 5) {
            var3.for();
            var3.int = null;
            var3.try = 0;
         }

         if(var2 != 1 && var2 != 3) {
            var3.a(var0, var1);
         }

         int var4 = var3.null - a.x;
         int var5 = var3.long - a.w;
         if(var4 > -12 && var4 < 12 && var5 > -12 && var5 < 12) {
            a.a();
         }

      }
   }

   public void new() {
      if(this.try == 2 && a.if != 0) {
         this.int = a[a.if - 1];
      }

      a.d = this;
      if(this.try == 2) {
         this.for();
      }

   }

   public void do() {
      a.d = null;
      if(this.try == 2) {
         this.int = new;
         this.int();
      }

   }

   public void int() {
      if(a.d != this && this.try == 2) {
         this.int.a(c.e.getGraphics(), this.null - (c.j << 3) - (c.j << 2) + (12 - this.int.else >> 1), this.long - (c.h << 3) - (c.h << 2));
      }
   }

   public void for() {
      if(this.try == 2) {
         if[0].a(c.e.getGraphics(), this.null - (c.j << 3) - (c.j << 2), this.long - (c.h << 3) - (c.h << 2));
      }
   }

   public void a() {
      if(a.d == this) {
         if(a.B > 0) {
            this.do();
            return;
         }

         if(a.if == 1) {
            this.null = a.x - 12;
         } else if(a.if == 2) {
            this.null = a.x + 12;
         } else if(a.if == 3) {
            this.long = a.w - 12;
         } else if(a.if == 4) {
            this.long = a.w + 12;
         }
      } else if(this.try == 2) {
         return;
      }

      if(this.try != 5 || (this.d & 8) == 0) {
         this.int.a(this.null + (12 - this.int.else >> 1), this.long);
      }

   }

   public static void a(int var0) {
      if(else != var0) {
         else = var0;

         for(int var1 = 0; var1 < 20; ++var1) {
            for[var0].null = var1;
            for[var0].a(if[var1].a.getGraphics(), 0, 0);
         }

      }
   }

   public static void if() {
      Image[] var0 = new Image[20];

      for(int var1 = 0; var1 < 20; ++var1) {
         var0[var1] = Image.createImage(12, 12);
         System.gc();
         if[var1] = new d(var0[var1]);
      }

      do[0] = new d("laserDown");
      do[0].new = 8;
      do[2] = new d("laserUp");
      do[2].new = 8;
      do[3] = new d("laserLeft");
      do[3].new = 8;
      do[1] = new d("laserRight");
      do[1].new = 8;
      void[0] = new d("mirrorL");
      void[1] = new d("mirrorR");
      new = new d("stone");
      case = new d("bombTickTick");
      b = new d("bombExplode", 6);
      c = new d("explosion", 6);
      a = new d[4];
      a[0] = new;
      a[1] = new;
      a[2] = new;
      a[3] = new;
      for[0] = new d("level1", 20);
      for[0].if = false;
      for[1] = new d("level2", 20);
      for[1].if = false;
      for[2] = new d("level3", 20);
      for[2].if = false;
      for[3] = new d("level4", 20);
      for[3].if = false;
   }

}
