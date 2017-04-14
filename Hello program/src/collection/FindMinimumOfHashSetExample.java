package collection;

import java.util.Collections;
import java.util.HashSet;

public class FindMinimumOfHashSetExample {

	public static void main(String[] args) {
		
		
		HashSet hsh = new HashSet();
		
		hsh.add(new Long ("12083838"));
		hsh.add(new Long ("12083458"));
		hsh.add(new Long ("12333838"));
		hsh.add(new Long ("12223838"));
		hsh.add(new Long ("11283838"));
		hsh.add(new Long ("15683838"));
		
		
		System.out.println(Collections.min(hsh));
		System.out.println(Collections.max(hsh));
		

	}

}
