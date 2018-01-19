import java.applet.*;
import java.awt.*;
/*<applet code=AppletDraw width=300 height=300></applet>*/
public class AppletDraw extends Applet
{
	public void init()
	{
		//setBackground(Color.BLUE);
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.setFont(new Font("ARIAL",Font.BOLD,30));
		g.drawString("Welcome to GUI",100,50);
		g.setColor(Color.RED);
		g.drawLine(200,200,300,300);
		g.drawRect(200,200,300,400);
		g.fillRect(200,200,300,400);
		g.drawOval(100,100,150,200);
		g.setColor(Color.GREEN);
		g.fillOval(100,100,150,200);
		int x[]={200,300,50,200};
		int y[]={50,250,250,50};
		g.drawPolygon(x,y,4);
	}
}




