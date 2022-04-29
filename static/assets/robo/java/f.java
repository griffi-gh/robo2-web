import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;

public class f {

   public static f if = null;
   private Hashtable a = new Hashtable();


   public f() {
      DataInputStream var1 = null;

      try {
         InputStream var2 = this.getClass().getResourceAsStream("/translate");
         if(var2 != null) {
            var1 = new DataInputStream(var2);
            String var3 = "";

            try {
               while((var3 = var1.readUTF()) != null && var3 != null) {
                  int var4 = var3.indexOf(58);
                  if(var4 > -1) {
                     String var5 = var3.substring(0, var4);
                     String var6 = var3.substring(var4 + 2, var3.length());
                     this.a.put(var5, var6);
                  }
               }

               return;
            } catch (Exception var18) {
               return;
            }
         }
      } catch (Exception var19) {
         return;
      } finally {
         if(var1 != null) {
            try {
               var1.close();
            } catch (Exception var17) {
               ;
            }
         }

      }

   }

   public static String a(String var0) {
      if(if == null) {
         if = new f();
      }

      return (String)if.a.get(var0);
   }

}
