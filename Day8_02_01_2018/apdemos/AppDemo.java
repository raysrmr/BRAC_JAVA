import java.applet.*;
import java.awt.*;
/* <applet code = AppDemo width=750 height=650></applet> */
public class AppDemo extends Applet
{
   public void init()
   {
      setBackground(Color.PINK);
      setForeground(Color.BLACK);
   } 
   public void paint(Graphics g)
   {
      g.setColor(Color.GRAY);
      g.fillRect(50,600,650,25);
      g.fillRect(50,350,650,25);

      g.setColor(Color.BLACK);
      g.drawRect(50,600,650,25);
      g.drawRect(50,350,650,25);

      g.setColor(Color.RED);
      int x[]={375,50,700,375};
      int y[]={25,125,125,25};
      g.fillPolygon(x,y,4);

      g.setColor(Color.GRAY);
      g.fillOval(350,50,50,50);

      g.setColor(Color.BLACK);
      int x3[]={375,50,700,375};
      int y3[]={25,125,125,25};
      g.drawPolygon(x3,y3,4);
      g.drawOval(350,50,50,50);
      
      g.setColor(Color.WHITE);
      g.fillRect(150,125,450,225);
      g.fillRect(100,375,550,225);

      g.setColor(Color.BLACK);
      g.drawRect(150,125,450,225);
      g.drawRect(100,375,550,225);

      g.setColor(Color.ORANGE);
      g.fillRect(325,175,100,175);

      g.setColor(Color.GRAY);

      g.fillRect(300,425,150,175);

      g.fillRect(200,175,100,150);
      g.fillRect(450,175,100,150);

      g.fillRect(150,425,100,150); 
      g.fillRect(500,425,100,150);

      g.setColor(Color.BLACK);
      g.drawRect(325,175,100,175);
      g.fillRect(415,250,5,10);

      g.drawRect(200,175,100,150);
      g.drawRect(450,175,100,150);

      g.drawRect(150,425,100,150); 
      g.drawRect(500,425,100,150);

      g.drawLine(250,175,250,325);
      g.drawRect(200,225,100,50);

      g.drawLine(500,175,500,325);
      g.drawRect(450,225,100,50);

      g.drawLine(200,425,200,575);
      g.drawRect(150,475,100,50);

      g.drawLine(550,425,550,575);
      g.drawRect(500,475,100,50);

      g.setColor(Color.ORANGE);
      int x1[]={300,350,350,300,300};
      int y1[]={425,450,575,600,425};
      g.fillPolygon(x1,y1,5);

      g.setColor(Color.ORANGE);
      int x2[]={450,450,400,400,450};
      int y2[]={425,600,575,450,425};
      g.fillPolygon(x2,y2,5);


      g.setColor(Color.BLACK);
      int x4[]={300,350,350,300,300};
      int y4[]={425,450,575,600,425};
      g.drawPolygon(x4,y4,5);

      g.setColor(Color.BLACK);
      int x5[]={450,450,400,400,450};
      int y5[]={425,600,575,450,425};
      g.drawPolygon(x5,y5,5);

      g.setColor(Color.BLACK);
      g.drawRect(300,425,150,175);
      g.fillRect(340,495,5,10);
      g.fillRect(405,495,5,10);

      g.drawLine(275,600,275,615);
      g.drawLine(475,600,475,615);
      g.drawRect(250,615,250,10);

      Font f=new Font("ARIAL",Font.BOLD,30);
      g.setFont(f);
      g.drawString("STANY REMIGIOUS",40,40);

   }
}