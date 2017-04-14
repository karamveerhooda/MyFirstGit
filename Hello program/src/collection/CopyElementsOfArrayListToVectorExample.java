package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class CopyElementsOfArrayListToVectorExample {

	public static void main(String[] args) {
		
		ArrayList<String> arylst = new ArrayList<String>();
		arylst.add("aaa");
		arylst.add("bab");
		arylst.add("bcc");
		arylst.add("dad");
		
		Vector vec = new Vector();
		
		vec.add("a");
		vec.add("z");
		vec.add("x");
		vec.add("w");
		//vec.add("e");
		/*for(int i = 0; i<arylst.size(); i++){
			vec.add(arylst.get(i));
		}
		
		for (int  j = 0; j<vec.size();j++)
		{
			System.out.println("elements in vector :" +vec.get(j));
		}*/
		//also you can use collection.copy method
		
		Collections.copy(arylst,vec);
		System.out.println("elements in vector :" +arylst);
		
		

	}

}
