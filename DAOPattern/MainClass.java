import input.DataGet;
import entity.dao.daoimpl.*;
import entity.dao.*;
import java.util.*;
import conn.*;
import entity.Stu;
class MainClass
	{
		public static void main(String as[])throws Exception
		{
			Scanner sc=new Scanner(System.in);
			int cont=0;
			do{
				System.out.println("Choose Your Selection:");
				System.out.println("1.Insert\n");
				System.out.println("2.View All\n");
				System.out.println("3.View By ID\n");
				System.out.println("4.Update By ID\n");
				System.out.println("5.Delete by ID\n");
				int ch=sc.nextInt();
				DAOInterface di=new DAOImpleDemo(ConnectionFactory.getCon());
				switch(ch)
				{
					case 1:
						Stu st=DataGet.getData();
						di.insert(st);
						break;
						
					case 2:
						ArrayList<Stu> ar = di.showAll();
						Iterator it = ar.iterator();
						while(it.hasNext()){
							Stu stud = (Stu)it.next();
							System.out.println("Name: "+stud.getSname()+" ID: "+stud.getSid()+" Dept: "+stud.getSdept()+" CGPA: "+stud.getScgpa());
						}
						break;
						
					case 3:
						System.out.println("Enter id: ");
						int id = sc.nextInt();
						ar = di.showByID(id);
						it = ar.iterator();
						while(it.hasNext()){
							Stu stud = (Stu)it.next();
							System.out.println("Name: "+stud.getSname()+" ID: "+stud.getSid()+" Dept: "+stud.getSdept()+" CGPA: "+stud.getScgpa());
						}
						break;
						
					case 4:
						System.out.println("Enter id: ");
						id = sc.nextInt();
						
						int count = di.updateByID(id);
						System.out.println(count+" records updated.");
						break;
						
					case 5:
						System.out.println("Enter id: ");
						id = sc.nextInt();
						
						count = di.deleteByID(id);
						System.out.println(count+" records deleted.");
						break;
						
					default:
						System.out.println("Wrong Entry...");
				}
				System.out.println("DO you want to Continue 1.Yes\t 2.No");
				cont=sc.nextInt();
			}while(cont==1);
		}
	}
