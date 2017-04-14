package familyStructure;

public class FamilyDetail {

	String Father;
	String Mother;
	String Child1;
	String Child2;
	FamilyDetail obj;
	
	public FamilyDetail(String Father, String Mother, String Child1, String Child2){
		this.Father = Father;
		this.Mother = Mother;
		this.Child1 = Child1;
		this.Child2 = Child2;
	}

	public FamilyDetail(String Child1, FamilyDetail obj){
		this.obj = obj;
		this.Child1 = Child1;
	}
	
	public String toString()
	{
		return ""+Father+" " +Mother+ " " +Child1+ " " +Child2+ " " ;
	}
	
	public boolean equals(FamilyDetail toCompare)
    {
    	System.out.println(this.Child1 + " "+toCompare.Child1);
        return (toCompare == null) ? false : (this.Child1 == toCompare.Child1);
    }
	
}

