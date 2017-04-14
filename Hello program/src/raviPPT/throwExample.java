package raviPPT;
import java.util.ArrayList;
import java.util.Iterator;
import raviPPT.EmployeeNotFoundException;
import raviPPT.employeeDetail;

public class throwExample {

public void emplst(ArrayList arlst)
	{
	     	Iterator itr = arlst.iterator();
	     	
	     	while(itr.hasNext()){
	     		System.out.println("Element in arraylist are: "+itr.next());
	     	}
	}
public void srchemployee(String emp, ArrayList arlst) throws EmployeeNotFoundException
{
	employeeDetail obj1 = new employeeDetail(0,emp);
	boolean ind = true;
	int size =  arlst.size();
 	for (int i = 0; i<size;i++)// don't use arlst.size it will calculate size every time. take it in variable above
	{
	//	ind=((employeeDetail)arlst.get(i)).equals(obj1)?false:true;
 		ind=(arlst.get(i)).equals(obj1)?false:true;
		if(ind == false)
			break;
	}
	if (ind){
		throw new EmployeeNotFoundException(emp);
	}
	System.out.println("Employee found in system : "+emp);
	String S1 = new String("abcd");
	String S2 = new String("abcd");
    
	 if(S1==S2){System.out.println("one");}
	 if(S1.equals(S2)){System.out.println("two");}
	 if("abcd".equals(S2)){System.out.println("three");}
}
public void arlstdataadd()
{
	}
	public static void main(String[] args) {

		ArrayList<employeeDetail> empdetl1 = new ArrayList<employeeDetail>();
		
		employeeDetail obj2 = new employeeDetail(006,"John");
		
		empdetl1.add(new employeeDetail(001, "Sam"));
	    empdetl1.add(new employeeDetail(002,"virus"));
	    empdetl1.add(new employeeDetail(003,"rimi"));
	    empdetl1.add(new employeeDetail(004,"joy"));
	    empdetl1.add(new employeeDetail(005,"Selena"));
	    empdetl1.add(obj2);
	    
		 for (employeeDetail str: empdetl1)
		 {
			System.out.println(str);
	     }
		 throwExample thrw = new throwExample();
		 thrw.srchemployee("rimi", empdetl1);
		 
		try
       {
		/*	arlst.add("rimpi");
			arlst.add("roschelle");
			arlst.add("trouseer");*/
       }catch(InvalidEmployeenameException excep)
       {
    	  System.out.println(excep.getMessage());
    	  excep.printStackTrace();
       }
		catch(EmployeeNotFoundException excep1)
		{
			System.out.println(excep1.getMessage());
	    	  excep1.printStackTrace();
		}
		finally
		{
			System.out.println("***End of the execution********");
		}
	}
}

