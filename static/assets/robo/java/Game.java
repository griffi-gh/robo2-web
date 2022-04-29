import java.io.DataInputStream;
import java.util.Random;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;

public class Game extends MIDlet implements Runnable {

   public static MIDlet M;
   public static Graphics ab;
   public static e try;
   public static Thread aP;
   public static int ad = -1;
   public static int aa;
   public static long new;
   public static long aK;
   public static int b;
   public static int null;
   public static int c;
   public static int m;
   public static int aG;
   public static boolean z;
   public static boolean aX;
   public static final int X = 40;
   public static final int if = 41;
   public static final int aM = 42;
   public static final int aT = 0;
   public static final int R = 1;
   public static final int w = 2;
   public static final int aE = 3;
   public static final int U = 6;
   public static final int for = 7;
   public static final int aB = 12;
   public static final int v = 13;
   public static final int F = 14;
   public static final int ah = 15;
   public static final int C = 16;
   public static final int q = 17;
   public static final int a5 = 18;
   public static String E = "http://www.herocraft.com/games/robo2";
   public static String ao;
   public static int aA;
   public static int l;
   public static int k;
   public static final int B = 43;
   public static final int aC = 9;
   public static int a0;
   public static int Z;
   public static boolean aj;
   public static boolean I;
   public static int byte;
   public static boolean char = false;
   public static boolean at = false;
   public static String D;
   public static d Y;
   public static d ag;
   public static int V;
   public static int S;
   public static int G;
   public static int ar;
   public static int h;
   public static int g;
   public static int u;
   public static int ac;
   public static int aD;
   public static int e;
   static d ay;
   static d ax;
   static d aR;
   static d a7;
   static d a6;
   static int aw = 1000;
   static int av = 0;
   static int do = 52;
   static int W;
   static int ak;
   static int o;
   public static Object[] O = null;
   public static int L;
   public static int aQ;
   public static int aU;
   public static int i;
   public static int H;
   public static int aS;
   public static int aY;
   public static int int;
   static long Q = 0L;
   public static Player y;
   public static Player aF;
   public static Player aJ;
   public static Player long;
   public static Player else;
   public static int case;
   public static int aI;
   public static int a;
   public static int p;
   public static int aN;
   static Player N;
   public static String d;
   public static String aZ;
   public static String aq;
   public static String x;
   public static String t;
   public static String a2;
   public static String r;
   public static String au;
   public static String ap;
   public static String void;
   public static String as;
   public static String ae;
   public static String a3;
   public static String aH;
   public static String s;
   public static String af;
   public static String al;
   public static String am;
   public static String T;
   public static String f;
   public static String aV;
   public static String aW;
   public static String[] a4;
   public static String[] ai;
   public static String[] n;
   public static String[] K;
   public static String[] aO;
   public static String[] goto;
   public static String[] aL;
   public static String[] a1;
   public static String an;
   public static String j;
   public static String P;
   public static String A;
   public static String J;
   public static String az;


   public Game() {
      M = this;
      try = new e();
      c = try.getWidth();
      m = try.getHeight();
      System.gc();
      c.m = (c + 24 - 1) / 12;
      v = (m + 24 - 1) / 12;
      c.e = Image.createImage(c.m * 12, c.v * 12);
      System.gc();
      aP = new Thread(this);
      aP.start();
   }

   public static void if() {
      if(aG == 42) {
         ++a0;
         try.repaint();
         try.serviceRepaints();
      }
   }

   protected void startApp() {
      Display.getDisplay(M).setCurrent(try);
      char = true;
   }

   public void do() {
      while(!char) {
         ;
      }

      aG = 40;
      try.repaint();
      try.serviceRepaints();

      try {
         Thread.sleep(1500L);
      } catch (Exception var3) {
         ;
      }

      aG = 41;
      try.repaint();
      try.serviceRepaints();

      try {
         Thread.sleep(1500L);
      } catch (Exception var2) {
         ;
      }

      aG = 42;
      z = true;
      try.repaint();
      try.serviceRepaints();
      int();
      a();
      h.for();
      y = a("intro.mid", "audio/midi");
      a(y);
      c.for();
      aR = new d("copyright");
      ay = new d("arrowsColor1", 5);
      ax = new d("arrowsColor2", 5);
      Y = new d("arrowUp", 5);
      ag = new d("arrowDown", 5);
      Y.new = ag.new = 2;
      Y.if = ag.if = false;
      aF = a("menu.mid", "audio/midi");
      aJ = a("begin.mid", "audio/midi");
      long = a("end.mid", "audio/midi");
      else = a("die.mid", "audio/midi");
      aG = 2;
      a4 = ai;
      aA = 0;
      z = true;
      ad = -1;
   }

