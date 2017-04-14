package raviPPT;

public class employeeDetail {

	private int EmployeeId;
	private String Employeename;
	protected static String s1;
	
	employeeDetail(int id, String name)
	{
	    	this.EmployeeId = id;
	    	this.Employeename = name;
	}
    public String toString()
	{
		return ""+EmployeeId+" " +Employeename ;
	}
     public boolean equals(employeeDetail toCompare)
    {
    	System.out.println(this.Employeename + " "+toCompare.Employeename);
       return this.Employeename == toCompare.Employeename;
    }
   public boolean equals(Object obj)
    {
	        	return this.equals((employeeDetail)obj);//
    }
}
