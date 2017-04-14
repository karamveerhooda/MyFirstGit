package familyStructure;
import java.util.*;


import familyStructure.*;
public class FamilyArrayList {
	
	//1. we need to pick first object of familydetail and compare the given child name with all the objects of arraylist. 
	//count the family object having same name of first child.
	
	ArrayList<FamilyDetail> obj1 = new ArrayList<FamilyDetail>();
	
	public void addFamily(FamilyDetail newFamily){
		this.obj1.add(newFamily); 
	}
	
	public ArrayList getFamilyList(){
		return this.obj1;
	}
	
 	
	public ArrayList getDuplicateChildsByFirstName(){
		
		ArrayList<FamilyDetail> duplicatesList = new ArrayList<FamilyDetail> ();

		HashSet s = new HashSet<String>();  
				
		LinkedList l = new LinkedList(); 
	
		for(FamilyDetail str: obj1){
			System.out.println("## Checking for "+str);
		
			if (s.add( str.Child1 )) {
					
			} else {
					System.out.println("## Found Duplicate "+str);
					duplicatesList.add(str);
				}
		}

		return duplicatesList;
	}
	


	public static void main(String[] args) {
		
		FamilyArrayList obj1 = new FamilyArrayList(); 
		
		obj1.addFamily(new FamilyDetail("Sam1", "Rita1", "John3", "Ram1"));
		obj1.addFamily(new FamilyDetail("Sam2", "Rita2", "John1", "Ram2"));
		obj1.addFamily(new FamilyDetail("Sam3", "Rita3", "John3", "Ram3"));
		obj1.addFamily(new FamilyDetail("Sam4", "Rita4", "John3", "Ram4"));
		obj1.addFamily(new FamilyDetail("Sam5", "Rita5", "John1", "Ram5"));
		obj1.addFamily(new FamilyDetail("Sam6", "Rita6", "John6", "Ram6"));
		obj1.addFamily(new FamilyDetail("Sam7", "Rita7", "John1", "Ram7"));
		obj1.addFamily(new FamilyDetail("Sam77", "Rita7", "John1", "Ram7"));

		obj1.showFamilyList();
		
		System.out.println( "duplicatesFirstNameCount = " + obj1.getDuplicateChildsByFirstName());
	
		System.out.println("*** Thread test - starting first thread ");
		
		ThreadTest t1 = new ThreadTest();
		new Thread(t1).start();
		 
		System.out.println("*** Thread test - starting second thread");

		ThreadTest t2 = new ThreadTest();
		new Thread(t2).start();
		
		System.out.println("*** Thread test ENDS ");
	
	}

	public void showFamilyList(){
		int size = this.obj1.size();
		for (int i=0; i<size; i++){
			System.out.println(obj1.get(i));
		}
	}
	
		
}