   protected void pauseApp() {}

   protected void destroyApp(boolean var1) {
      h.do();
      h.a();
   }

   public void run() {
      this.do();

      for(; !at; aK = System.currentTimeMillis()) {
         null();
         try.repaint();
         try.serviceRepaints();
         new = (long)40 - (System.currentTimeMillis() - aK);
         if(new > (long)0) {
            try {
               Thread.sleep(new);
            } catch (Exception var2) {
               ;
            }
         }
      }

      a.o = null;
      a.goto = null;
      a.case = null;
      a.byte = null;
      a.f = null;
      a.b = null;
      a.D = null;
      a.v = null;
      a.p = null;
      a.k = null;
      a.G = null;
      a.t = null;
      a.c = null;
      a.y = null;
      a.do = null;
      a.s = null;
      a.A = null;
      a.j = null;
      a.H = null;
      a.else = null;
      a.h = null;
      b.case = null;
      b.b = null;
      b.c = null;
      b.do = null;
      b.if = null;
      b.void = null;
      b.a = null;
      b.new = null;
      b.for = null;
      c.int = null;
      c.goto = null;
      c.p = null;
      c.r = null;
      c.do = null;
      c.x = null;
      c.case = null;
      c.C = null;
      c.t = null;
      c.e = null;
      c.u = null;
      d.long = null;
      O = null;
      Y = null;
      ag = null;
      a7 = null;
      a6 = null;
      ay = null;
      ax = null;
      aR = null;
      try = null;
      M = null;
      aP = null;
      System.gc();
      this.notifyDestroyed();
   }

   public static void null() {
      if(aG == 0) {
         c.int();
         if(ad == 8) {
            aA = 0;
            aG = 1;
            a4 = n;
            ad = -1;
            z = true;
            c.null = System.currentTimeMillis();
            byte = 0;
         }
      } else {
         a(aF);
         if(aG != 17 && aG != 18) {
            if(aG == 6) {
               if(ad == 8) {
                  aG = 2;
                  aA = 0;
                  z = true;
                  ad = -1;
               }
            } else if(aG == 7) {
               b();
            } else {
               case();
            }
         } else if(ad == 8) {
            aG = 12;
            a4 = aO;
            aA = 0;
            z = true;
            ad = -1;
         }
      }

   }

