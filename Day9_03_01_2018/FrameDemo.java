import java.applet.*;
import java.awt.*;
/*<applet code=FrameDemo width=300 height=300></applet>*/
public class FrameDemo extends Applet
	{
		public void init()
		{
			Frame f=new Frame("My Window");
			f.setVisible(true);
			f.setSize(400,400);
		}
	}