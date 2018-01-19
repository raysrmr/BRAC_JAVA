import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EventPanel extends JFrame implements MouseMotionListener
{
	JLabel point;
	int x,y;	
	public EventPanel()
	{
		setLayout(new FlowLayout());
		point=new JLabel("MOve or Dragge");
		add(point);
		addMouseMotionListener(this);
	}
	public void mouseMoved(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		point.setText("Mouse Moving on x="+x+"   y="+y);
		
	}
	public void mouseDragged(MouseEvent me)
	{
		x=me.getX();
		y=me.getY();
		point.setText("Mouse Dragging on x="+x+"   y="+y);
		
	}
}
public class MouseDemo
{
	public static void main(String as[])
	{
		JFrame jf=new EventPanel();
		jf.setVisible(true);
		jf.setSize(700,600);
	}
}