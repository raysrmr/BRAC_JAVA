import java.applet.*;
import java.awt.*;
/* <applet code = AppletDemo width=750 height=650></applet> */
public class AppletDemo extends Applet
{
   public void init()
   {
      setBackground(Color.WHITE);
      setForeground(Color.BLUE);
   } 
   public void paint(Graphics g)
   {
      g.setColor(Color.BLUE);
      g.drawRect(50,600,650,25);
      g.drawRect(50,350,650,25);

      int x[]={375,50,700,375};
      int y[]={25,125,125,25};
      g.drawPolygon(x,y,4);
      g.drawOval(350,50,50,50);

      g.drawRect(150,125,450,225);
      g.drawRect(100,375,550,225);
  
      g.drawRect(325,175,100,175);
      g.drawRect(300,425,150,175);

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

      int x1[]={300,350,350,300,300};
      int y1[]={425,450,575,600,425};
      g.drawPolygon(x1,y1,5);
      g.fillRect(340,495,5,10);

      int x2[]={450,450,400,400,450};
      int y2[]={425,600,575,450,425};
      g.drawPolygon(x2,y2,5);
      g.fillRect(405,495,5,10);

      g.drawLine(275,600,275,615);
      g.drawLine(475,600,475,615);
      g.drawRect(250,615,250,10);

     //Font f=new Font("ARIAL",Font.BOLD,30);
      //g.setFont(f);
      //g.drawString("STANY REMIGIOUS",40,40);
      //g.setColor(Color.BLACK);
      //g.drawOval(60,60,40,70);
      //g.drawOval(120,120,70,70);
      //g.setColor(Color.GREEN);
      //g.fillRect(500,500,30,30); 
   }
}