import java.applet.*;
import java.awt.*;
/*<applet code=LayoutDemo width=300 height=300></applet>*/
public class LayoutDemo extends Applet
{
	public void init()
	{
		//FlowLayout lay=new FlowLayout(FlowLayout.LEFT);
		FlowLayout lay=new FlowLayout(FlowLayout.RIGHT);
		setLayout(lay);
		Label user=new Label("User Name");
		add(user);
		TextField user_txt=new TextField(10);
		add(user_txt);
		Label pwd=new Label("Password");
		add(pwd);
		TextField pwd_txt=new TextField(10);
		pwd_txt.setEchoChar('*');
		add(pwd_txt);
		
		Button login_but=new Button("Login");
		add(login_but);
		Button reset_but=new Button("Reset");
		add(reset_but);		
	}
}