   public static void new() {
      Image var0;
      if(aG == 40) {
         ab.setColor(16777215);
         ab.fillRect(0, 0, c, m);
         System.gc();

         try {
            var0 = Image.createImage("/data/logo.png");
            ab.drawImage(var0, c >> 1, m >> 1, 1 | 2);
            var0 = null;
            System.gc();
         } catch (Exception var8) {
            ;
         }
      } else {
         int var9;
         if(aG == 41) {
            var9 = -1;
            String var1 = f.a("ProvColor");
            if(var1 != null) {
               try {
                  var9 = Integer.valueOf(var1).intValue();
               } catch (NumberFormatException var7) {
                  ;
               }
            }

            if(var9 != -1) {
               Image var2 = null;

               try {
                  ab.setColor(var9);
                  ab.fillRect(0, 0, c, m);
                  var2 = Image.createImage("/data/prov.png");
                  ab.drawImage(var2, c >> 1, m >> 1, 2 | 1);
               } catch (Exception var6) {
                  ;
               }

               var2 = null;
               System.gc();
            }
         } else if(aG == 42) {
            if(z) {
               z = false;

               try {
                  ab.setColor(16777215);
                  ab.fillRect(0, 0, 255, 255);
                  var0 = Image.createImage("/data/Splash.png");
                  ab.drawImage(var0, c >> 1, m >> 1, 2 | 1);
                  l = (c - var0.getWidth() >> 1) + 39;
                  k = (m - var0.getHeight() >> 1) + 101;
                  var0 = null;
                  System.gc();
               } catch (Exception var5) {
                  ;
               }
            } else {
               var9 = 9 * a0 / 43;
               if(var9 != Z) {
                  ab.setColor(124, 123, 0);
                  ab.fillRect(l + Z * 3, k, 2, 3);
                  Z = var9;
               }
            }
         } else if(aG == 0) {
            c.a();
         } else if(aG == 16) {
            z = true;
            ab.setColor(16777215);
            ab.fillRect(0, 0, c, m);
            ab.setColor(0);
            ab.drawString(am, c >> 1, m >> 1, 16 | 1);
         } else if(aG == 17) {
            if(!z) {
               return;
            }

            z = false;
            ab.setColor(16777215);
            ab.fillRect(0, 0, c, m);
            ab.setColor(0);
            ab.drawString(T, c >> 1, (m >> 1) - ab.getFont().getHeight(), 16 | 1);
            ab.drawString(ao, c >> 1, (m >> 1) + ab.getFont().getHeight(), 16 | 1);
            ab.drawString(au, c, m, 8 | 32);
         } else if(aG == 18) {
            if(!z) {
               return;
            }

            z = false;
            ab.setColor(16777215);
            ab.fillRect(0, 0, c, m);
            ab.setColor(0);
            ab.drawString(f, c >> 1, (m >> 1) - ab.getFont().getHeight(), 16 | 1);
            ab.drawString(aV, c >> 1, m >> 1, 16 | 1);
            ab.drawString(aW, c >> 1, (m >> 1) + ab.getFont().getHeight(), 16 | 1);
            ab.drawString(au, c, m, 8 | 32);
         } else if(aG == 6) {
            if(z) {
               z = false;
               ab.setColor(16777215);
               ab.fillRect(0, 0, c, m);
               System.gc();

               try {
                  var0 = Image.createImage("/data/logo.png");
                  ab.drawImage(var0, c >> 1, m >> 1, 1 | 2);
                  var0 = null;
                  System.gc();
               } catch (Exception var4) {
                  ;
               }

               ab.setColor(0);
               ab.drawString(au, c, m, 8 | 32);
            }
         } else if(aG == 7) {
            c();
         } else {
            char();
         }
      }

   }

   public static void case() {
      if(ad == 1) {
         if(--aA < 0) {
            aA = a4.length - 1;
         }

         if(aG == 15 && aA > h.case[h.new]) {
            aA = h.case[h.new];
         }

         z = true;
         ad = -1;
      } else if(ad == 6) {
         if(++aA == a4.length) {
            aA = 0;
         }

         if(aG == 15 && aA > h.case[h.new]) {
            aA = 0;
         }

         z = true;
         ad = -1;
      } else if(ad == 8) {
         ad = -1;
         z = true;
         if(aa == 1048570) {
            if(aG == 15) {
               aG = 2;
               a4 = ai;
               aA = 0;
               aa = -1;
               return;
            }

            aA = a4.length - 1;
         }

         aa = -1;
         if(aG == 3) {
            long();
         } else if(aG == 15) {
            byte();
            aG = 0;
            c.a(aA);
         } else if(aG == 12) {
            if(aA == 0) {
               h.if();
               if(aG != 17) {
                  aG = 14;
                  a4 = aL;
                  aA = 0;
               }
            } else if(aA != a4.length - 1) {
               D = a4[aA];
               aG = 13;
               a4 = a1;
               aA = 0;
            } else {
               aG = 2;
               a4 = ai;
               aA = 0;
            }
         } else if(aG == 14) {
            if(aA != a4.length - 1) {
               h.do(a4[aA]);
            }

            if(aG != 17) {
               aG = 12;
               a4 = aO;
               aA = 0;
            }
         } else if(aG == 13) {
            if(aA == 0) {
               h.a(D);
               aA = h.case[h.new];
               aG = 15;
               a4 = goto;
            } else if(aA == 1) {
               h.if(D);
               aG = 12;
               a4 = aO;
               aA = 0;
            } else if(aA == 2) {
               aG = 12;
               a4 = aO;
               aA = 0;
            }
         } else if(aG == 1) {
            try();
         } else {
            else();
         }
      }

   }

