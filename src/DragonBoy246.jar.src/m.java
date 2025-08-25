import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.TextBox;
import main.GameMidlet;
import main.a;

final class m implements CommandListener {
  private cd a;
  
  private final TextBox b;
  
  m(cd paramcd, TextBox paramTextBox) {
    this.a = paramcd;
    this.b = paramTextBox;
  }
  
  public final void commandAction(Command paramCommand, Displayable paramDisplayable) {
    if (paramCommand.getLabel().equals(aw.br))
      this.a.a(this.b.getString()); 
    dg.a(GameMidlet.f);
    a.h.setFullScreenMode(true);
    this.a.h = true;
  }
}


/* Location:              C:\Users\aczaa\Downloads\DragonBoy246.jar!\m.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       1.1.3
 */