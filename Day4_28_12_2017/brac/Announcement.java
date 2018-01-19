package brac;
import university.ExamDates;
import university.result.ResultDates;
public class Announcement implements ExamDates,ResultDates
{
	public Announcement()
	{
		System.out.println("BRAC");
	}
	public void finalSem()
	{
		System.out.println("Exams Starts On : 08/01/2018");		
	}
	public void reOpen()
	{
		System.out.println("University Reopens On : 29/01/2018");		
	}
	public void publish()
	{
		System.out.println("University Results Publish On : 15/01/2018");		
	}
	
}