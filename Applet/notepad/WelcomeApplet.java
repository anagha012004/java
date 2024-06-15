import java.awt.*;
import java.applet.*;
public class WelcomeApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("Welcome",20,20);
    }
    public void init(){
        setSize(20,20);

    }
    public void start(){
        setStatus("Department of CSE");
    }
   
    public void destory(){
        setStatus("Department of CSE");
    }
    public void setStatus(String message){
        showStatus(message);
    }

}