import javax.swing.*;
import java.awt.*;
public class TabDesign extends JFrame
{
	public TabDesign()
	{
		JTabbedPane jtp=new JTabbedPane();
		jtp.addTab("Login",new LoginTab());
		jtp.addTab("Image",new ImageTab());
		add(jtp);
	}
}