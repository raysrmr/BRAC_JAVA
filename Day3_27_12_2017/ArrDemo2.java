import java.util.Scanner;
class ArrDemo2
{
	public static void main(String as[])
	{
		Scanner sc=new Scanner(System.in);
		int reg_no[][]=new int[3][3];		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{			
			reg_no[i][j]=sc.nextInt();
			}
		}			
		System.out.println("**** Output Begins ******");		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{			
			   System.out.print(reg_no[i][j]+"\t");
			}
			System.out.println("");
		}			
	}
}