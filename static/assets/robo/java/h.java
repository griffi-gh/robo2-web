import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;
import javax.microedition.rms.RecordStoreFullException;

public class h {

   public static String[] do;
   public static short[] a;
   public static String[] for;
   public static long[] try;
   public static short[] case;
   public static short[] byte;
   public static int new;
   public static String[] if;
   public static final String[] int = new String[]{"The beggining!", "Some mirrors", "Dark forest", "Voodoo people", "Forest maze", "Green Square", "The ruins", "Rock to power", "Mirror puzzle", "Alarm system", "Ammunition", "Our office", "The Iceland", "Bomb trap", "Dragon&Dracula", "Icy lawn", "Ice alley", "Snowflake", "The Space Base", "Rocks&Rockets", "Laser field", "Long way", "Think twice", "Almost win", "Saving Eny!"};


   public static void for() {
      try {
         RecordStore var0 = RecordStore.openRecordStore("levelset", true);
         if(var0.getNumRecords() != 0) {
            byte[] var3 = var0.getRecord(1);
            ByteArrayInputStream var1 = new ByteArrayInputStream(var3);
            DataInputStream var2 = new DataInputStream(var1);
            short var4 = var2.readShort();
            new = var2.readShort();
            for = new String[var4];
            case = new short[var4];
            byte = new short[var4];

            for(int var5 = 0; var5 < var4; ++var5) {
               for[var5] = var2.readUTF();
               case[var5] = var2.readShort();
               byte[var5] = var2.readShort();
            }

            var2.close();
         } else {
            for = new String[1];
            case = new short[1];
            byte = new short[1];
            for[0] = "Standart";
            case[0] = 0;
            byte[0] = 25;
            new = 0;
            RecordStore var8 = RecordStore.openRecordStore("Standart", true);
            byte[] var9 = new byte[byte[0] << 3];
            var8.addRecord(var9, 0, var9.length);
            var8.closeRecordStore();
         }

         var0.closeRecordStore();
      } catch (Exception var6) {
         ;
      }

      String[] var7 = new String[for.length + 2];
      System.arraycopy(for, 0, var7, 1, for.length);
      var7[0] = Game.aO[0];
      var7[var7.length - 1] = Game.void;
      Game.aO = var7;
      a(for[new]);
   }

   public static void a(String var0) {
      int var1 = -1;

      int var2;
      for(var2 = 0; var2 < for.length; ++var2) {
         if(for[var2].equals(var0)) {
            var1 = var2;
            break;
         }
      }

      if(var1 != -1) {
         if(try != null) {
            do();
         }

         new = var1;
         short var3 = byte[new];
         try = new long[var3];
         DataInputStream var4 = null;
         ByteArrayInputStream var5 = null;
         int var6 = var3 + 1;
         if(new == 0) {
            var6 = 1;
         }

         byte[] var7;
         try {
            var7 = RecordStore.openRecordStore(for[new], true).getRecord(var6);
            var5 = new ByteArrayInputStream(var7);
            var4 = new DataInputStream(var5);

            for(var2 = 0; var2 < var3; ++var2) {
               try[var2] = var4.readLong();
            }
         } catch (Exception var10) {
            ;
         }

         if(new == 0) {
            if = int;
         } else {
            try {
               var7 = RecordStore.openRecordStore(for[new], true).getRecord(var6 + 1);
               var5 = new ByteArrayInputStream(var7);
               var4 = new DataInputStream(var5);
               if = new String[var3];

               for(var2 = 0; var2 < var3; ++var2) {
                  if[var2] = var4.readUTF();
               }
            } catch (Exception var9) {
               ;
            }
         }

         String[] var11 = new String[var3];
         byte var8 = 0;

         for(var2 = var8; var2 < var3; ++var2) {
            var11[var2] = if(var2);
         }

         Game.goto = var11;
      }
   }

   public static String if(int var0) {
      StringBuffer var1 = new StringBuffer();
      var1.append(Integer.toString(var0 + 1));
      var1.append(" - ");
      var1.append(" ");
      if(try[var0] == (long)0) {
         var1.append("???");
      } else {
         int var2 = (int)(try[var0] / (long)'\uea60');
         int var3 = (int)(try[var0] % (long)'\uea60' / (long)1000);
         if(var2 < 10) {
            var1.append('0');
         }

         var1.append(Integer.toString(var2));
         var1.append(':');
         if(var3 < 10) {
            var1.append('0');
         }

         var1.append(Integer.toString(var3));
      }

      return var1.toString();
   }

