import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class d {

   public static d[] long = new d[43];
   public static String[] try = new String[43];
   public static int goto = 0;
   public int else;
   public int byte;
   public int new = 2;
   public int case;
   public int null;
   public int do;
   public boolean if = true;
   public Image a;
   public byte[] for;
   public int[] char;
   public static int int;


   public void a(byte[] var1) {
      this.do = var1.length;
      this.for = var1;
   }

   public d(Image var1) {
      this.a = var1;
      this.do = 1;
      this.if = false;
      this.else = var1.getWidth();
      this.byte = var1.getHeight();
   }

   public d(d var1) {
      this.a = var1.a;
      this.do = var1.do;
      this.char = var1.char;
      this.for = var1.for;
      this.if = var1.if;
      this.new = var1.new;
      this.else = var1.else;
      this.byte = var1.byte;
   }

   public d(String var1, int var2) {
      Game.if();
      if(goto < long.length) {
         long[goto] = this;
         try[goto] = var1;
         ++goto;
      }

      this.if = true;
      this.do = var2;

      try {
         this.a = Image.createImage(String.valueOf(String.valueOf((new StringBuffer("/data/")).append(var1).append(".png"))));
      } catch (Exception var4) {
         ;
      }

      System.gc();
      this.else = this.a.getWidth();
      this.byte = this.a.getHeight() / this.do;
      if(this.do > 1) {
         this.char = new int[this.do];

         for(int var3 = 1; var3 < this.do; ++var3) {
            this.char[var3] = this.char[var3 - 1] + this.byte;
         }
      }

   }

   public d(String var1) {
      Game.if();
      if(goto < long.length) {
         long[goto] = this;
         try[goto] = var1;
         ++goto;
      }

      this.do = 1;

      try {
         this.a = Image.createImage(String.valueOf(String.valueOf((new StringBuffer("/data/")).append(var1).append(".png"))));
      } catch (Exception var3) {
         ;
      }

      System.gc();
      this.else = this.a.getWidth();
      this.byte = this.a.getHeight() / this.do;
      this.if = false;
   }

   public void a(Graphics var1, int var2, int var3) {
      if(this.do == 1) {
         var1.drawImage(this.a, var2, var3, 20);
      } else {
         if(this.for != null) {
            int = this.char[this.for[this.null]];
         } else {
            int = this.char[this.null];
         }

         var1.setClip(var2, var3, this.else, this.byte);
         var1.drawImage(this.a, var2, var3 - int, 20);
         var1.setClip(-var1.getTranslateX(), -var1.getTranslateY(), Game.c, Game.m);
         if(this.if && ++this.case == this.new) {
            ++this.null;
            if(this.null == this.do) {
               this.null = 0;
            }

            this.case = 0;
         }
      }

   }

   public void a(int var1, int var2) {
      this.a(Game.ab, var1, var2);
   }

   public String toString() {
      return null;
   }

}
