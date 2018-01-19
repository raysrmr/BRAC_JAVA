class LabDemo
{
	int a;
	static int b;
	void staMet()
	{
		System.out.pritnln("a="+a+"\tb="+b);
	}
}
class StaticDemo
{
	public static void main(String as[])
	{
		LabDemo A=new LabDemo();
		LabDemo B=new LabDemo();
		LabDemo C=new LabDemo();
		A.a=100;
		A.b=200;
		B.a=300;
		B.b=400;
		C.a=500;
		C.b=600;
		A.staMet();
		B.staMet();
		C.staMet();
	}
}