   public static void a() {
      try {
         RecordStore var0 = RecordStore.openRecordStore("levelset", true);
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();
         DataOutputStream var2 = new DataOutputStream(var1);
         var2.writeShort(for.length);
         var2.writeShort(new);

         for(int var4 = 0; var4 < for.length; ++var4) {
            var2.writeUTF(for[var4]);
            var2.writeShort(case[var4]);
            var2.writeShort(byte[var4]);
         }

         byte[] var3 = var1.toByteArray();
         var2.close();
         if(var0.getNumRecords() == 0) {
            var0.addRecord(var3, 0, var3.length);
         } else {
            var0.setRecord(1, var3, 0, var3.length);
         }

         var0.closeRecordStore();
      } catch (Exception var5) {
         ;
      }

   }

   public static void if() {
      if(do == null) {
         Game.aG = 16;
         Game.try.repaint();
         Game.try.serviceRepaints();
         HttpConnection var0 = null;
         DataInputStream var1 = null;
         InputStream var2 = null;
         String var3 = String.valueOf(String.valueOf(Game.E)).concat("/levels/desc");

         try {
            var0 = (HttpConnection)Connector.open(var3);
            if(var0 == null || var0.getResponseCode() != 200 || (var2 = var0.openInputStream()) == null) {
               Game.aG = 17;
               Game.z = true;
               return;
            }

            var1 = new DataInputStream(var2);
            short var4 = var1.readShort();
            do = new String[var4];
            a = new short[var4];
            Game.aL = new String[var4 + 1];
            Game.aL[var4] = Game.void;

            for(int var5 = 0; var5 < var4; ++var5) {
               Game.aL[var5] = do[var5] = var1.readUTF();
               a[var5] = var1.readShort();
            }

            if(var0 != null) {
               var0.close();
            }

            if(var1 != null) {
               var1.close();
            }
         } catch (Exception var6) {
            Game.aG = 17;
            Game.z = true;
            return;
         }

         Game.aG = 14;
      }
   }

   public static void do(String var0) {
      boolean var1 = false;
      Game.aG = 16;
      Game.try.repaint();
      Game.try.serviceRepaints();
      HttpConnection var2 = null;
      DataInputStream var3 = null;
      InputStream var4 = null;
      int var5 = -1;

      int var6;
      for(var6 = 0; var6 < do.length; ++var6) {
         if(do[var6].equals(var0)) {
            var5 = var6;
            break;
         }
      }

      for(var6 = 0; var6 < for.length; ++var6) {
         if(for[var6].equals(var0)) {
            var5 = -1;
            break;
         }
      }

      if(var5 != -1) {
         String var7 = String.valueOf(String.valueOf((new StringBuffer(String.valueOf(String.valueOf(Game.E)))).append("/levels/").append(do[var5])));
         RecordStore var8 = null;

         String[] var10;
         try {
            var8 = RecordStore.openRecordStore(do[var5], true);
            var2 = (HttpConnection)Connector.open(var7);
            if(var2 == null || var2.getResponseCode() != 200 || (var4 = var2.openInputStream()) == null) {
               Game.aG = 17;
               Game.z = true;
               return;
            }

            var3 = new DataInputStream(var4);
            short var9 = a[var5];
            var10 = null;

            int var13;
            int var14;
            byte[] var21;
            for(var6 = 0; var6 < var9; ++var6) {
               short var11 = var3.readShort();
               var21 = new byte[var11];
               int var12 = var3.read(var21);
               var13 = var12;

               for(var14 = var11 - var12; var14 > 0; var13 += var12) {
                  byte[] var15 = new byte[var14];
                  var12 = var3.read(var15);
                  var14 -= var12;
                  System.arraycopy(var15, 0, var21, var13, var12);
               }

               var8.addRecord(var21, 0, var11);
            }

            byte[] var22 = new byte[var9 << 3];
            var8.addRecord(var22, 0, var22.length);
            short var24 = var3.readShort();
            var21 = new byte[var24];
            var13 = var3.read(var21);
            var14 = var13;

            for(int var27 = var24 - var13; var27 > 0; var14 += var13) {
               byte[] var16 = new byte[var27];
               var13 = var3.read(var16);
               var27 -= var13;
               System.arraycopy(var16, 0, var21, var14, var13);
            }

            var8.addRecord(var21, 0, var24);
            var8.closeRecordStore();
         } catch (RecordStoreFullException var18) {
            try {
               RecordStore.deleteRecordStore(do[var5]);
            } catch (RecordStoreException var17) {
               ;
            }

            Game.aG = 18;
            Game.z = true;
            return;
         } catch (Exception var19) {
            Game.aG = 17;
            Game.z = true;
            return;
         }

         int var20 = for.length;
         var10 = new String[var20 + 1];
         short[] var23 = new short[var20 + 1];
         short[] var25 = new short[var20 + 1];
         System.arraycopy(for, 0, var10, 0, var20);
         System.arraycopy(case, 0, var23, 0, var20);
         System.arraycopy(byte, 0, var25, 0, var20);
         var10[var20] = var0;
         var23[var20] = 0;
         var25[var20] = a[var5];
         for = var10;
         case = var23;
         byte = var25;
         String[] var26 = new String[for.length + 2];
         System.arraycopy(for, 0, var26, 1, for.length);
         var26[0] = Game.aO[0];
         var26[var26.length - 1] = Game.void;
         Game.aO = var26;
         a();
         Game.aG = 14;
      }
   }

