package collection;

import java.util.Collection;
import java.util.TreeMap;

public class CheckKeyOfTreeMapExample {

	public static void main(String[] args) {

		TreeMap treemap = new TreeMap();
		
		treemap.put(341, "bisleri");
		treemap.put(1341, "vodka");
		treemap.put(3401, "blue");
		treemap.put(3410, "rome");
		treemap.put(1, "ISIS");
		treemap.put(301, "LET");
		treemap.put(31, "supper");
		
	System.out.println(treemap.get(301));
	
	System.out.println("treemap elements :" +treemap.values());
	System.out.println("Last key in treemap : " +treemap.lastKey());
	System.out.println("Ceiling key of treemap : "+treemap.ceilingKey(31));
	System.out.println("Ceiling entry of treemap : "+treemap.ceilingEntry(3401));
	System.out.println("Searching the element in treemap : "+treemap.get(1));
	System.out.println("Getting the tailmap from a key : "+treemap.tailMap(3401));
	System.out.println("Getting the submap from a key : "+treemap.subMap(31, 10000));
	}
}
