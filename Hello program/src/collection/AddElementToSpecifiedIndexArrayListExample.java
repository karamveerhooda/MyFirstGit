package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class AddElementToSpecifiedIndexArrayListExample {

	public static void main(String[] args) {
    
		 ArrayList<String> Arlst = new ArrayList<String>();
		 
		 Arlst.add("karam");
		 Arlst.add("karam1");
		 Arlst.add("karam2");
		 Arlst.add("karam3");
		 
		 Iterator Itr = Arlst.iterator();
		 
		 for(int i =0 ; i < Arlst.size(); i++)
		 {
			 System.out.println(Itr.next());
		 }
		 
		 Arlst.add(2, "karam4");
		 
		 for(int i =0 ; i < Arlst.size(); i++)
		 {
			 System.out.println(Arlst.get(i));
		 }
	}

}
