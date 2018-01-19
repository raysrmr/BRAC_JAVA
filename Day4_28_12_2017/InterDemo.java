interface Parent
{	
	final int a=100;
	void absMet();

}
interface Parent1
{
	void parentMet();		
}
interface Parent2 extends Parent,Parent1
{
	
}
class Child implements Parent2
{		
	void childMet()
	{		
		System.out.println("In Child Method");
	}	
	public void parentMet()
	{				
		System.out.println("In Parent Method");
	}	
	public void absMet()
	{		
		System.out.println("In Abs Method");
	}	
}
class InterDemo
{
	public static void main(String as[])
	{
		Child C=new Child();		
		C.parentMet();
		C.childMet();
		C.absMet();
	}
}
