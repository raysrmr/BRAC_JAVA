class AreaDemo
{		
	static int a,b;
	AreaDemo()
	{			
	}
	AreaDemo(int a,int b)
	{
		this.a=a;
		this.b=b;		
	}
	void area()
	{
		System.out.println(a+b);
	}
}
class ThisDemo
{
	public static void main(String as[])
	{
		AreaDemo ad=new AreaDemo();				
		new AreaDemo(100,200);
		ad.area();		
	}
}
