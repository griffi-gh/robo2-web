import java.io.InputStream;
import java.util.Random;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class c {

   public static final int q = 12;
   public static final int A = 12;
   public static final int long = 0;
   public static final int E = 1;
   public static final int D = 2;
   public static final int z = 3;
   public static final int b = 4;
   public static final int else = 5;
   public static final int f = 6;
   public static Image e;
   static int m;
   static int v;
   static int j;
   static int h;
   public static b[][] int;
   public static b[] goto;
   public static short[] r;
   public static short[] p;
   public static int[] x;
   public static int[] do;
   public static int if;
   public static int byte;
   static int G;
   static int F;
   static int a;
   static int new;
   public static boolean y;
   public static int B = 1;
   public static boolean try = false;
   public static boolean w = true;
   public static long c;
   public static long null;
   public static d t;
   public static d u;
   public static byte char = 1;
   static g C;
   public static int o;
   public static int n;
   public static int g;
   public static int d;
   public static int k;
   public static int s;
   public static final int[] for = new int[]{1, 17, 19, 14, 16, 1, 7, 11, 18, 10, 6, 12, 5, 9, 8, 13};
   public static i[] case = null;
   public static i void;
   public static int i;
   public static int l;


   public static void for() {
      a.if();
      b.if();
      t = new d("clock", 3);
      u = new d(a.p);
      a = Game.c / 12 + 1;
      new = Game.m / 12 + 1;
      G = Game.c >> 1;
      F = Game.m >> 1;
   }

   public static void int() {
      boolean var0 = false;
      if((Game.aa == 49 || Game.aa == 51) && Game.null > 0) {
         Game.null -= 4;
         if(Game.null < 0) {
            Game.null = 0;
         }

         var0 = true;
      }

      if((Game.aa == 49 || Game.aa == 55) && Game.b > 0) {
         b -= 4;
         if(Game.b < 0) {
            b = 0;
         }

         var0 = true;
      }

      if((Game.aa == 55 || Game.aa == 57) && Game.null + Game.m < (byte << 3) + (byte << 2) - 1) {
         Game.null += 4;
         if(Game.null + Game.m >= (byte << 3) + (byte << 2)) {
            Game.null = (byte << 3) + (byte << 2) - Game.m - 1;
         }

         var0 = true;
      }

      if((Game.aa == 51 || Game.aa == 57) && Game.b + Game.c < (if << 3) + (if << 2) - 1) {
         b += 4;
         if(Game.b + Game.c >= (if << 3) + (if << 2)) {
            b = (if << 3) + (if << 2) - Game.c - 1;
         }

         var0 = true;
      }

      if(var0) {
         y = true;
         new();
      }

      g var1 = C;

      int var3;
      int var4;
      for(b var2 = null; var1 != null; var1 = var1.int) {
         var2 = var1.a;
         if(var1.if != 0) {
            --var1.if;
            if(var2.try == 0) {
               if(var1.if == 0) {
                  var2.int = null;
               } else if(var1.if > 5) {
                  Game.a(Game.case);
               }
            }

            if(var2.try == 5) {
               var2.d ^= 8;
               if(var1.if > 10) {
                  Game.a(Game.aI);
               } else if(var1.if == 0) {
                  var1.a.d &= -13;
                  var2.try = 0;
                  var2.a(var1.for, var1.do);
                  w = true;
               }
            }

            if(var1.if == 0 && var2.try == 6) {
               var3 = var1.for;
               var4 = var1.do;
               b.if(var3 - 1, var4);
               b.if(var3 + 1, var4);
               b.if(var3, var4 - 1);
               b.if(var3, var4 + 1);
               var1.a.d &= -13;
               var2.try = 0;
               var2.a(var3, var4);
               w = true;
            }
         }

         if(var1.if == 0) {
            var1.a.d &= -13;
            if(var1.int != null) {
               var1.int.new = var1.new;
            }

            if(var1.new != null) {
               var1.new.int = var1.int;
            }

            if(var1 == C) {
               C = var1.int;
            }
         }
      }

      var3 = goto.length;

      while(var3 != 0) {
         --var3;
         var4 = x[var3] + do[var3];
         if(var4 > 0 && var4 < 255) {
            x[var3] = var4;
         } else {
            do[var3] = -do[var3];
         }
      }

      a.for();
      if(w) {
         try();
      }

      char = 1;
   }

   public static void new() {
      if(!y) {
         if(a.x - Game.b < 40 || a.x + 40 > Game.b + Game.c) {
            b = a.x - G;
         }

         if(a.w - Game.null < 40 || a.w + 40 > Game.null + Game.m) {
            Game.null = a.w - F;
         }

         if(Game.b < 0) {
            b = 0;
         }

         if(Game.null < 0) {
            Game.null = 0;
         }

         if(Game.b + Game.c > k) {
            b = k - Game.c;
         }

         if(Game.null + Game.m > s) {
            Game.null = s - Game.m;
         }
      }

      while(Game.b < g) {
         g -= 12;
         --o;
      }

      while(Game.b > g + 12) {
         g += 12;
         ++o;
      }

      while(Game.null < d) {
         d -= 12;
         --n;
      }

      while(Game.null > d + 12) {
         d += 12;
         ++n;
      }

      if();
   }

   public static void if() {
      if(o != j || n != h) {
         boolean var0 = true;
         if(j < 0 || h < 0) {
            var0 = false;
         }

         Graphics var1 = e.getGraphics();
         int var4 = j - o;
         int var5 = h - n;
         j = o;
         h = n;
         int var6 = 0;
         boolean var7 = false;
         int var10 = j + a + 1;
         if(var10 > if) {
            var10 = if;
         }

         int var11 = h + new + 1;
         if(var11 > byte) {
            var11 = byte;
         }

         b var12 = null;
         b[] var13 = null;

         for(int var8 = j; var8 < var10; ++var8) {
            int var18 = 0;
            var13 = int[var8];

            for(int var9 = h; var9 < var11; ++var9) {
               var12 = var13[var9];
               d var14 = var12.int;
               int var2 = var12.d;
               if(var12.try != 1 && var12.try != 3) {
                  var2 = 0;
               }

               if(var0) {
                  int var15 = var4 + var8;
                  int var16 = var5 + var9;
                  if(var15 >= 0 && var16 >= 0 && var15 < if && var16 < byte) {
                     b var17 = int[var15][var16];
                     int var3 = var17.d;
                     if(var17.try != 1 && var17.try != 3) {
                        var3 = 0;
                     }

                     if(var2 == var3 && (var12.try != 2 && var17.try != 2 || var12.try == 2 && var17.int == var14)) {
                        var18 += 12;
                        continue;
                     }
                  }
               }

               b.if[var2].a(var1, var6, var18);
               var12.int();
               var18 += 12;
            }

            var6 += 12;
         }

      }
   }

   public static void a() {
      int var0;
      if(char == 1) {
         Game.ab.translate(-Game.b, -Game.null);
         Game.ab.drawImage(e, g, d, 20);
         int var2 = j + a + 1;
         if(var2 > if) {
            var2 = if;
         }

         int var3 = h + new + 1;
         if(var3 > byte) {
            var3 = byte;
         }

         b var4 = null;
         b[] var5 = null;

         for(var0 = j; var0 < var2; ++var0) {
            var5 = int[var0];

            for(int var1 = h; var1 < var3; ++var1) {
               var4 = var5[var1];
               if(var4.int != null) {
                  var4.a();
               }
            }
         }

         var0 = goto.length;

         while(var0 != 0) {
            --var0;
            if(case[var0] != null) {
               Game.ab.setColor(x[var0], 89, 255 - x[var0]);
               case[var0].a();
            }
         }

         a.do();
         Game.ab.translate(-Game.ab.getTranslateX(), -Game.ab.getTranslateY());
      } else if(char == 4) {
         var0 = (Game.c >> 1) - 28;
         if(c != (long)0) {
            long var9 = System.currentTimeMillis() - c;
            boolean var11 = h.a(var9, B);
            int var12 = (int)var9 / '\uea60';
            int var13 = (int)(var9 % (long)'\uea60') / 1000;
            StringBuffer var6 = new StringBuffer();
            var6.append(Game.ae);
            var6.append(' ');
            var12 = (int)(var9 / (long)'\uea60');
            var13 = (int)(var9 % (long)'\uea60' / (long)1000);
            if(var12 < 10) {
               var6.append('0');
            }

            var6.append(Integer.toString(var12));
            var6.append(':');
            if(var13 < 10) {
               var6.append('0');
            }

            var6.append(Integer.toString(var13));
            Game.ab.setColor(16777215);
            Game.ab.fillRect(0, 0, Game.c, Game.m);
            Game.ab.setColor(0);
            Game.ab.drawString(String.valueOf(String.valueOf((new StringBuffer(String.valueOf(String.valueOf(Game.d)))).append(" ").append(B + 1).append(" ").append(Game.t))), Game.c >> 1, 30, 1 | 16);
            if(var12 > 0) {
               Game.ab.drawString(String.valueOf(String.valueOf((new StringBuffer(String.valueOf(String.valueOf(var12)))).append(" ").append(Game.s).append(" ").append(var13).append(" ").append(Game.aH))), var0 + 16, 50, 4 | 16);
            } else {
               Game.ab.drawString(String.valueOf(String.valueOf((new StringBuffer(String.valueOf(String.valueOf(var13)))).append(" ").append(Game.aH))), var0 + 16, 50, 4 | 16);
            }

            Game.ab.drawString(String.valueOf(String.valueOf((new StringBuffer(String.valueOf(String.valueOf(a.for)))).append(" ").append(Game.al))), var0 + 16, 75, 4 | 16);
            c = 0L;
            if(var11) {
               Game.ab.setColor(16711680);
               Game.ab.drawString(Game.a3, Game.c >> 1, 100, 1 | 16);
               Game.ab.setColor(0);
            } else {
               long var7 = h.try[B];
               var6 = new StringBuffer();
               var6.append(Game.ae);
               var6.append(' ');
               var12 = (int)(var7 / (long)'\uea60');
               var13 = (int)(var7 % (long)'\uea60' / (long)1000);
               if(var12 < 10) {
                  var6.append('0');
               }

               var6.append(Integer.toString(var12));
               var6.append(':');
               if(var13 < 10) {
                  var6.append('0');
               }

               var6.append(Integer.toString(var13));
               Game.ab.drawString(var6.toString(), Game.c >> 1, 100, 1 | 16);
            }
         }

         t.a(var0, 47);
         u.a(var0, 72);
         if(t.null == 0) {
            Game.ab.setColor(0);
            Game.ab.drawString(Game.x, Game.c >> 1, Game.m - 1, 1 | 32);
         } else if(t.null == 1) {
            Game.ab.setColor(16777215);
            Game.ab.drawString(Game.x, Game.c >> 1, Game.m - 1, 1 | 32);
         }
      } else if(char == 5) {
         Game.ab.setColor(16777215);
         Game.ab.fillRect(0, 0, Game.c, Game.m);
         Game.ab.setColor(0);
         Game.ab.drawString(Game.a2, Game.c >> 1, Game.m >> 1, 1 | 16);
      } else if(char == 6) {
         Game.ab.setColor(16777215);
         Game.ab.fillRect(0, 0, Game.c, Game.m);
         d var10 = new d("win");
         var10.a(Game.c - var10.else >> 1, Game.m - var10.byte >> 1);
         var10 = null;
         System.gc();
      }

   }

   public static void do() {
      Game.a(Game.long);
      Game.ad = -1;

      while(Game.ad == -1) {
         char = 4;
         Game.try.repaint();
         Game.try.serviceRepaints();

         try {
            Thread.sleep(100L);
         } catch (Exception var1) {
            ;
         }
      }

      a(B + 1);
      Game.ad = -1;
   }

   public static void a(int var0) {
      int = null;
      goto = null;
      p = null;
      r = null;
      do = null;
      x = null;
      case = null;
      C = null;
      System.gc();
      if(var0 == h.byte[h.new]) {
         Game.ad = -1;
         Game.a(Game.aJ);
         char = 6;
         Game.try.repaint();
         Game.try.serviceRepaints();

         while(true) {
            if(Game.ad != -1) {
               Game.aA = 0;
               Game.z = true;
               Game.aG = 2;
               Game.a4 = Game.ai;
               Game.ad = -1;
               break;
            }
         }
      } else {
         char = 5;
         Game.try.repaint();
         Game.try.serviceRepaints();
         Game.a(Game.aJ);
         char = 5;
         int var3 = 0;
         System.gc();
         InputStream var4 = null;

         int var1;
         int var2;
         int var5;
         try {
            var4 = h.a(var0);
            if(var4 != null) {
               if = var4.read();
               byte = var4.read();
               b.a(var4.read());
               var5 = 0;
               int var6 = 0;
               int var7 = if;
               int var8 = byte;
               if(if < a) {
                  if = a;
                  var5 = if - var7 >> 1;
               }

               if(byte < new) {
                  byte = new;
                  var6 = byte - var8 >> 1;
               }

               int = new b[if][byte];
               k = if * 12;
               s = byte * 12;
               int var9 = 0;
               boolean var10 = false;

               for(var1 = 0; var1 < if; ++var1) {
                  for(var2 = 0; var2 < byte; ++var2) {
                     if(var1 >= var5 && var2 >= var6 && var1 < var5 + var7 && var2 < var6 + var8) {
                        boolean var11 = false;
                        byte var18;
                        if(!var10) {
                           var9 = var4.read();
                           if(var9 < 0) {
                              var9 += 256;
                           }

                           var18 = (byte)((var9 & 240) >> 4);
                           var10 = true;
                        } else {
                           var18 = (byte)(var9 & 15);
                           var10 = false;
                        }

                        if(var18 == 11) {
                           a.F = var1;
                           E = var2;
                           a.x = var1 * 12;
                           a.w = var2 * 12;
                           var18 = 0;
                        }

                        int[var1][var2] = new b(var18, var1, var2);
                        if(int[var1][var2].try == 5) {
                           ++var3;
                        }
                     } else {
                        int[var1][var2] = new b((byte)0, var1, var2);
                     }
                  }
               }

               var4.close();
            }
         } catch (Exception var12) {
            ;
         }

         goto = new b[var3];
         r = new short[var3];
         p = new short[var3];
         x = new int[var3];
         do = new int[var3];
         case = new i[var3];
         var5 = 0;
         Random var13 = new Random();
         Random var14 = new Random(1456017315L);
         var1 = if;

         while(var1 != 0) {
            --var1;
            b[] var15 = int[var1];
            var2 = byte;

            while(var2 != 0) {
               --var2;
               b var16 = var15[var2];
               int var17;
               if(var16.try == 5) {
                  goto[var5] = var16;
                  var17 = var13.nextInt() % 255;
                  if(var17 < 0) {
                     var17 = -var17;
                  }

                  x[var5] = var17;
                  var17 = var13.nextInt() % 5;
                  if(var17 < 0) {
                     var17 = -var17;
                  }

                  ++var17;
                  do[var5] = var17;
                  r[var5] = (short)var1;
                  p[var5] = (short)var2;
                  ++var5;
               } else if(var16.try == 1) {
                  var17 = for[(a(var1 - 1, var2) << 0) + (a(var1, var2 - 1) << 1) + (a(var1 + 1, var2) << 2) + (a(var1, var2 + 1) << 3)];
                  if(var17 == 1) {
                     var17 = var14.nextInt() % 3;
                     if(var17 < 0) {
                        var17 = -var17;
                     }

                     ++var17;
                  }

                  var16.d = (byte)var17;
               }
            }
         }

         B = var0;
         h = -1;
         j = -1;
         n = 0;
         o = 0;
         g = 0;
         d = 0;
         new();
         a.B = 0;
         a.if = 0;
         a.o = a.byte;
         a.null = 0;
         a.for = 0;
         try();
         char = 1;
         Game.ad = -1;
         System.gc();
         c = System.currentTimeMillis();
      }

   }

   public static int a(int var0, int var1) {
      return var0 >= 0 && var1 >= 0 && var0 < if && var1 < byte && (int[var0][var1].try == 1 || int[var0][var1].try == 3)?1:0;
   }

   public static i a(int var0, int var1, int var2, int var3, int var4) {
      var0 += 6 + (var2 << 2) + (var2 << 1);
      var1 += 6 + (var3 << 2) + (var3 << 1);
      i var5 = new i(var0, var1);
      if(var4 != -1) {
         if(var3 == 1) {
            var5.int -= 6;
         } else if(var2 == 1 && var4 == 1) {
            var5.do -= 6;
         } else if(var2 == -1 && var4 == 0) {
            var5.do += 6;
         }
      }

      return var5;
   }

   public static void try() {
      char = 1;
      int var0 = if;

      while(var0 != 0) {
         --var0;
         b[] var2 = int[var0];
         int var1 = byte;

         while(var1 != 0) {
            --var1;
            b var3 = var2[var1];
            if(var3.try == 0 || var3.try == 4) {
               var3.d &= -3;
            }
         }
      }

      w = false;
      int var8 = goto.length;

      while(var8 != 0) {
         --var8;
         if(goto[var8].try == 5 && a.d != goto[var8]) {
            try = false;
            short var6 = r[var8];
            short var7 = p[var8];
            int var9 = goto[var8].d & 3;
            byte var4 = 0;
            byte var5 = 0;
            if(var9 == 0) {
               var5 = 1;
            } else if(var9 == 1) {
               var4 = 1;
            } else if(var9 == 2) {
               var5 = -1;
            } else if(var9 == 3) {
               var4 = -1;
            }

            void = a(goto[var8].null, goto[var8].long, var4, var5, -1);
            case[var8] = void;
            a(var6 + var4, var7 + var5, var4, var5);
            if(try) {
               int[var6][var7].a(var6, var7);
            }
         } else {
            case[var8] = null;
         }
      }

   }

   public static void a(int var0, int var1, int var2, int var3) {
      if(var0 >= 0 && var1 >= 0 && var0 < if && var1 < byte) {
         int var4 = int[var0][var1].try;
         if(var4 == 0 && a.F == var0 && a.E == var1 && a.B == 0) {
            a.a();
         } else {
            if(var4 == 0) {
               int[var0][var1].d |= 2;
               void.a += (var2 << 3) + (var2 << 2);
               void.for += (var3 << 3) + (var3 << 2);
               a(var0 + var2, var1 + var3, var2, var3);
               return;
            }

            if(var4 == 4) {
               b var5 = int[var0][var1];
               if(var5 == a.d) {
                  return;
               }

               var5.d |= 2;
               if(var3 == -1) {
                  void.for -= 6;
               } else if(var2 == 1 && (var5.d & 1) == 0) {
                  void.a += 6;
               } else if(var2 == -1 && (var5.d & 1) == 1) {
                  void.a -= 6;
               }

               int var6 = var2;
               if((var5.d & 1) == 1) {
                  var2 = -var3;
                  var3 = -var6;
               } else {
                  var2 = var3;
                  var3 = var6;
               }

               void.if = a(var5.null, var5.long, var2, var3, var5.d & 1);
               void = void.if;
               a(var0 + var2, var1 + var3, var2, var3);
            } else if(var4 == 5) {
               int var8 = int[var0][var1].d & 3;
               byte var9 = 0;
               byte var7 = 0;
               if(var8 == 0) {
                  var7 = -1;
               } else if(var8 == 1) {
                  var9 = -1;
               } else if(var8 == 2) {
                  var7 = 1;
               } else if(var8 == 3) {
                  var9 = 1;
               }

               if(var9 == var2 && var7 == var3) {
                  try = true;
               }

               int[var0][var1].a(var0, var1);
            } else if(var4 == 6) {
               int[var0][var1].a(var0, var1);
            }
         }

      }
   }

}
