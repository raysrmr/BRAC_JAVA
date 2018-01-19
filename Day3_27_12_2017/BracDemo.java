class BracDemo
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
	}