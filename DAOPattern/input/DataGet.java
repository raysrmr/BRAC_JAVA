package input;
import java.util.*;
import entity.Stu;
import conn.*;
public class DataGet
{
	public static Stu getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("SID:");
		int sid=sc.nextInt();
		System.out.print("SNAME:");
		String sname=sc.next();
		System.out.print("SDEPARTMENT:");
		String sdept=sc.next();
		System.out.print("SCGPA:");	
		float scgpa=sc.nextFloat();
		Stu st=new Stu(sid,sname,sdept,scgpa);
		return st;
	}
}