   public static void else() {
      if(aA == 0) {
         aA = h.case[h.new];
         aG = 15;
         a4 = goto;
      } else if(aA == 1) {
         aG = 12;
         a4 = aO;
         aA = 0;
      } else if(aA == 2) {
         aA = 0;
         aG = 3;
         a4 = K;
         aX = true;
      } else if(aA == 3) {
         byte();
         if(O == null) {
            for();
         }

         aY = 0;
         aG = 7;
         aX = true;
      } else if(aA == 4) {
         aG = 6;
      } else if(aA == 5) {
         h.do();
         h.a();
         at = true;
      }

   }

   public static void try() {
      if(aA == 0) {
         byte();
         c.c += System.currentTimeMillis() - c.null;
         c.char = 1;
         aG = 0;
      } else if(aA == 1) {
         byte();
         c.a(c.B);
         aG = 0;
      } else if(aA == 2) {
         aA = 0;
         aG = 3;
         a4 = K;
         aX = false;
      } else if(aA == 3) {
         byte();
         if(O == null) {
            for();
         }

         aY = 0;
         aG = 7;
         aX = false;
      } else if(aA == 4) {
         aG = 2;
         a4 = ai;
         aA = 0;
      }

   }

   public static void long() {
      if(aA == 0) {
         I = !I;
         if(I) {
            K[0] = an;
         } else {
            K[0] = j;
         }

         if(!I) {
            byte();
         }
      } else if(aA == 1) {
         aj = !aj;
         if(aj) {
            K[1] = P;
         } else {
            K[1] = A;
         }
      } else if(aA == 2) {
         if(aX) {
            aG = 2;
            a4 = ai;
         } else {
            aG = 1;
            a4 = n;
         }

         goto();
         aA = 0;
      }

   }

   public static void void() {
      int var0 = c >> 1;
      int var1 = u;
      if(a4.length < aD >> 1) {
         var1 += (aD - a4.length) * ac >> 1;
      }

      e = aA - (aD >> 2);
      if(e + aD > a4.length) {
         e = a4.length - aD;
      }

      if(e < 0) {
         e = 0;
      }

      V = Math.max(ab.getFont().stringWidth(a4[aA]), ab.getFont().stringWidth(h.if[aA])) >> 1;

      for(int var2 = e; var2 - e < aD >> 1 && var2 < a4.length; ++var2) {
         ab.setColor(0);
         if(var2 == aA) {
            ab.setColor(155, 155, 0);
            S = var1 + (ab.getFont().getHeight() >> 1) + G;
         } else if(aG == 15 && var2 > h.case[h.new]) {
            ab.setColor(13421772);
         }

         ab.drawString(a4[var2], var0, var1, 1 | 16);
         ab.drawString(h.if[var2], var0, var1 + ac - 1, 1 | 16);
         var1 += ac << 1;
      }

   }

