package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class FindMinimumOfArrayListExample {

	public static void main(String[] args) {

		ArrayList arlst = new ArrayList();
		arlst.add(12);
		arlst.add(5);
		arlst.add(3);
		arlst.add(2);
		arlst.add(1);
		arlst.add(20);
		arlst.add(30);
		arlst.add(11);
		arlst.add(13);
		arlst.add(16);
		arlst.add(15);
		
		ArrayList arlst1 = new ArrayList();
		arlst1.add("karam");
		arlst1.add("zebra");
		arlst1.add("tunes");
		arlst1.add("live");
		arlst1.add("apple");
		arlst1.add("iphone");
		
		Vector vec = new Vector();
		vec.add("karam");
		vec.add("zebra");
		vec.add("tunes");
		vec.add("live");
		vec.add("apple");
		vec.add("iphone");
		
		Iterator itr = arlst.iterator();
		
		System.out.println(Collections.min(arlst));
		System.out.println(Collections.max(arlst));
		System.out.println(Collections.min(arlst1));
		System.out.println(Collections.max(arlst1));
		System.out.println();
		
		System.out.println(Collections.min(vec));
		System.out.println(Collections.max(vec));
		
		Collections.sort(arlst);
		Collections.sort(arlst1);
		System.out.println(arlst);
		System.out.println(arlst1);
		System.out.println(Collections.binarySearch(arlst, 1));
		System.out.println(Collections.binarySearch(arlst1, "karam"));
		
		Collections.replaceAll(arlst, 1, 100);
		System.out.println(arlst);
		Collections.replaceAll(arlst1, "karam", "karamveer hooda");
		System.out.println(arlst1);
		
		Collections.reverse(arlst1);
		System.out.println(arlst1);
		
		Collections.swap(arlst1, 1, 2);
		System.out.println(arlst1);
		
		Collections.shuffle(arlst1);
		System.out.println(arlst1);
		
		Comparator comparator = Collections.reverseOrder();
		Collections.sort(arlst1, comparator);
		System.out.println(arlst1);
		
		
		
		
	}
}
