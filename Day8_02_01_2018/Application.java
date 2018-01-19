import java.applet.*;
import java.awt.*;
/*<applet code=Application width=500 height=600></applet>*/
public class Application extends Applet{
	
	Label fname,lname,age,DOB,gender,nationality,address;
	TextField fname_txt,lname_txt,age_txt;
	TextArea address_txt;
	Checkbox male,female,tg,india,bd,others;
	Choice DD,MM,YYYY;
	Button login,reset;
	public void init()
	{		
		//Panel Object Creation with Required Layout
		Panel common=new Panel(new GridLayout(8,2,5,10));		
		Panel gender_panel=new Panel(new GridLayout(1,3));
		Panel nationality_panel=new Panel(new GridLayout(1,3));
		Panel DOB_panel=new Panel(new GridLayout(1,3,2,0));
		
		//Label's Creation
		fname=new Label("First Name:");
		lname=new Label("Last Name:");
		age=new Label("Age");
		DOB=new Label("DOB");
		gender=new Label("Gender");
		nationality=new Label("Nationality");
		address=new Label("address");
		
		//TextField Creation
		fname_txt=new TextField(10);
		lname_txt=new TextField(10);
		age_txt=new TextField(10);
		
		//TextArea Creation
		address_txt=new TextArea(2,5);
		
		//Radio Button Creation for Gender
		CheckboxGroup gender_group=new CheckboxGroup();
		male=new Checkbox("Male",gender_group,false);
		female=new Checkbox("Female",gender_group,false);
		tg=new Checkbox("Trans Gender",gender_group,false);
		
		//Radio Button Creation for Nationality
		CheckboxGroup nationality_group=new CheckboxGroup();
		india=new Checkbox("Indian",nationality_group,false);
		bd=new Checkbox("Bangladesh",nationality_group,false);
		others=new Checkbox("Others",nationality_group,false);
		
		//Button Creation
		login=new Button("Register");
		reset=new Button("Reset");
		
		//Choice Creation
		DD=new Choice();
		MM=new Choice();
		YYYY=new Choice();
		
		//Adding Choice Required Items
		for(int i=1;i<=31;i++)
			DD.add(""+i);
		for(int i=1;i<=12;i++)
			MM.add(""+i);
		for(int i=1990;i<=2017;i++)
			YYYY.add(""+i);
		
		
		//Adding Component to DOB_panel
		DOB_panel.add(DD);
		DOB_panel.add(MM);
		DOB_panel.add(YYYY);
		
		//Adding Component to nationality_panel
		nationality_panel.add(india);
		nationality_panel.add(bd);
		nationality_panel.add(others);
		
		//Adding Component to gender_panel
		gender_panel.add(male);
		gender_panel.add(female);
		gender_panel.add(tg);
		
		//Adding Component to Common Panel(7x2)
		common.add(fname);
		common.add(fname_txt);
		common.add(lname);
		common.add(lname_txt);
		common.add(age);
		common.add(age_txt);
		common.add(DOB);
		common.add(DOB_panel);
		common.add(gender);
		common.add(gender_panel);
		common.add(nationality);
		common.add(nationality_panel);
		common.add(address);
		common.add(address_txt);
		common.add(login);
		common.add(reset);		
		
		//Adding Component to Applet
		add(common);
	}
}



