import java.applet.*;
import java.awt.*;
/*<applet code=AppletDemo width=300 height=300></applet>*/
public class AppletDemo extends Applet
{
public void init()
{
setBackground(Color.YELLOW);
setForeground(Color.BLACK);
}
public void paint(Graphics g)
{
g.setColor(Color.BLUE);
int x[]={50,100,10,50};
int y[]={50,120,120,50};
g.fillPolygon(x,y,4);
g.setColor(Color.RED);
int a[]={50,140,200,100,50};
int b[]={50,10,80,120,50};
g.fillPolygon(a,b,5);
g.setColor(Color.BLUE);
int c[]={100,200,200,100,100};
int d[]={120,80,150,200,120};
g.fillPolygon(c,d,5);
g.setColor(Color.GREEN);
int e[]={10,100,100,10,10};
int f[]={120,120,200,200,120};
g.fillPolygon(e,f,5);
g.setColor(Color.WHITE);
g.fillOval(35,85,30,30);
int i[]={35,75,75,35,35};
int h[]={160,160,200,200,160};
g.fillPolygon(i,h,5);
g.setColor(Color.BLACK);
int j[]={35,65,65,35,35};
int k[]={170,165,200,200,170};
g.fillPolygon(j,k,5);
}
}