import java.awt.*;
import java.applet.*;
/*
<applet code="yes" heigth=400 width=400>
</applet>
*/
public class yes extends Applet
{
public void paint(Graphics g)
{
g.drawString("hello",200,200);
g.drawLine(10,50,150,200);
setBackground(Color.red);
g.drawRect(50,50,200,200);
}
}
