package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class AddElementsAtStartEndLinkedListExample {

	public static void main(String[] args) {

		LinkedList Llist = new LinkedList();
		
		Llist.add("kohat");
		Llist.add("trinity");
		Llist.add("ambience");
		Llist.add("leela");
		Llist.add("rohat");
		Llist.add("signature");
		Llist.add("Heinken");
		
		Iterator itr = Llist.iterator();
		
		System.out.println(Llist);
		
		for(int i =0; i < Llist.size();i++){
			System.out.println(Llist.get(i));
		}
		
		Llist.addFirst("kobler");
		Llist.add(3, "rustom");
		
		System.out.println("Particular element is present in :" +Llist.contains("leela"));
		//System.out.println("Particular element is present in :" Llist.contains("leela"));
		
	}

}
