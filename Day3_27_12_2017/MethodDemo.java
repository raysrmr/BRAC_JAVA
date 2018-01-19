class MethodDemo
	{
		void withoutBoth()
		{
			System.out.println("With out Retun type and Args");
		}
		void withArgs(String name)
		{
			System.out.println("With out Retun type and with Args:"+name);
		}
		int withReturn()
		{
			int mark = 98;
			System.out.println("With Retun type and with out Args");
			return mark;
		}
		double withBoth(int a,int b)
		{
			double c=(double)a/b;
			System.out.println("With Retun type and Args");
			return c;
		}
		static void staMet()
		{
			System.out.println("In Static Method");
		}
		public static void main(String as[])
		{
			MethodDemo md=new MethodDemo();
			md.withoutBoth();
			md.withArgs("Raffic");
			int ret_value=md.withReturn();
			System.out.println("return From WithReturn :"+ret_value);
			double ans=md.withBoth(5,2);
			System.out.println("return From WithBoth :"+ans);
			md.staMet();
			MethodDemo.staMet();
			staMet();
		}
	}
	