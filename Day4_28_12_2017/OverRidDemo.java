class Parent
{	
	void parentMet()
	{		
		System.out.println("In Parent Method");
	}
}
class Child extends Parent
{		
	void childMet()
	{		
		System.out.println("In Child Method");
	}
}
class OverRidDemo
{
	public static void main(String as[])
	{
		Parent C=new Child();
		C.parentMet();
		C.childMet();
	}
}