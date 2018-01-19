import java.util.Scanner;
class ArrDemo3
{
	public static void main(String as[])
	{
		Scanner sc=new Scanner(System.in);
		int A[][]=new int[2][2];		
		int B[][]=new int[2][2];
		int C[][]=new int[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{			
			A[i][j]=sc.nextInt();
			}
		}	
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{			
			B[i][j]=sc.nextInt();
			}
		}
		System.out.println("**** Output Begins ******");		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{		
				C[i][j]=0;
				for(int k=0;k<2;k++)
				{
						C[i][j]=C[i][j]+A[i][k]*B[k][j];					
				}			    
			}			
		}			
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{										
					System.out.print(C[i][j]);													   
			}
			System.out.println("");
		}			
	}
}