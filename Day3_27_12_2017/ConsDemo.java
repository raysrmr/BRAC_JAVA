class AreaDemo
{	
	AreaDemo()
	{
		System.out.println("In Constructor");
	}
	AreaDemo(int a,int b)
	{
		System.out.println("In Constructor"+(a+b));
	}
	void area(int side)
	{
		double ar=side*side;		
		System.out.println("Area of Square="+ar);
	}
}
class ConsDemo
{
	public static void main(String as[])
	{
		AreaDemo ad=new AreaDemo();		
		new AreaDemo(100,200);	
		ad.area(5);		
	}
}
