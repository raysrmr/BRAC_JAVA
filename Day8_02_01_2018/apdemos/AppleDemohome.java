import java.io.*;
import java.applet.*;
import java.awt.*;
/*<applet code=AppleDemo width=600 height=400>
</applet>*/
public class AppleDemo extends Applet
{
public void init()
{
setForeground(Color.BLUE);
}
public void paint(Graphics g)
{
Font f=new Font("Monotype Corsiva",Font.ITALIC,25);
g.setFont(f);
//g.drawString("Home",50,50);
int x[]={90,400,500,200,90};
int y[]={70,70,150,150,70};
g.drawPolygon(x,y,4);
int a[]={90,200,5,90};
int b[]={70,150,150,70};
g.drawPolygon(a,b,3);
g.drawRect(200,150,300,150);
g.drawRect(5,150,195,150);
g.drawRect(55,200,75,100);
int x1[]={55,110,110,55,55};
int y1[]={200,220,280,300,200};
g.drawPolygon(x1,y1,5);
g.fillRect(100,240,5,25);
}
}