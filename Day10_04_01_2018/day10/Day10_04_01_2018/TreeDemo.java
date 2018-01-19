import java.awt.*;
import javax.swing.tree.*;
import javax.swing.*;
public class TreeDemo extends JFrame
{
	TreeDemo()
	{
		setLayout(new FlowLayout());
		DefaultMutableTreeNode a=new DefaultMutableTreeNode("Main");
		DefaultMutableTreeNode b=new DefaultMutableTreeNode("Pictures");
		DefaultMutableTreeNode c=new DefaultMutableTreeNode("Videos");
		DefaultMutableTreeNode b1=new DefaultMutableTreeNode("Natural");
		DefaultMutableTreeNode b2=new DefaultMutableTreeNode("Animal");
		DefaultMutableTreeNode c1=new DefaultMutableTreeNode("Tamil");
		DefaultMutableTreeNode c2=new DefaultMutableTreeNode("English");
		a.add(b);
		a.add(c);
		b.add(b1);
		b.add(b2);
		c.add(c1);
		c.add(c2);		
		JTree jt=new JTree(a);
		add(jt);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}
	public static void main(String as[])
	{
		JFrame jf=new TreeDemo();
		jf.setVisible(true);
		jf.setSize(300,400);
	}
}