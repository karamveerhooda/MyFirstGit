package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CreateListOfNCopiesExample {

	public static void main(String[] args) {
	
		
		List<String> lst = Collections.nCopies(5, "k");
		String s = "karam";
		
		Iterator itr = lst.iterator();
		
		while(itr.hasNext())		{
			System.out.println("element in lst collection : " +itr.next());
				}		

	}

}
