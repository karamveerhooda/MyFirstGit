
public class pencil extends upcasting{

	void write(){
		System.out.println("Write with pencil in pencil class");
	}
	
	void blackpencil()
	{
		System.out.println("write with black pencil in pencil class");
	}
	
	public static void main(String[] args) {
	 
		upcasting upobj = new upcasting();
		pencil pencilobj = new pencil();
		
		// this is called normal upcasting
		upcasting upobj1 = pencilobj;
		upobj1.write();
		upobj1.read();
	    
	
		pencil pencilobj1 = (pencil) upobj1;
		pencilobj1.write();
	
	}

}
