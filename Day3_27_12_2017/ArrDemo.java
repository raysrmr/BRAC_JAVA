class ArrDemo
{
	public static void main(String as[])
	{
		int reg_no[]={1001,1002,1003,1004,1005};
		for(int i=0;i<reg_no.length;i++)
			System.out.println(reg_no[i]);	

		System.out.println("*******************");
		
		for(int temp:reg_no)	
			System.out.println(temp);
	}
}