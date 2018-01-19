import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code=Form width=400 height=800>
</applet>*/
public class Form extends JApplet implements ActionListener
{
JTextField ta,taa,ta1,ta2,ta3,ta4,ta5,ta6,ta7,ta8;
public void init()
{
Container con=getContentPane();
Color cc=new Color(185,122,87);
con.setBackground(cc);
Font fp=new Font("Monotype Corsiva",Font.ITALIC,30);
Font ft=new Font("Monotype Corsiva",Font.ITALIC,25);
Color ct=new Color(240,240,240);

JPanel ph=new JPanel();
Font fs=new Font("Monotype Corsiva",Font.ITALIC,40);
JLabel l=new JLabel("Application Form");
l.setFont(fs);
ph.add(l);
Color cb=new Color(185,122,87);
ph.setBackground(cb);
Color cf=new Color(0,0,0);
l.setForeground(cf);
con.add(ph,BorderLayout.NORTH);

GridLayout f2=new GridLayout(12,2,0,20);
JPanel pg=new JPanel();
pg.setLayout(f2);
Color c=new Color(185,122,87);
pg.setBackground(c);

JLabel l1=new JLabel("    Name:     ");
l1.setForeground(cf);
l1.setFont(fp);
ta=new JTextField(20);
ta.setBackground(ct);
ta.setFont(ft);
pg.add(l1);
pg.add(ta);

JLabel l1a=new JLabel("    Parents' Name:  ");
l1a.setForeground(cf);
l1a.setFont(fp);
taa=new JTextField(20);
taa.setBackground(ct);
taa.setFont(ft);
pg.add(l1a);
pg.add(taa);

JLabel l2=new JLabel("    DOB:      ");
l2.setForeground(cf);
l2.setFont(fp);
ta1=new JTextField(20);
ta1.setBackground(ct);
ta1.setFont(ft);
pg.add(l2);
pg.add(ta1);

JLabel l3=new JLabel("    Age:   ");
l3.setForeground(cf);
l3.setFont(fp);
pg.add(l3);
Panel pradio=new Panel();
pradio.setLayout(new FlowLayout(FlowLayout.LEFT));
JRadioButton r1=new JRadioButton("Female");
JRadioButton r2=new JRadioButton("Male");
ButtonGroup bg=new ButtonGroup();
bg.add(r1);
bg.add(r2);
Color cr=new Color(185,122,87);
r1.setBackground(cr);
r2.setBackground(cr);
r1.setFont(ft);
r2.setFont(ft);
pradio.setBackground(cr);
pradio.add(r1);
pradio.add(r2);
pg.add(pradio);

JLabel l4=new JLabel("   e-mail_id:   ");
l4.setForeground(cf);
l4.setFont(fp);
ta2=new JTextField(20);
ta2.setBackground(ct);
ta2.setFont(ft);
pg.add(l4);
pg.add(ta2);

JLabel l5=new JLabel("   Ph:no:  ");
l5.setForeground(cf);
l5.setFont(fp);
ta3=new JTextField(20);
ta3.setBackground(ct);
ta3.setFont(ft);
pg.add(l5);
pg.add(ta3);

JLabel l6=new JLabel("   Address:   ");
l6.setForeground(cf);
l6.setFont(fp);
ta4=new JTextField(20);
ta4.setBackground(ct);
ta4.setFont(ft);
pg.add(l6);
pg.add(ta4);

JLabel l7=new JLabel("   City:   ");
l7.setForeground(cf);
l7.setFont(fp);
ta5=new JTextField(20);
ta5.setBackground(ct);
ta5.setFont(ft);
pg.add(l7);
pg.add(ta5);

JLabel l8=new JLabel("   State:   ");
l8.setForeground(cf);
l8.setFont(fp);
ta6=new JTextField(20);
ta6.setBackground(ct);
ta6.setFont(ft);
pg.add(l8);
pg.add(ta6);

JLabel l9=new JLabel("   Country:   ");
l9.setForeground(cf);
l9.setFont(fp);
ta7=new JTextField(20);
ta7.setBackground(ct);
ta7.setFont(ft);
pg.add(l9);
pg.add(ta7);

JLabel l10=new JLabel("   Pincode:   ");
l10.setForeground(cf);
l10.setFont(fp);
ta8=new JTextField(20);
ta8.setBackground(ct);
ta8.setFont(ft);
pg.add(l10);
pg.add(ta8);

Color cbutton=new Color(255,174,201);

JButton bs=new JButton("Submit");
bs.setBackground(cbutton);
bs.setFont(fp);
bs.addActionListener(this);
JButton br=new JButton("Reset");
br.setBackground(cbutton);
br.setFont(fp);
br.addActionListener(this);
pg.add(bs);
pg.add(br);

con.add(pg,BorderLayout.WEST);
}

public void actionPerformed(ActionEvent e)
{
String bt=e.getActionCommand();
if(bt.equals("Reset"))
{
ta.setText(" ");
taa.setText(" ");
ta1.setText(" ");
ta2.setText(" ");
ta3.setText(" ");
ta4.setText(" ");
ta5.setText(" ");
ta6.setText(" ");
ta7.setText(" ");
ta8.setText(" ");
}
else
{

}
}
}