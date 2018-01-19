class AreaDemo
{	
	void area(int a)
	{
		double ar=a*a;		
		System.out.println("Area of Square="+ar);
	}
	void area(int a,int b)
	{
		double ar=a*b;		
		System.out.println("Area of Rectangle="+ar);
	}
	void area(double a)
	{
		double ar=3.14*a*a;		
		System.out.println("Area of Circle="+ar);
	}
}
class OverLoad
{
	public static void main(String as[])
	{
		AreaDemo ad=new AreaDemo();				
		ad.area(5);
		ad.area(5,9);
		ad.area(5.2);
	}
}
