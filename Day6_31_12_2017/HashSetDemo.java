import java.util.*;
public class HashSetDemo
{
	public static void main(String as[])
	{
		HashSet ar=new HashSet();
		ar.add(new Integer(300));
		ar.add(new Integer(400));
		ar.add(new Integer(500));
		ar.add(new Integer(600));
		ar.add(new Integer(700));
		ar.add(new Integer(800));
		
		
		System.out.println(ar);
		
		Iterator it=ar.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}






