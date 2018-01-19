import java.awt.*;
import javax.swing.*;
public class ImageTab extends JPanel
{
	ImageTab()
	{
		setLayout(new FlowLayout());
		ImageIcon img=new ImageIcon("rmr.jpg");
		JLabel la=new JLabel(img);
		add(la);
	}
}