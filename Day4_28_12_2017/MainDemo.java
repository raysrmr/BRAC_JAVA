import java.util.Scanner;
class MainDemo
{
	public static void main(String as[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your University:\n 1.BRAC \t 2.NSU");
		int uni=sc.nextInt();
		switch(uni)
		{
			case 1:
				brac.Announcement A=new brac.Announcement();
				A.finalSem();
				A.reOpen();
				A.publish();
				break;
			case 2:
				nsu.Announcement B=new nsu.Announcement();
				B.finalSem();
				B.reOpen();
				B.publish();
				break;
		}
	}
}