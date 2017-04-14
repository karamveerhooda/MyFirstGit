package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

public class Familystructure {
	
	int hashcde;
	
	TreeMap<String, ArrayList<String>> tmap = new TreeMap<String, ArrayList<String>>();
	
public void putvalue(String family, ArrayList arlst)
{
		tmap.put(family,arlst);	
}
public void getvalue(String family)
{
     hashcde = family
     
}
public void findcommonchild1family(){
	
}

	public static void main(String[] args) {

		Familystructure obj1  = new Familystructure();
		
		ArrayList<String> arlst = new ArrayList<String>(4);
		arlst.add("Father1");
		arlst.add("Mother1");
		arlst.add("son1");
		arlst.add("daughter1");
		
		obj1.putvalue("1", arlst);
		
		ArrayList<String>arlst1 = new ArrayList<String>(4);
		arlst1.add("Father2");
		arlst1.add("Mother2");
		arlst1.add("son2");
		arlst1.add("daughter2");

		ArrayList<String>arlst2 = new ArrayList<String>(4);
		arlst2.add("Father3");
		arlst2.add("Mother3");
		arlst2.add("son3");
		arlst2.add("daughter3");

		TreeMap<String, ArrayList<String>> tmap = new TreeMap<String, ArrayList<String>>();
		String family = null;
		tmap.put(family, arlst);
		
		
			if(tmap.values().contains(arlst)){
				for(int j =0; j<arlst.size();j++)
				System.out.println(arlst.get(j));
			}
		
		System.out.println(tmap);
		
		// 
		}
}