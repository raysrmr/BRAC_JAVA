import javax.swing.*;
import java.awt.*;
/*<applet code=SwingDemo width=300 height=300></applet>*/
public class SwingDemo extends JApplet
{
	public void init()
	{
		Container con=getContentPane();
		con.setLayout(new FlowLayout());
		JLabel la=new JLabel("First Name");
		JTextField jtf=new JTextField(10);
		con.add(la);
		con.add(jtf);
	}
}