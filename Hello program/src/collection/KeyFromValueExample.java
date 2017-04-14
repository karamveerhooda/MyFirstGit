package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class KeyFromValueExample {

	public static void main(String[] args) {

		Hashtable htable = new Hashtable();
		
		htable.put("karamveer", "9711904500");
		htable.put("punam", "9711904343");
		htable.put("papa", "9868928700");
		htable.put("papainlaw", "9960702017");
		htable.put("Bitto", "9818615100");
		//below SOP is to check that given value is wither key or value
		System.out.println("Hashtable has number 9818615100 for name: " +htable.containsValue("9818615100") );
		System.out.println("Hashtable has name karamveer for number: " +htable.containsKey("9868165100"));
		
		//finding key corresponding to value in map -- one to one mapping
		String Key = null;
		String value = "9868928700";
		//Map.Entry<Key, value> entry
		
		for(htable.elements():)
		for(int i = 0; i<=htable.size();i++){
			if(htable.containsValue("9868928700")){
				 Key = htable
				break;
			}
			
		}
		
		

	}

}
