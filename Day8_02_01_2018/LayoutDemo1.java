import java.applet.*;
import java.awt.*;
/*<applet code=LayoutDemo1 width=300 height=300></applet>*/
public class LayoutDemo1 extends Applet
{
	public void init()
	{
		//BorderLayout blay=new BorderLayout();
		//setLayout(blay);
		Panel p=new Panel();
		//GridLayout lay=new GridLayout(3,2);
		GridLayout lay=new GridLayout(3,2,10,20);
		p.setLayout(lay);
		Label user=new Label("User Name");
		p.add(user);
		TextField user_txt=new TextField(10);
		p.add(user_txt);
		Label pwd=new Label("Password");
		p.add(pwd);
		TextField pwd_txt=new TextField(10);
		pwd_txt.setEchoChar('*');
		p.add(pwd_txt);
		
		Button login_but=new Button("Login");
		p.add(login_but);
		Button reset_but=new Button("Reset");
		p.add(reset_but);		
		
		//add(p,BorderLayout.SOUTH);
		add(p);
	}
	
}
