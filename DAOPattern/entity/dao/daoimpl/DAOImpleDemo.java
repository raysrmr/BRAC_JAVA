package entity.dao.daoimpl;
import entity.dao.*;
import java.sql.*;
import java.util.*;
import entity.Stu;
public class DAOImpleDemo implements DAOInterface
{
	Connection con=null;
	String qry;
	PreparedStatement ps;
	Statement st;
	ResultSet rs;
	Scanner sc;
	ArrayList<Stu> ar;
	
	public DAOImpleDemo(Connection con)
	{
		this.con=con;
	}
	public void insert(Stu st)throws Exception
	{
		ps=con.prepareStatement("insert into student values(?,?,?,?)");
		ps.setInt(1,st.getSid());
		ps.setString(3,st.getSdept());
		ps.setString(2,st.getSname());
		ps.setFloat(4,st.getScgpa());
		ps.execute();
	}
	public ArrayList showAll() throws Exception
	{
		st = con.createStatement();
		qry = "select * from student";
		rs = st.executeQuery(qry);
		
		ar = new ArrayList<Stu>();
		
		while(rs.next()){
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String dept = rs.getString(3);
			float cgpa = rs.getFloat(4);
			
			ar.add(new Stu(id,name,dept,cgpa));
		} return ar;
	}
	public ArrayList showByID(int id) throws Exception
	{
		qry = "select * from student where Stu_ID=?";
		ps = con.prepareStatement(qry);
		ps.setInt(1,id);
		rs = ps.executeQuery();
		
		ar = new ArrayList<Stu>();
		
		while(rs.next()){
			id = rs.getInt(1);
			String name = rs.getString(2);
			String dept = rs.getString(3);
			float cgpa = rs.getFloat(4);
			
			ar.add(new Stu(id,name,dept,cgpa));
		}
		if(ar.size()==0){System.out.println("ID doesn't exist");} 
		return ar;
	}
	public int updateByID(int id) throws Exception
	{
		sc=new Scanner(System.in);
		System.out.println("Enter student name: ");
		String name = sc.next();
		System.out.println("Enter student dept: ");
		String dept = sc.next();
		System.out.println("Enter student cgpa: ");
		float cgpa = sc.nextFloat();
		
			qry = "update student set Stu_name=?,Stu_dept=?,Stu_CGPA=? where Stu_ID=?";
			ps = con.prepareStatement(qry);
			ps.setInt(4,id);
			ps.setString(2,dept);
			ps.setFloat(3,cgpa);
			ps.setString(1,name);
			int count = ps.executeUpdate();
			return count;
	}
	public int deleteByID(int id) throws Exception
	{
		qry = "delete from student where Stu_ID=?";
		ps = con.prepareStatement(qry);
		ps.setInt(1,id);
		int count = ps.executeUpdate();
		return count;
	}
}