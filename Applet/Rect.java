import java.applet.*;
import java.awt.*;

public class Rect extends Applet {
    public void paint(Graphics g) {
        g.drawRect(40, 50, 100, 80);
        g.fillRect(40, 200, 100, 80);
    }
}