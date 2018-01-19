package nsu;
import university.ExamDates;
import university.result.ResultDates;
public class Announcement implements ExamDates,ResultDates
{
	public Announcement()
	{
		System.out.println("NSU");
	}
	public void finalSem()
	{
		System.out.println("Exams Starts On : 02/01/2018");		
	}
	public void reOpen()
	{
		System.out.println("University Reopens On : 18/01/2018");		
	}
	public void publish()
	{
		System.out.println("University Results Publish On : 25/01/2018");		
	}
	
}