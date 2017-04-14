package collection;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.*;

public class listpgm {

	public static void main(String[] args) {

		java.util.List<String> list1 = new ArrayList<String>(Arrays.asList("karam","aaaa","bbbb","cccc","dddd"));
		java.util.List<String> list2 = new ArrayList<String>(Arrays.asList("punam","aaaa","eeee","ffff","dddd"));
		
		HashSet<String> set = new HashSet<String>();
		
		set.addAll(list1);
		set.addAll(list2);
		
		System.out.println(set);
	}

}
