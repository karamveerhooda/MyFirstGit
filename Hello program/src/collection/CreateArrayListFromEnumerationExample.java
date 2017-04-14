package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CreateArrayListFromEnumerationExample {

	public static void main(String[] args) {

		Vector vec = new Vector();
		
		vec.add("a");
		vec.add("z");
		vec.add("x");
		vec.add("w");
		vec.add("e");
		
		Enumeration enobj = vec.elements();
		ArrayList arlst = Collections.list(enobj);
		
		System.out.println(arlst);
	}

}
