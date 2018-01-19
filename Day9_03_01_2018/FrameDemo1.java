import java.applet.*;
import java.awt.*;
public class FrameDemo1
	{
		public static void main(String as[])
		{
			Frame f=new Frame("My Window");
			f.setVisible(true);
			f.setSize(400,400);
			f.setLayout(new FlowLayout());
			Label la=new Label("User Name");
			f.add(la);
			Button b=new Button("Register");
			f.add(b);
		}
	}