package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class GetSynchronizedListFromArrayListExample {

	public static void main(String[] args) {

ArrayList vec = new ArrayList();
		
		vec.add("a");
		vec.add("z");
		vec.add("x");
		vec.add("w");
		vec.add("e");
		
		List lis = Collections.synchronizedList(vec);
		
		System.out.println(lis);
	}

}
