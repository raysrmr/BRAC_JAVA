import javax.swing.*;
import java.awt.*;
public class SwingFrameDemo
{
	public static void main(String as[])
	{
		JFrame jf=new JFrame();
		jf.setLayout(new FlowLayout());		
		JLabel la=new JLabel("First Name");
		JTextField jtf=new JTextField(10);
		JRadioButton male=new JRadioButton("Male");
		JRadioButton female=new JRadioButton("Female");
		ButtonGroup bg=new ButtonGroup();
		JCheckBox jcb1=new JCheckBox("Cricket");
		JCheckBox jcb2=new JCheckBox("FootBall");
		JCheckBox jcb3=new JCheckBox("Hockey");	
		JButton jb=new JButton("Click");
		bg.add(male);
		bg.add(female);
		jf.add(la);
		jf.add(jtf);
		jf.add(male);
		jf.add(female);
		jf.add(jcb1);
		jf.add(jcb2);
		jf.add(jcb3);
		jf.add(jb);
		jf.setVisible(true);
		jf.setSize(300,300);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
