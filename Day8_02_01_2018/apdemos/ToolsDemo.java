import java.applet.*;
import java.awt.*;
/*<applet code= ToolsDemo width=300 height=400> </applet>*/
public class ToolsDemo extends Applet
{
   public void init()
   {
      setBackground(Color.GRAY);
      GridLayout f=new GridLayout(6,1);
      FlowLayout f1=new FlowLayout(FlowLayout.LEFT); 

      Panel p=new Panel();
      Panel p1=new Panel();
      Panel p2=new Panel();
      Panel p3=new Panel();
      Panel p4=new Panel();
      Panel p5=new Panel();
      Panel p6=new Panel();

      p.setLayout(f);
      p1.setLayout(f1);
      Label la=new Label("NAME");
      p1.add(la);
      TextField tf=new TextField(15);
      p1.add(tf);

      p2.setLayout(f1);
      Label la1=new Label("AGE   ");
      p2.add(la1);
      TextField tf1=new TextField(2);
      p2.add(tf1);

      p3.setLayout(f1);
      Label la2=new Label("D.O.B");
      p3.add(la2);
      Choice ch=new Choice();
      ch.add("  ");
      for(int i=1;i<=31;i++)
      ch.add(""+i);
      Choice ch1=new Choice();
      ch1.add("  ");
      for(int j=1;j<=12;j++)
      ch1.add(""+j);
      Choice ch2=new Choice();
      ch2.add("    ");
      for(int k=1980;k<=1999;k++)
      ch2.add(""+k);
      p3.add(ch);
      p3.add(ch1);
      p3.add(ch2);

      p4.setLayout(f1);
      Label la3=new Label("GENDER");
      p4.add(la3);
      CheckboxGroup cbg=new CheckboxGroup();
      Checkbox cb1=new Checkbox("Male",cbg,true);
      Checkbox cb2=new Checkbox("Female",cbg,true);
      p4.add(cb1);
      p4.add(cb2);

      p5.setLayout(f1);
      Label la4=new Label("QUALIFICATION");
      p5.add(la4);
      List li=new List(3);
      li.add("BE/B.Tech");
      li.add("BCA");
      li.add("MBA");
      li.add("ME/M.Tech");
      li.add("MCA");
      p5.add(li);

      Button b=new Button("REGISTER");
      p6.add(b);      

      p.add(p1);
      p.add(p2); 
      p.add(p3);
      p.add(p4);
      p.add(p5);
      p.add(p6);
      add(p);
  }
}