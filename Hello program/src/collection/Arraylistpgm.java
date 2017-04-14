package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Arraylistpgm {

	public static void main(String[] args) {
		
	/*ArrayList<String> Arrobj1 = new ArrayList<>();
	System.out.println(Arrobj1);
	
	System.out.println("Take the Input");
	Scanner Inp = new Scanner(System.in);
	String answer;
	
	Iterator itr = Arrobj1.iterator();
		
	do{
		System.out.println("Enter the input: ");
		Arrobj1.add(Inp.next());
		answer = Inp.next();
	}while(answer.equals("yes"));
	
	if(answer != "yes")
	{
		System.out.println("display the Array values:");
		for (int i = 0; i<Arrobj1.size();i++){
			System.out.print(Arrobj1.get(i)+"\t");	
		}
	}
	
	System.out.println("Do you want to add element at specific location in above array:");
	answer = Inp.next();
	if(answer.equals("yes")){
		System.out.println("Enter the position:" );
		String j = Inp.next();
		
		System.out.println("Enter the element to add:" );
		answer = Inp.next();
		Arrobj1.add(Integer.parseInt(j), answer);
	}
	
	System.out.println("display the Array values:");
	for (int i = 0; i<Arrobj1.size();i++){
		System.out.print(Arrobj1.get(i)+"\t");	
	}
	System.out.println(5);*/
		
// UNION of two String arraylist		
	ArrayList<String> Arrobj2 = new ArrayList<String>() ;
	ArrayList<String> Arrobj3 = new ArrayList<String>();
	ArrayList<String> Arrobj4 = new ArrayList<String>();
	
	Arrobj2.add("Johns");
	Arrobj2.add("Johns");
	Arrobj2.add("Johny");
	Arrobj2.add("Henry");
	Arrobj2.add("Willi");
	Arrobj2.add("Tuli");
	Arrobj2.add("Rums");
	
	Arrobj3.add("John");
	Arrobj2.add("Johny");
	Arrobj3.add("Henry");
	Arrobj3.add("Tuli");
	Arrobj3.add("Rum");
	Arrobj3.add("Abhram");
	Arrobj3.add("Abhram");
	
	Iterator itr2 = Arrobj2.iterator();
	Iterator itr3 = Arrobj3.iterator();
	Iterator itr4 = Arrobj4.iterator();
	int Flag=0, j, i;
	
	System.out.println("Element in array 2");
	while(itr2.hasNext()){
		System.out.print(itr2.next() + "  ");
	}
	System.out.println();
	System.out.println("Element in array 3");
	while(itr3.hasNext()){
		System.out.print(itr3.next()+ "  ");
	}
	System.out.println();
	/* run two for loops then and declare one more arraylist, if first value of first for loop matches with any value of the second for loop then paste it in third 
	 * arraylist, if not match then also move it to 
	 */
	System.out.println("Union of array 2 and array 3 is:");
	Arrobj4 = Arrobj3;
	for(i = 0 ; i<Arrobj2.size(); i++ )
	{
		for ( j = 0; j<Arrobj3.size(); j++)
		{
			if((Arrobj2.get(i).equals(Arrobj3.get(j))))
			{
				Flag = 0;
				break;
	    	}
			else {
				Flag = 1;
				}
		}
		if (Flag == 1)
		{
			 Arrobj4.add(Arrobj2.get(i));
		}
		
	}
	
	System.out.println("Union of two arraylist:"+Arrobj4);
	
	// We can do union by merging two arraylist and then sort it simple.
	
	sortarray();
	//print common between two
	commonoftwo();

}
	
//using inbuilt function for Arraylist.


/*	Arrobj2.addAll(Arrobj3);
	System.out.println(Arrobj2);
	Arrobj2.retainAll(Arrobj3);
	System.out.println(Arrobj2);

	Collections.reverse(Arrobj2);
	System.out.println(Arrobj2);
*/	
	
	//sorting an Int arraylist:
	public static void sortarray() {
		ArrayList<Integer> Arrobj5 = new ArrayList<Integer>();
		Arrobj5.add(33);
		Arrobj5.add(11);
		Arrobj5.add(03);
		Arrobj5.add(34);
		Arrobj5.add(23);
		Arrobj5.add(35);
		Arrobj5.add(12);
		Arrobj5.add(9);
	
		System.out.println("Arraylist of Integer:"+Arrobj5);
		for (int i = 0; i<Arrobj5.size();i++)
			for(int l = i+1; l<Arrobj5.size();l++)
		     {
			if(Arrobj5.get(i)>Arrobj5.get(l)){   // in ascending order
				Arrobj5.set(i, Arrobj5.set(l, Arrobj5.get(i)));
			}
		}
		System.out.println("in Ascending order:"+Arrobj5);
		for (int i = 0; i<Arrobj5.size();i++)
			for(int l = i+1; l<Arrobj5.size();l++)
		     {
			if(Arrobj5.get(i)<Arrobj5.get(l)){   // in descending order
				Arrobj5.set(i, Arrobj5.set(l, Arrobj5.get(i)));
			}
		}
		System.out.println("in descending order:"+Arrobj5);
		
	}
	// common of two arraylist of integer type:
	public static void commonoftwo(){
	
		ArrayList<Integer> Arrobj5 = new ArrayList<Integer>();
		Arrobj5.add(33);
		Arrobj5.add(11);
		Arrobj5.add(03);
		Arrobj5.add(34);
		Arrobj5.add(230);
		Arrobj5.add(35);
		Arrobj5.add(12);
		Arrobj5.add(100);
	
		ArrayList<Integer> Arrobj6 = new ArrayList<Integer>();
		Arrobj6.add(33);
		Arrobj6.add(11);
		Arrobj6.add(03);
		Arrobj6.add(34);
		Arrobj6.add(23);
		Arrobj6.add(35);
		Arrobj6.add(12);
		Arrobj6.add(9);
		
		ArrayList<Integer> Arrobj7 = new ArrayList<Integer>();
		int flag=0;
		System.out.println("Arraylist of Integer:"+Arrobj5);
		for(int i = 0 ; i< Arrobj5.size(); i++)
		{
			for(int j = 0; j<Arrobj6.size();j++)
			{
				if(Arrobj5.get(i) == Arrobj6.get(j))
				{
					Arrobj7.add(Arrobj5.get(i));
				}
			}
	}
		System.out.println("Intersection of Arraylist:"+Arrobj7);
		
// Intersection of String type Arraylist.
		ArrayList<String> Arrobj3 = new ArrayList<String>();
		ArrayList<String> Arrobj4 = new ArrayList<String>();
		
		Arrobj4.add("John");
		Arrobj4.add("Henry");
		Arrobj4.add("Willi");
		Arrobj4.add("Tuli");
		Arrobj4.add("Rums");
		
		Arrobj3.add("John");
		Arrobj3.add("Henry");
		Arrobj3.add("Tuli");
		Arrobj3.add("Rums");
		Arrobj3.add("Abhram");
	
		ArrayList<String> Arrobj8 = new ArrayList<String>();
	
		System.out.println("Arraylist of Integer:"+Arrobj5);
		for(int i = 0 ; i< Arrobj4.size(); i++)
		{
			for(int j = 0; j<Arrobj3.size();j++)
			{
				if(Arrobj4.get(i).equals(Arrobj3.get(j)))
				{
					Arrobj8.add(Arrobj4.get(i));
				}
			}
	}
		System.out.println("Intersection of Arraylist:"+Arrobj8);
		
		
}
}