import java.util.Scanner;
class ArrDemo1
{
	public static void main(String as[])
	{
		Scanner sc=new Scanner(System.in);
		int reg_no[]=new int[5];
		String stu_name[]=new String[5];				
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Register Number :");
			reg_no[i]=sc.nextInt();
			System.out.println("Enter Student Name :");
			stu_name[i]=sc.next();
		}			
		System.out.println("**** Output Begins ******");		
		for(int i=0;i<5;i++)
		{
		   System.out.println("Register Number :"+reg_no[i]);
		   System.out.println("Student Name :"+stu_name[i]);
		   System.out.println("****************");
		}			
	}
}