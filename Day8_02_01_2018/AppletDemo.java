import java.applet.*;
import java.awt.*;
/*<applet code=AppletDemo width=300 height=300></applet>*/
public class AppletDemo extends Applet
{
	public void init()
	{
		System.out.println("From Init");
	}
	public void start()
	{
		System.out.println("From Start");
	}
	public void stop()
	{
		System.out.println("From Stop");
	}
	public void destroy()
	{
		System.out.println("From Destroy");
	}
	public void paint(Graphics g)
	{
		System.out.println("From Paint");
	}
}