import java.applet.*;
import java.awt.*;
/*<applet code=Apps width=300 height=300></applet>*/
public class Apps extends Applet
   {
          public void init()
              {
                      Panel com=new Panel();
                      com.setLayout(new GridLayout(6,1));
                      Panel na=new Panel();
                      na.setLayout(new FlowLayout());
                      Panel ag=new Panel();
                      ag.setLayout(new FlowLayout());
                      Panel dob=new Panel();
                      dob.setLayout(new FlowLayout());
                      Panel gen=new Panel();
                      gen.setLayout(new FlowLayout());
                      Panel qly=new Panel();
                      qly.setLayout(new FlowLayout());
                      Panel bu=new Panel();
                      bu.setLayout(new FlowLayout());

                      Label nam=new Label("Name");
                      Label age=new Label("Age");
                      Label dob1=new Label("DOB");
                      Label ge=new Label("Gender");
                      Label qy=new Label("Qualification");

                      TextField tf1=new TextField(10);
                      TextField tf2=new TextField(3);
                       Choice da=new Choice();
                       for(int i=1;i<=31;i++)
                               da.add(""+i);
                       Choice ye=new Choice();
                       for(int i=1989;i<=2013;i++)
                               ye.add(""+i);
                       Choice mo=new Choice();
                       mo.add("Jan");
                       mo.add("Feb");
                       mo.add("Mar");
                       mo.add("Apr");
                       mo.add("May");
                       mo.add("Jun");
                       mo.add("jul");
                       mo.add("Aug");
                       mo.add("Sep");
                       mo.add("Oct");
                       mo.add("Nov");
                       mo.add("Dec");

                      CheckboxGroup cbg=new CheckboxGroup();
                     Checkbox male=new Checkbox("Male",cbg,false);
                     Checkbox female=new Checkbox("Female",cbg,false);

                      List co=new List(3);
                      co.add("BE");
                      co.add("MCA");
                      co.add("MSC");
                      co.add("MBBS");
                     
                    Button reg=new Button("Register");
                    
	// Adding in Name Panel
                     na.add(nam,FlowLayout.LEFT);
                     na.add(tf1,FlowLayout.RIGHT);

	// Adding in Age Panel
                     ag.add(age,FlowLayout.LEFT);
                     ag.add(tf2,FlowLayout.RIGHT);

	// Adding in Dob Panel
                     dob.add(dob1,FlowLayout.LEFT);
                     Panel d=new Panel();
                     d.add(da);
                     d.add(mo);
                     d.add(ye);
                     dob.add(d,FlowLayout.RIGHT);
                    

	// Adding in Gender Panel
                     gen.add(ge,FlowLayout.LEFT);
                     Panel g=new Panel();
                     g.add(male);
                     g.add(female);
                     gen.add(g,FlowLayout.RIGHT);

	// Adding in Qly Panel
                     qly.add(qy);
                     qly.add(co);

	// Adding in Button Panel
                     bu.add(reg);

                    com.add(na);
                    com.add(ag);
                    com.add(dob);
                    com.add(gen);
                    com.add(qly);
                    com.add(bu);

                   add(com);
              }
   }