import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class EventPane extends JFrame implements MouseMotionListener
{
	JLabel point;
	int x,y;	
	public EventPane()
	{
		setSize(700,600);	
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