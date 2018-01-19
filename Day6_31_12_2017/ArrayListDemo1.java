import java.util.*;
public class ArrayListDemo1
{
	public static void main(String as[])
	{
		List<String> ar=new ArrayList<String>();
		ar.add("300");
		ar.add("40.09");
		ar.add("A");
		ar.add("true");
		ar.add("new Date()");
		ar.add("400");
		
		System.out.println(ar);
		
		Iterator it=ar.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
	}
}






