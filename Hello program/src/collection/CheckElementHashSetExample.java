package collection;

import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class CheckElementHashSetExample {

	public static void main(String[] args) {
	
		HashSet hset     = new HashSet();
		HashMap hmap = new HashMap();
		
		hset.add("robs");
		hset.add("trig");
		hset.add("num");
		hset.add("rojer");
		hset.add("terex");
		hset.add("alpha");
		hset.add(null);
		
		
		
		System.out.println("size of hashset : " +hset );
		
		System.out.println("Returns true or false if rojer exists : " +hset.contains("rojer"));

// CopyElementsOfHashSetToArrayExample
		
		Object[] str = hset.toArray();
		
		for (int i = 0; i < str.length; i++)
		{
			System.out.println(str[i]);	
		}
		
//GetSizeOfJavaHashSetExample
		
		System.out.println("size of hashset : " +hset.size());
		
		System.out.println("size of hashset : " +hset );
		Iterator itr = hset.iterator();
		
		for(int i = 0; i < hset.size(); i++)
		{
			System.out.println("size of hashset : " +itr.next() );
		}
		
		hmap.put(1, "karam");
		hmap.put(4, "trig");
		hmap.put(22,"num");
		hmap.put(0,"rolex");
		hmap.put(0,"rojer");
		hmap.put(-2,"terex");
		hmap.put(5,"alpha");
		hmap.put(6,null);
		
		Set set = hmap.keySet();
		System.out.println(set);
		
		
		System.out.println(hmap);
		System.out.println(hmap.containsKey(0));
		System.out.println(hmap.values());
		System.out.println(hmap.size());
		
		Collection col = hmap.values();
		Iterator itr1 = col.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
	
		Hashtable htbl = new Hashtable();
		
		htbl.put(1, "Gate");
		htbl.put(1, "sob");
		htbl.put(5, "risk");
		htbl.put(3, "rums");
		htbl.put(2, "shivas");
		htbl.put(6, "sob");
		
		System.out.println("Element in hashtable :"+htbl);
		Enumeration col1 = htbl.keys();
		Enumeration col2 = htbl.elements();
		
		while(col1.hasMoreElements()){
		System.out.println("Elements : " +col1.nextElement());
		 }
			
		while(col2.hasMoreElements()){
			System.out.println("Elements : " +col2.nextElement());
			 }
	}
}
