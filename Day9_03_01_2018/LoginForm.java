import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LoginForm extends JFrame implements ActionListener
{
	JLabel uname,pwd;
	JTextField uname_txt;
	JPasswordField pwd_txt;
	JButton log,clr;
	public LoginForm(String title)
	{
		super(title);
		setLayout(new FlowLayout());
		JPanel com=new JPanel(new GridLayout(3,2,10,20));
		uname=new JLabel("User Name");
		pwd=new JLabel("Password");
		uname_txt=new JTextField(10);
		pwd_txt=new JPasswordField(10);
		log=new JButton("Login");
		clr=new JButton("Reset");
		com.add(uname);
		com.add(uname_txt);
		com.add(pwd);
		com.add(pwd_txt);
		com.add(log);
		com.add(clr);
		add(com);
		log.addActionListener(this);
		clr.addActionListener(this);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String act=ae.getActionCommand();
		if(act.equals(log.getLabel()))
		{
			String una=uname_txt.getText();
			String pwd=pwd_txt.getText();
			if(una.equals("raysrmr") && pwd.equals("123456"))
			{
				JOptionPane.showMessageDialog(this,"Welcome User","Smile...",JOptionPane.INFORMATION_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(this,"Wrong User Name or Password","Sorry...",JOptionPane.ERROR_MESSAGE);
			}
		}
		else{
			uname_txt.setText("");
			pwd_txt.setText("");
		}
	}
	
}

