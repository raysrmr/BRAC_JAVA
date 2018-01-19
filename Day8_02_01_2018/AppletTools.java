import java.applet.*;
import java.awt.*;
/*<applet code=AppletTools width=300 height=300></applet>*/
public class AppletTools extends Applet
{
	public void init()
	{
		Label la=new Label("User Name");
		add(la);
		TextField tf=new TextField();
		add(tf);
		TextField tf1=new TextField(10);
		add(tf1);
		TextField tf3=new TextField(10);
		tf3.setEchoChar('A');
		add(tf3);
		TextArea ta=new TextArea();
		//add(ta);
		Checkbox ch=new Checkbox();
		add(ch);
		Checkbox ch1=new Checkbox("CSE");
		add(ch1);		
		Checkbox ch2=new Checkbox("EEE",true);
		add(ch2);	
		CheckboxGroup cbg=new CheckboxGroup();		
		Checkbox male=new Checkbox("Male",cbg,false);
		Checkbox female=new Checkbox("FeMale",cbg,false);
		add(male);
		add(female);
		Button b=new Button();
		add(b);
		Button b1=new Button("Login");
		add(b1);
		b1.setBackground(Color.RED);
		
		Choice cho=new Choice();
		cho.add("CSE01");
		cho.add("CSE02");
		cho.add("CSE03");
		cho.add("CSE04");
		cho.add("CSE05");
		add(cho);
		
	}
}





