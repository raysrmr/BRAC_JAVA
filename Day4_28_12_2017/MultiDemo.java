class Parent
{
	int a;
	Parent(int a)
	{
		this.a=a;
		System.out.println("pARENT Constructor");		
	}
	void parentMet()
	{
		
		System.out.println("In Parent Method");
	}
}
class Child extends Parent
{
	int b;	
	Child()
	{
		super(100);
		System.out.println("Child Constructor");		
	}
	void childMet()
	{
		b=200;		
		System.out.println("In Child Method:");
	}
}
class GrandChild extends Child
{
	int c;
	void grandChildMet()
	{
		c=a+b;
		System.out.println("C="+c);
	}
}
class MultiDemo
{
	public static void main(String as[])
	{
		GrandChild C=new GrandChild();
		C.parentMet();
		C.childMet();
		C.grandChildMet();
	}
}