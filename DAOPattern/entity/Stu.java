package entity;
public class Stu
{
	private int sid;
	private String sname;
	private String sdept;
	private float scgpa;
	public Stu(int sid,String sname,String sdept,float scgpa)
	{
		this.sid=sid;
		this.sname=sname;
		this.sdept=sdept;
		this.scgpa=scgpa;
	}
	public int getSid()
	{
		return this.sid;
	}
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	public String getSname()
	{
		return this.sname;
	}
	public void setSname(String sname)
	{
		this.sname=sname;
	}
	public float getScgpa()
	{
		return this.scgpa;
	}
	public void setScgpa(float scgpa)
	{
		this.scgpa=scgpa;
	}
	public String getSdept()
	{
		return this.sdept;
	}
	public void setSdept(String sdept)
	{
		this.sdept=sdept;
	}
}