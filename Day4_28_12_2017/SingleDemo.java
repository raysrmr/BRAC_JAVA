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
	int b,c;	
	Child()
	{
		super(100);
		System.out.println("Child Constructor");		
	}
	void childMet()
	{
		b=200;
		c=a+b;
		System.out.println("In Child Method:"+c);
	}
}
class SingleDemo
{
	public static void main(String as[])
	{
		Child C=new Child();
		C.parentMet();
		C.childMet();
	}
}