   public static void char() {
      int var0 = c >> 1;
      int var1;
      int var2;
      if(z) {
         if(aD == 0) {
            var1 = ab.getFont().getHeight();
            av = m - var1;
            ac = var1 + 2;
            var2 = av - a.D.byte - (Y.byte << 1);
            aD = var2 / ac;
            u = (var2 - aD * ac >> 1) + Y.byte;
            G = var1 - ay.byte >> 1;
         }

         z = false;
         ab.setColor(16777215);
         ab.fillRect(0, 0, c, m);
         if(aG == 15) {
            void();
         } else {
            var1 = u;
            if(a4.length < aD) {
               var1 += (aD - a4.length) * ac >> 1;
            }

            e = aA - (aD >> 1);
            if(e + aD > a4.length) {
               e = a4.length - aD;
            }

            if(e < 0) {
               e = 0;
            }

            V = ab.getFont().stringWidth(a4[aA]) >> 1;

            for(var2 = e; var2 - e < aD && var2 < a4.length; ++var2) {
               ab.setColor(0);
               if(var2 == aA) {
                  ab.setColor(155, 155, 0);
                  S = var1 + G;
               } else if(aG == 12 && var2 == h.new + 1) {
                  ab.setColor(155, 155, 0);
               } else if(aG == 15 && var2 > h.case[h.new]) {
                  ab.setColor(13421772);
               }

               if(aG == 13 && var2 == 1 && h.for[0].equals(D)) {
                  ab.setColor(13421772);
               }

               ab.drawString(a4[var2], var0, var1, 1 | 16);
               var1 += ac;
            }
         }

         ab.setColor(0);
         if(aG == 15) {
            ab.drawString(void, 0, m, 4 | 32);
         } else {
            ab.drawString(a4[a4.length - 1], 0, m, 4 | 32);
         }

         ab.drawString(au, c, m, 8 | 32);
      }

      ay.a((c >> 1) - V - ay.else, S);
      ax.a((c >> 1) + V, S);
      ab.setColor(16777215);
      ab.fillRect(aw, av - 22, 32, 22);
      if(aw > c) {
         W = 0;
         ak = (new Random()).nextInt() % 4;
         if(ak < 0) {
            ak = -ak;
         }

         aw = -100;
         if(ak == 0) {
            a7 = new d(a.D);
            a6 = new d(b.a[1]);
         } else if(ak == 1) {
            a7 = new d(a.D);
            a6 = new d(b.case);
         } else if(ak == 2) {
            a7 = new d(a.p);
            a6 = null;
         } else if(ak == 3) {
            a7 = new d(a.D);
            a6 = aR;
         }

         do = c - a7.else >> 1;
         if(a6 != null) {
            do -= a6.else >> 1;
         }
      }

      if(aw == do && W != -1) {
         ++W;
         if(ak == 0) {
            if(W == 1) {
               a7 = new d(a.j);
               a6 = new d(b.new);
            } else if(W == 45) {
               a7 = new d(a.byte);
            } else if(W == 115) {
               a7 = new d(a.c);
               aw -= 2;
               do -= 2;
            } else if(W == 165) {
               a7 = new d(a.byte);
               aw += 2;
               do += 2;
            } else if(W == 205) {
               W = -1;
               a7 = new d(a.D);
               a6 = new d(b.a[1]);
            }
         } else if(ak == 1) {
            if(W == 1) {
               a7 = new d(a.c);
               aw -= 2;
               do -= 2;
            } else if(W == 100) {
               aw += 2;
               do += 2;
               a7 = new d(a.byte);
            } else if(W == 160) {
               a6 = new d(b.b);
            } else if(W == 174) {
               a7 = new d(a.t);
               a6 = new d(b.c);
            } else if(W == 186) {
               a6 = null;
            } else if(W == 192) {
               a7.if = false;
               a7.null = a7.do - 1;
            } else if(W == 252) {
               aw = 1000;
            }
         } else if(ak == 2) {
            if(W == 1) {
               a7 = new d(a.H);
            } else if(W == 130) {
               a7 = new d(a.byte);
            } else if(W == 160) {
               a7 = new d(a.p);
               W = -1;
            }
         } else if(ak == 3) {
            if(W == 1) {
               a7 = new d(a.H);
            } else if(W == 130) {
               a7 = new d(a.byte);
            } else if(W == 160) {
               a7 = new d(a.D);
               aw += 2;
               W = -1;
            }
         }
      } else {
         ++aw;
      }

      var1 = aw;
      a7.a(var1, av - a7.byte);
      if(a6 != null) {
         var2 = aw + a7.else;
         if(aw == do) {
            var2 = do + 16;
            if(a.c == a7) {
               --var2;
            }
         }

         a6.a(var2, av - a6.byte);
      }

      if(++o > 50) {
         Y.if = ag.if = true;
         o = 0;
      }

      if(Y.if && (Y.null == 4 || ag.null == 4)) {
         Y.if = ag.if = false;
         Y.null = ag.null = 0;
      }

      if(e > 0) {
         Y.a(var0 - 6, u - Y.byte - 1);
      }

      if(e + aD < a4.length) {
         ag.a(var0 - 6, u + ac * aD + 1);
      }

   }

