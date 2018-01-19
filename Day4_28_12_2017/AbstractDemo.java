 abstract class Parent
{	
	abstract void absMet();
	void parentMet()
	{		
		System.out.println("In Parent Method");
	}
}
abstract class Child extends Parent
{		
	void childMet()
	{		
		System.out.println("In Child Method");
	}	
}
class GrandChild extends Child
{
	void absMet()
	{		
		System.out.println("In Abstract Method");
	}
}
class AbstractDemo
{
	public static void main(String as[])
	{
		GrandChild C=new GrandChild();		
		C.parentMet();
		C.childMet();
		C.absMet();
	}
}