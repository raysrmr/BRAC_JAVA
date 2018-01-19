import java.util.*;
public class TreeMapExample
     {
        public static void main(String as[]) 
          {
		System.out.println("Tree Map Example!\n");
		TreeMap <Integer, String>tMap = new TreeMap<Integer, String>();
	
		tMap.put(1001, "Sunday");
		tMap.put(2002, "Monday");
		tMap.put(3003, "Tuesday");
		tMap.put(4004, "Wednesday");
		tMap.put(5005, "Thursday");
		tMap.put(6006, "Friday");
		tMap.put(7007, "Saturday");
	
		System.out.println("Keys of tree map: " + tMap.keySet());

		System.out.println("Values of tree map: " + tMap.values());

		System.out.println("Key: 5005 value: " + tMap.get(5005)+ "\n");

		System.out.println("First key: " + tMap.firstKey() + " Value: " + tMap.get(tMap.firstKey()) + "\n");

		System.out.println("Last key: " + tMap.lastKey() + " Value: " + tMap.get(tMap.lastKey()) + "\n");

		System.out.println("Removing first data: " + tMap.remove(tMap.firstKey()));
		System.out.println("Now the tree map Keys: " + tMap.keySet());
		System.out.println("Now the tree map contain: " + tMap.values() + "\n");

		System.out.println("Removing last data: " + tMap.remove(tMap.lastKey()));
		System.out.println("Now the tree map Keys: " + tMap.keySet());
		System.out.println("Now the tree map contain: " + tMap.values());
	}
}