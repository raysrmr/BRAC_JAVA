package studetails;
import java.util.*;
public class InputDemo
{
	public int reg_no,tot,m1,m2,m3;
	public double avg;
	public String stu_name,cgpa,result;
	public void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Reg Number:");
		reg_no=sc.nextInt();
		System.out.println("Enter Name:");
		stu_name=sc.next();
		System.out.println("Enter Mark1:");
		m1=sc.nextInt();
		System.out.println("Enter Mark2:");
		m2=sc.nextInt();
		System.out.println("Enter Mark3:");
		m3=sc.nextInt();		
	}
	
}