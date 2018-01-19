import java.applet.*;
import java.awt.*;
// <applet code=Circle width = 1000 height = 1000 ></applet>
public class Circle extends Applet implements Runnable 
{
  int x=100,y=100;
  public void init()
  {
    setBackground(Color.WHITE); //Used to set the background color with color class
  }
  
  public void start()//Starts as soon as init is executed
  {
    System.out.println("From Start");
    new Thread(this).start();
  }
  public void run() {
        while (true) {
            try {
                update();
                Thread.sleep(500);

            } catch (Exception ex) {

            }
        }
    }
  public void update() {
    if(x<=300){
        x += 40;
        repaint();
        //y += 5;
  }
    else{
      while(x!=100){
        x-=40;
        try {
                //update();
                Thread.sleep(500);
                repaint();
            } catch (Exception ex) {

            }
      }
    }              
    }  
  public void paint(Graphics g) //Starts as soon as init is executed, takes Graphics class as parameter
  {
    g.setColor(Color.RED);
    
    //g.drawOval(100,100, 200,200); // (x,y) of start point, width, height --> If width = height then circle
    g.fillOval(y,x, 60,60);
   
    }
  }
