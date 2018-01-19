import java.io.*;
import java.applet.*;
import java.awt.*;
/*<applet code=AppletDemo  width=1700 height=1500></applet>*/
public class AppletDemo extends Applet
{
public void init()
{
setBackground(Color.BLACK);
setForeground(Color.GRAY);
}
public void paint(Graphics g)
{
Font f=new Font("Monotype Corsiva",Font.BOLD,40);
g.setFont(f);
g.drawString("Home Sweet Home",850,650);
g.setColor(Color.YELLOW);
g.fillArc(1151,617,70,45,200,310);

g.fillArc(1215,617,70,45,200,310);
//g.setColor(Color.GRAY); 
//g.fillArc(400,560,70,45,20,120);
//g.fillArc(470,600,70,45,20,120);
//g.fillArc(500,530,70,45,20,120);
//g.fillArc(440,650,70,45,20,120);
//left top g.fillArc(60,400,70,45,20,120);
//left decaration g.fillArc(870,500,70,45,20,120);
//g.fillArc(920,550,70,45,20,120);
//g.fillArc(820,550,70,45,20,120);
//left g.fillArc(60,125,70,45,200,120);
 
//g.fillArc(1010,100,70,305,70,10);

g.setColor(Color.PINK);
g.drawLine(300,400,500,200);
g.drawLine(350,400,500,200);
g.drawLine(400,400,500,200);
g.drawLine(450,400,500,200);
g.drawLine(500,400,500,200);
g.drawLine(550,400,500,200);
g.drawLine(600,400,500,200);

g.drawLine(650,400,500,200);
g.drawLine(700,400,500,200);
//g.drawLine(350,400,600,650);
g.drawLine(300,400,700,400);

g.setColor(Color.WHITE); 
g.fillArc(1050,30,90,90,90,700);
 
 g.setColor(Color.ORANGE);

 g.drawLine(350,400,300,500);
g.drawLine(650,400,700,500);
g.drawLine(300,500,700,500);
g.setColor(Color.GRAY);
g.fillRect(450,450,80,50);
g.fillRect(800,300,20,300); 
  g.fillRect(200,300,20,300);

 g.setColor(Color.WHITE);
g.fillOval(1300,190,4,4);
g.fillOval(900,80,4,4);
g.fillOval(30,240,4,4);
g.fillOval(240,80,4,4);
g.fillOval(1010,240,4,4);
g.fillOval(1240,80,4,4);
g.fillArc(782,240,62,62,62,700);
g.fillArc(182,240,62,62,62,700);
g.setColor(Color.BLACK);
g.fillOval(1230,619,10,10);
g.fillOval(1167,619,10,10);
}
}