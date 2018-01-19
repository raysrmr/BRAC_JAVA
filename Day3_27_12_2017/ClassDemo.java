class ClassDemo
{
		public static void main(String as[])
		{
			BracDemo md=new BracDemo();			
			md.withoutBoth();
			md.withArgs("Raffic");
			int ret_value=md.withReturn();
			System.out.println("return From WithReturn :"+ret_value);
			double ans=md.withBoth(5,2);
			System.out.println("return From WithBoth :"+ans);
			md.staMet();
			MethodDemo.staMet();		
		}
}	
	