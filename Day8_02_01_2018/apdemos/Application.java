import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=Application width=400 height=400></applet>*/
public class Application extends Applet implements ItemListener,ActionListener
{	
	Label l1,l2,l3,l4;
	Choice ch1,ch2;
	String sf,st;
	String mm,cm,decimeter,meter,km;
	String y="Soory Select a valid option";
	TextField tf1,tf3,tf4,tf2;
	double a,b,c;
	String s1,s2,s3;
	public void init()
	{	
		/*LAYOUT*/
		BorderLayout b=new BorderLayout();
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		GridLayout g1=new GridLayout(3,2);
		//setLayout(f);
	
		/*PANEL*/

		Panel p=new Panel();
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		Panel p5=new Panel();
		Panel p6=new Panel();
		p.setLayout(g1);		

		/*Creating Choice box1*/

		l1=new Label("FROM");
		ch1=new Choice();
		ch1.add("mm");
		ch1.add("cm");
		ch1.add("decimeter");
		ch1.add("meter");
		ch1.add("km");	

		/*Creating Choice box2*/
		
		l2=new Label("TO");
		ch2=new Choice();
		ch2.add("mm");
		ch2.add("cm");
		ch2.add("decimeter");
		ch2.add("meter");
		ch2.add("km");
		add(l2);	
		add(ch2);
		
		/*TEXTFIELD*/
		
		tf1=new TextField(15);
		tf2=new TextField(15);
		
		Button bt=new Button("CALCULATE");
		
		/*SUBPANEL*/
		
		p1.add(l1);p1.setBackground(Color.YELLOW);
		p2.add(ch1);p2.add(tf1);p2.setBackground(Color.PINK);
		p3.add(l2);p3.setBackground(Color.PINK);
		p4.add(ch2);p4.add(tf2);p4.setBackground(Color.YELLOW);
		p5.add(bt);
		

		/*MAINPANEL*/

		p.add(p1,FlowLayout.LEFT);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5,BorderLayout.CENTER);	
		add(p);
		setBackground(Color.BLUE);
		
		/*ACTION & ITEM EVENT*/

		bt.addActionListener(this);
		ch1.addItemListener(this);
		ch2.addItemListener(this);
	}
	
	public void itemStateChanged(ItemEvent ie)
	{
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{	
		sf=ch1.getSelectedItem();
		st=ch2.getSelectedItem();
		s1=tf1.getText();
		a=Double.parseDouble(s1);
		
		if(sf.equals(st))
		{	s2=Double.toString(a);	tf2.setText(s2);	}

	        else if(sf.equals("mm") && st.equals("cm"))
		{	c=a/10;		repaint();	}

		else if(sf.equals("mm") && st.equals("decimeter"))
		{	c=a/100;	repaint();	}

		else if(sf.equals("mm") && st.equals("meter"))
		{	c=a/1000;	repaint();	}

		else if(sf.equals("mm") && st.equals("km"))
		{	c=a/1000000;	repaint();	}

		else if(sf.equals("cm") && st.equals("mm"))
		{	c=a*10;		repaint();	}

		else if(sf.equals("cm") && st.equals("decimeter"))
		{	c=a/10;		repaint();	}

		else if(sf.equals("cm") && st.equals("meter"))
		{	c=a/100;	repaint();	}

		else if(sf.equals("cm") && st.equals("km"))
		{	c=a/100000;	repaint();	}

		else if(sf.equals("decimeter") && st.equals("mm"))
		{	c=a*100;	repaint();	}

		else if(sf.equals("decimeter") && st.equals("cm"))
		{	c=a*10;	repaint();	}

		else if(sf.equals("decimeter") && st.equals("meter"))
		{	c=a/10;	repaint();	}

		else if(sf.equals("decimeter") && st.equals("km"))
		{	c=a/10000;	repaint();	}

		else if(sf.equals("meter") && st.equals("mm"))
		{	c=a*1000000;	repaint();	}

		else if(sf.equals("meter") && st.equals("cm"))
		{	c=a*100;	repaint();	}

		else if(sf.equals("meter") && st.equals("decimeter"))
		{	c=a*10;repaint();	}

		else if(sf.equals("meter") && st.equals("km"))
		{	c=a/1000;	repaint();	}

		else if(sf.equals("km") && st.equals("mm"))
		{	c=a*1000000000;repaint();	}

		else if(sf.equals("km") && st.equals("cm"))
		{	c=a*100000;	repaint();	}
		
		else if(sf.equals("km") && st.equals("decimeter"))
		{	c=a*10000;	repaint();	}

		else if(sf.equals("km") && st.equals("meter"))
		{	c=a*1000;	repaint();	}
					
	}

	public void paint(Graphics g)
	{	
		s2=Double.toString(c);
		tf2.setText(s2);	
	}

}