import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=User height=600 width=600></applet>*/
public class User extends Applet
{
	int i;
	public void init()
	{
		setBackground(Color.BLUE);
		FlowLayout f=new FlowLayout(FlowLayout.LEFT);
		setLayout(f);
		GridLayout g=new GridLayout(6,2);
		
		BorderLayout b=new BorderLayout(5,5);
		Panel p=new Panel();
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		Panel p5=new Panel();
		Panel p6=new Panel();
		Panel p7=new Panel();
		Panel p8=new Panel();
		Panel p9=new Panel();
		Panel p10=new Panel();
		Panel p11=new Panel();
		Panel p12=new Panel();
		Panel p13=new Panel();
		p.setLayout(g);
		p2.setLayout(f);		
		p3.setLayout(f);
		p4.setLayout(f);
		p5.setLayout(f);
		p6.setLayout(f);
		p7.setLayout(f);
		p8.setLayout(f);
		p9.setLayout(f);
		p10.setLayout(f);


		Label na=new Label("NAME");
		Label ag=new Label("AGE");
		Label db=new Label("DOB");
		Label gen=new Label("GENDER");
		Label ql=new Label("QUALIFICATION");
		

		TextField tf=new TextField(10);
		TextField tf1=new TextField(3);

		Button bt=new Button("REGISTER");
		
		CheckboxGroup cb=new CheckboxGroup();
		Checkbox cb1=new Checkbox("MALE",cb,false);
		Checkbox cb2=new Checkbox("FEMALE",cb,false);
		

		
		Choice c1=new Choice();
		for(i=1;i<=31;i++)
		{
			c1.add(""+i);
		}
		Choice c2=new Choice();
		for(i=1;i<=12;i++)
		{
			c2.add(""+i);
		}
		Choice c3=new Choice();
		for(i=1980;i<=2013;i++)
		{
			c3.add(""+i);
		}
		

		Choice c4=new Choice();
		c4.add("B.E");
		c4.add("M.E");
		c4.add("BCA");
		c4.add("MCA");
		
		p1.add(na);p1.setBackground(Color.MAGENTA);
		p2.add(tf);p2.setBackground(Color.YELLOW);
		p3.add(ag);p3.setBackground(Color.YELLOW);
		p4.add(tf1);p4.setBackground(Color.MAGENTA);
		p5.add(db);p5.setBackground(Color.MAGENTA);
		p6.add(c1);p6.add(c2);p6.add(c3);p6.setBackground(Color.YELLOW);
		p7.add(gen);p7.setBackground(Color.YELLOW);
		p8.add(cb1);p8.setBackground(Color.MAGENTA);p8.add(cb2);
		p9.add(ql);p9.setBackground(Color.MAGENTA);
		p10.add(c4);p10.setBackground(Color.YELLOW);
		p11.add(bt);p11.setBackground(Color.YELLOW);
		


		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5);
		p.add(p6);
		p.add(p7);
		p.add(p8);
		p.add(p9);
		p.add(p10);
		p.add(p11);
	
		
		add(p);
		

	}
}