   public static boolean a(long var0, int var2) {
      if(var0 >= try[var2] && try[var2] != (long)0) {
         return false;
      } else {
         try[var2] = var0;
         Game.goto[var2] = if(var2);
         return true;
      }
   }

   public static void do() {
      short var0 = byte[new];
      DataOutputStream var1 = null;
      ByteArrayOutputStream var2 = null;
      int var3 = var0 + 1;
      if(new == 0) {
         var3 = 1;
      }

      try {
         var2 = new ByteArrayOutputStream();
         var1 = new DataOutputStream(var2);

         for(int var4 = 0; var4 < var0; ++var4) {
            var1.writeLong(try[var4]);
         }

         RecordStore.openRecordStore(for[new], true).setRecord(var3, var2.toByteArray(), 0, var0 << 3);
      } catch (Exception var5) {
         ;
      }

   }

   public static void if(String var0) {
      int var1 = 0;

      int var2;
      for(var2 = 0; var2 < for.length; ++var2) {
         if(for[var2].equals(var0)) {
            var1 = var2;
            break;
         }
      }

      if(var1 != 0) {
         try {
            RecordStore.deleteRecordStore(var0);
         } catch (RecordStoreException var8) {
            ;
         }

         if(new == var1) {
            a("Standart");
         } else if(new > var1) {
            --new;
         }

         int var3 = for.length - 1;
         String[] var4 = new String[var3];
         short[] var5 = new short[var3];
         short[] var6 = new short[var3];

         for(var2 = 0; var2 < var3; ++var2) {
            int var7 = var2;
            if(var2 >= var1) {
               var7 = var2 + 1;
            }

            var4[var2] = for[var7];
            var5[var2] = case[var7];
            var6[var2] = byte[var7];
         }

         for = var4;
         case = var5;
         byte = var6;
         String[] var9 = new String[for.length + 2];
         System.arraycopy(for, 0, var9, 1, for.length);
         var9[0] = Game.aO[0];
         var9[var9.length - 1] = Game.void;
         Game.aO = var9;
         a();
      }
   }

   public static InputStream a(int var0) {
      if(var0 > case[new]) {
         case[new] = (short)var0;
      }

      if(new == 0) {
         return Game.M.getClass().getResourceAsStream("/data/".concat(String.valueOf(String.valueOf(var0))));
      } else {
         ByteArrayInputStream var2;
         try {
            byte[] var1 = RecordStore.openRecordStore(for[new], true).getRecord(var0 + 1);
            var2 = new ByteArrayInputStream(var1);
            return var2;
         } catch (RecordStoreException var4) {
            var2 = null;
            return var2;
         }
      }
   }

}