   public static void for() {
      String var0 = "";
      StringBuffer var1 = new StringBuffer();
      String var2 = "/data/help";
      DataInputStream var3 = new DataInputStream(M.getClass().getResourceAsStream(var2));

      try {
         while((var0 = var3.readUTF()) != null) {
            var1.append(var0);
            var1.append('\n');
         }

         var3.close();
      } catch (Exception var17) {
         ;
      }

      String var4 = var1.toString();
      aS = m - ab.getFont().getHeight();
      Font var5 = ab.getFont();
      aQ = (c - 9) / var5.charWidth('A');
      H = var5.getHeight() + 5;
      i = var5.getHeight() + 3;
      L = (aS - H) / i;
      aY = 0;
      O = new Object[200];
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;
      int var9 = 0;
      int var10 = 0;
      int var11 = c - 9;

      for(int var12 = 0; var12 < var4.length(); ++var12) {
         if(var4.charAt(var12) == 10 && var12 - var6 > aQ && var5.stringWidth(var4.substring(var6, var12)) > var11) {
            if(var6 < var9 - 1) {
               var8 = var9 - 1;
               var7 = var6;
               var6 = var9 + 1;
            } else {
               var8 = var6 + aQ - 1;
               var7 = var6;
               var6 += aQ;
            }

            var12 = var6;
         } else if(var4.charAt(var12) == 10) {
            if(var6 != var12 - 1) {
               var8 = var12 - 1;
               var7 = var6;
            } else {
               ++var10;
            }

            var6 = var12 + 1;
         } else if(var4.charAt(var12) == 32 && var12 - var6 > aQ && var5.stringWidth(var4.substring(var6, var12)) > var11) {
            if(var6 < var9 - 1) {
               var8 = var9 - 1;
               var7 = var6;
               var6 = var9 + 1;
            } else {
               var8 = var6 + aQ - 1;
               var7 = var6;
               var6 += aQ;
            }
         } else if(var4.charAt(var12) == 32) {
            var9 = var12;
         }

         if(var8 != 0) {
            String var13 = var4.substring(var7, var8 + 1);
            if(var13 != null && var13.length() > 1 && var13.charAt(0) == 37) {
               String var14 = var13.substring(1, var13.length());
               boolean var15 = false;

               int var16;
               for(var16 = 0; var16 < d.try.length; ++var16) {
                  if(var14.equals(d.try[var16])) {
                     var15 = true;
                     break;
                  }
               }

               if(var15) {
                  O[var10] = d.long[var16];
               } else {
                  O[var10] = var13;
               }
            } else {
               O[var10] = var13;
            }

            ++var10;
            var8 = 0;
         }
      }

      aU = var10;
   }

   public static void b() {
      if(aa == 1048571) {
         if(aY + L < aU) {
            aY = int;
            if(aY + L > aU) {
               aY = aU - L;
            }

            z = true;
         }
      } else if(ad == 6) {
         if(aY + L < aU) {
            ++aY;
            z = true;
         }
      } else if(ad == 1) {
         if(aY - 1 >= 0) {
            --aY;
            z = true;
         }
      } else if(aa == 1048570) {
         a(aF);
         if(aX) {
            aG = 2;
            a4 = ai;
         } else {
            aG = 1;
            a4 = n;
         }

         aA = 0;
         z = true;
      }

      ad = -1;
      aa = -1;
   }

   public static void c() {
      if(z) {
         ab.setColor(16777215);
         ab.fillRect(0, 0, c, m);
         ab.setColor(0);
         ab.drawLine(0, H - 2, c, H - 2);
         ab.drawString(aZ, c >> 1, 2, 1 | 16);
      }

      int var0 = H;

      int var1;
      for(var1 = aY; var1 - aY < L && var1 < aU && var0 < aS; ++var1) {
         int = var1;
         if(O[var1] != null) {
            if(O[var1].toString() == null) {
               d var2 = (d)O[var1];
               ab.setColor(16777215);
               ab.fillRect(2, var0, var2.else, var2.byte);
               var2.a(2, var0);
               var0 += var2.byte + 2;
            } else {
               ab.setColor(0);
               ab.drawString((String)O[var1], 2, var0, 4 | 16);
               var0 += i;
            }
         } else {
            var0 += i;
         }
      }

      if(z) {
         var1 = aS - H;
         int var4 = var1 * L / aU;
         ab.setColor(13421772);
         ab.fillRect(c - 5, H, 5, var1);
         int var3 = (var1 - var4) * aY / (aU - L);
         ab.setColor(16742263);
         ab.fillRect(c - 4, var3 + H, 3, var4);
         ab.setColor(11158596);
         ab.drawRect(c - 5, var3 + H, 4, var4 - 1);
         ab.setColor(0);
         ab.drawString(void, 0, m, 4 | 32);
         ab.drawString(as, c, m, 8 | 32);
      }

      z = false;
   }

