import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;

public class e extends Canvas implements CommandListener {

   public static Command a = new Command("", 4, 1);
   public static Command for = new Command("", 3, 1);
   public static final int do = 1048570;
   public static final int if = 1048571;


   public e() {
      this.addCommand(a);
      this.addCommand(for);
      this.setCommandListener(this);
   }

   protected void paint(Graphics var1) {
      Game.ab = var1;
      Game.new();
   }

   protected void keyPressed(int var1) {
      Game.ad = this.getGameAction(var1);
      if(var1 == 53) {
         Game.ad = 8;
      }

      Game.aa = var1;
      if(Game.ad == 6) {
         Game.ag.if = false;
         Game.ag.null = 4;
         Game.o = 0;
      } else if(Game.ad == 1) {
         Game.Y.if = false;
         Game.Y.null = 4;
         Game.o = 0;
      }

   }

   protected void keyReleased(int var1) {
      boolean var2 = true;
      int var3 = this.getGameAction(var1);
      if(var3 == 6) {
         Game.ag.if = false;
         Game.ag.null = 0;
      } else if(var3 == 1) {
         Game.Y.if = false;
         Game.Y.null = 0;
      }

      Game.ad = -1;
      Game.aa = -1;
   }

   public void commandAction(Command var1, Displayable var2) {
      if(var1 == a) {
         Game.aa = 1048570;
         Game.ad = 8;
      } else if(var1 == for) {
         Game.aa = 1048571;
         Game.ad = 8;
      }

   }

}
