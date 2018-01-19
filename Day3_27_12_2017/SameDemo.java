class LabDemo
{
	int a,c;	
	static int b;
	void staMet(int a,int b)
	{
		int c=a+b;
		System.out.println("a="+a+"\tb="+b);
		System.out.println("c="+c);
	}
}
class SameDemo
{
	public static void main(String as[])
	{
		LabDemo sd=new LabDemo();		
		sd.a=10;
		sd.b=20;
		sd.staMet(100,200);
	}
}