   public static void a() {
      try {
         RecordStore var0 = RecordStore.openRecordStore("c", true);
         byte[] var1;
         if(var0.getNumRecords() == 0) {
            var1 = new byte[]{(byte)0, (byte)0};
            var0.addRecord(var1, 0, var1.length);
         } else {
            var1 = var0.getRecord(1);
         }

         I = var1[0] == 1;
         aj = var1[1] == 1;
         if(I) {
            K[0] = an;
         } else {
            K[0] = j;
         }

         if(aj) {
            K[1] = P;
         } else {
            K[1] = A;
         }

         var0.closeRecordStore();
         System.gc();
      } catch (Exception var2) {
         ;
      }

   }

   public static void goto() {
      try {
         RecordStore var0 = RecordStore.openRecordStore("c", true);
         byte[] var1 = new byte[2];
         if(I) {
            var1[0] = 1;
         } else {
            var1[0] = 0;
         }

         if(aj) {
            var1[1] = 1;
         } else {
            var1[1] = 0;
         }

         var0.setRecord(1, var1, 0, var1.length);
         var0.closeRecordStore();
      } catch (Exception var2) {
         ;
      }

   }

   public static void if(int var0) {
      if(aj && System.currentTimeMillis() > Q + (long)150) {
         try {
            Player var1 = Manager.createPlayer(M.getClass().getResourceAsStream("/data/vibrator.imy"), "audio/imelody");
            var1.setLoopCount(1);
            var1.prefetch();
            var1.start();
            var1 = null;
            Q = System.currentTimeMillis();
         } catch (Exception var2) {
            ;
         }
      }

   }

   public static Player a(String var0, String var1) {
      Player var2 = null;

      try {
         var2 = Manager.createPlayer(M.getClass().getResourceAsStream("/data/".concat(String.valueOf(String.valueOf(var0)))), var1);
         var2.prefetch();
      } catch (Exception var4) {
         ;
      }

      return var2;
   }

   public static void byte() {
      if((N == aF || N == y) && N.getState() == 400) {
         try {
            N.stop();
         } catch (Exception var1) {
            ;
         }
      }

   }

   public static void a(int var0) {}

   public static void a(Player var0) {
      if(I) {
         if(N != null && N.getState() == 400) {
            return;
         }

         if(a.I && var0 == else) {
            a.I = false;
         }

         try {
            var0.start();
            N = var0;
         } catch (Exception var2) {
            ;
         }
      }

   }

   public static void int() {
      an = a("SoundON");
      j = a("SoundOFF");
      P = a("VibraON");
      A = a("VibraOFF");
      a2 = a("Loading_level");
      t = a("completed");
      aZ = a("Help");
      aq = a("About");
      d = a("Level");
      al = a("turns");
      af = a("cannons");
      s = a("min");
      aH = a("sec");
      a3 = a("NewBestTime");
      ae = a("Besttime");
      x = a("PressAnyKey");
      au = a("OK");
      ap = a("Exit");
      void = a("Quit");
      as = a("Down");
      am = a("Please_wait");
      T = a("Error");
      f = a("Not_enough_memory!");
      aV = a("Delete_some_levels");
      aW = a("and_try_again");
      String[] var0 = new String[]{a("Start"), a("Level_set"), a("Options"), aZ, aq, ap};
      ai = var0;
      String[] var1 = new String[]{a("Resume"), a("Restart"), ai[2], ai[3], void};
      n = var1;
      K = new String[3];
      K[2] = void;
      aO = new String[3];
      aO[0] = a("Download");
      aO[1] = a("Standart");
      aO[2] = void;
      a1 = new String[3];
      a1[0] = a("Play");
      a1[1] = a("Delete");
      a1[2] = void;
      ao = a("Couldnt_connect");
      String var2 = f.a("Robo2Http");
      if(var2 != null) {
         E = var2;
      }

      f.if = null;
      System.gc();
   }

   public static final String a(String var0) {
      String var1 = f.a(var0);
      return var1 != null?var1:var0;
   }

}
