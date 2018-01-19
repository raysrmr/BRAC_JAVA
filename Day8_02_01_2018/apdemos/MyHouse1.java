import java.awt.*;
import java.applet.*;
public class MyHouse1 extends Applet
 {   

	      Color c2=new Color(128,255,255);
	       Color maroon=new Color(200,100,100);
	       Color gre=new Color(111,230,98);
                          Color vio=new Color(203,151,255);
	       Color lit=new Color(255,255,179);
     public void init()
	{
                         
 	      setBackground(lit);
	      setForeground(Color.BLACK);
	}
     public void paint(Graphics g)
	{
	               g.setColor(c2);
                          g.fillRect(250,600,200,100);//basement
	      g.fillRect(250,450,200,125);
                                   g.setColor(Color.YELLOW);
	       g.fillRect(275,625,25,25);//left window
                           g.fillRect(400,625,25,25);//right window
                                  g.setColor(maroon);
	       g.drawLine(275,637,300,637);// vr left window kambi 
	       g.drawLine(286,625,286,650);//hr left window kambi
                           g.drawLine(425,637,400,637);//vr rit wdw kambi
	       g.drawLine(412,625,412,650);// hr rit wdw kambi
		g.setColor(Color.YELLOW);
	       g.fillRect(275,625-100,25,25);//left window
                           g.fillRect(400,625-100,25,25);//right window
                                  g.setColor(maroon);
	       g.drawLine(275,637-100,300,637-100);// vr left window kambi 
	       g.drawLine(286,625-100,286,650-100);//hr left window kambi
                           g.drawLine(425,637-100,400,637-100);//vr rit wdw kambi
	       g.drawLine(412,625-100,412,650-100);// hr rit wdw kambi
	      
	                  g.setColor(vio);
	       g.fillRect(325,625,50,75);//Door
	       g.fillRect(200,575,300,24);//1st outer Roof
		g.setColor(new Color(128,0,128));
	       g.fillRect(225,450,25,150);//pillar left
	       g.fillRect(450,450,25,150);//pillar right
		 g.setColor(maroon);
 		for(int i=0;i<290;i+=10)
    		        {
 			g.drawLine(200+i,575,225+i,600);
		         }
                                        g.setColor(vio);
	       int x[]={350,300,400,350};
	       int y[]={400,450,450,400};
                               
	       g.fillPolygon(x,y,4);//inner triangle
		g.setColor(maroon);
	       int xx[]={350,200,500,350};
	       int yy[]={300,450,450,300};
                                   
	       g.drawPolygon(xx,yy,4);//outer triangle
	       g.fillOval(350,425,10,10);
	                      g.setColor(maroon);
	       for(int j=0;j<=250;j+=30)
		{
		          // g.drawArc(150+j,450,100,100,25,100);
			//g.drawArc(150+j,450,100,100,25,100);
			 int xxx[]={200+j,225+j,250+j,200+j};
	                                         int yyy[]={450,475,450,450};
                                                     g.fillPolygon(xxx,yyy,4);
		} 
		g.setColor(Color.PINK);
                          g.fillRect(325,500,50,75);
	      g.fillRect(600,525,13,200);
                                g.setColor(Color.YELLOW);
		g.drawLine(600,525,670,525);
		//g.drawLine(525,525,670,525);
                                        g.fillOval(670,500,10,40);
		//g.drawOval(600,500,10,40);
		int x3[]={325,370,370,325,320};
		int y3[]={625,650,700,700,625};                                   
                                              g.setColor(maroon);
		 g.fillPolygon(x3,y3,5);                 
                                          g.setColor(gre);      
                                      for(int k=0;k<800;k+=200) 
 		{         
		        int[] m1={50+k,250+k,500+k,50+k};
		        int[] m2={200,50,200,200};
             			 g.fillPolygon(m1,m2,4); 
	                     }
                                 for(int n=0;n<150;n+=10)
		{
			 g.setColor(gre);  
			g.drawLine(225,450+n,250,450+n);
			g.drawLine(450,450+n,475,450+n);
		}
		int p[]={200,300,350,400,500,350,200};
		int p1[]={450,450,400,450,450,300,450};
                                                g.setColor(new Color(128,0,128));
                                               
                                                 g.fillPolygon(p,p1,7);                      
  	}
  }
/*<applet code=MyHouse1 width=640 height=480></applet>*/
