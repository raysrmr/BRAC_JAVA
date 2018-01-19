import java.applet.*;
import java.awt.*;
/*<applet code=BallDemo1 width=1000 height=1000></applet>*/
public class BallDemo1 extends Applet
{
 public int x,y;
public void init()
{
setBackground(Color.WHITE);
setForeground(Color.RED);
}
public void paint(Graphics g)
{
try{
for(int i=0;i<=3;i++)
{
y=35;
while(y<=670)
{
g.setColor(Color.WHITE);
g.fillOval(46,y-50,40,40);
g.fillOval(196,y-50,40,40);
g.fillOval(346,y-50,40,40);
g.fillOval(496,y-50,40,40);
g.fillOval(646,y-50,40,40);
g.fillOval(846,y-50,40,40);
g.setColor(Color.RED);
Thread t=new Thread();
g.fillOval(46,y,40,40);
g.setColor(Color.BLUE);
g.fillOval(196,y,40,40);
g.setColor(Color.GREEN);
g.fillOval(346,y,40,40);
g.setColor(Color.PINK);
g.fillOval(496,y,40,40);
g.setColor(Color.BLACK);
g.fillOval(646,y,40,40);
g.setColor(Color.YELLOW);
g.fillOval(846,y,40,40);
t.sleep(300);
y=y+50;
}
while(y>=35)
{
g.setColor(Color.WHITE);
g.fillOval(46,y+50,40,40);
g.fillOval(196,y+50,40,40);
g.fillOval(346,y+50,40,40);
g.fillOval(496,y+50,40,40);
g.fillOval(646,y+50,40,40);
g.fillOval(846,y+50,40,40);
g.setColor(Color.RED);
Thread t=new Thread();
g.fillOval(46,y,40,40);
g.setColor(Color.BLUE);
g.fillOval(196,y,40,40);
g.setColor(Color.GREEN);
g.fillOval(346,y,40,40);
g.setColor(Color.PINK);
g.fillOval(496,y,40,40);
g.setColor(Color.BLACK);
g.fillOval(646,y,40,40);
g.setColor(Color.YELLOW);
g.fillOval(846,y,40,40);
t.sleep(300);
y=y-50;
}
}
}catch(Exception e)
{
}
}
}