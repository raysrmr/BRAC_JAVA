import java.applet.*;
import java.awt.*;
/*<applet code=ThreadDemo width=500 height=500></applet>*/
public class ThreadDemo extends Applet
{
   public void paint(Graphics g)
   {
    g.setColor(Color.GRAY);
    g.fillRect(60,40,100,20);
    g.fillRect(60,430,100,20);
   try{
   Thread t=new Thread();
   for(int k=1;k<=5;k++)
   {
      for(int i=60;i<=400;i++)
      {
      g.setColor(Color.RED);
      g.fillOval(60,i,30,30);
      t.sleep(5);
      g.setColor(Color.WHITE);
      g.fillOval(60,i,30,30);
      }
   g.setColor(Color.RED);
   g.fillOval(60,400,30,30);
      for(int j=400;j>=60;j--)
      {
      g.setColor(Color.RED);
      g.fillOval(60,j,30,30);
      t.sleep(5);
      g.setColor(Color.WHITE);
      g.fillOval(60,j,30,30);
      }
   g.setColor(Color.RED);
   g.fillOval(60,60,30,30);
   }
     for(int l=60;l<=400;l++)
     {
     g.setColor(Color.RED);
     g.fillOval(60,l,30,30);
     t.sleep(5);
     g.setColor(Color.WHITE);
     g.fillOval(60,l,30,30);
     }
   g.setColor(Color.RED);
   g.fillOval(60,400,30,30);
      }catch(Exception e)
         {
         System.out.println(e);
         }
   }
}
