package studetails;
public class GradeDemo extends AverageDemo
{
	public void gradeMet()
	{
		if(m1>=40 && m2>=40 && m3>=40)
		{
			result="pass";
			if(avg>=80)
				cgpa="A";
			else if(avg<80 && avg>=60)
				cgpa="B";
			else if(avg<60 && avg>=40)
				cgpa="C";			
		}
		else
		{
			result="fail";
			cgpa="N/A";
		}		
	}
}