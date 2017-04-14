package Casting;

public class Testing {

	public  void print(Object pi)
	{
		((ipencil) pi).write();
	}
	public static void main(String[] args) {
		
		//1.
		
		Testing test = new Testing();
		
		ipencil objpen = new pencil();
		objpen.write();
		System.out.println("after first");		
		
		//2. reference ipencil, redpencil obj and write method.
		ipencil objipen = new redpencil();
	    objipen.write();
	    System.out.println("after second");
		
		//3.reference ipencil, obj pencilwitheraser and method erase 
	     ipencil objpen1 = new pencilwitheraser();
	     System.out.println("after third");
	     //objpen1  -- no erase method.
	     
	     //4. reference redpencil , obj pencil, method write
	     
	    // redpencil objred = (redpencil) new pencil();
	     //pencil objpen2 = new redpencil();
	     
	     //objred.write();
	     System.out.println("after fourth");
	     //5. reference pencilwitherase, object pencil and method write.
	     
	     pencil p = new pencil(); 
	     pencilwitheraser pe = new pencilwitheraser();
	     //p = pe;
	     //p.write();
	     test.print(p);
	     
	     p = pe;
	     test.print(p);
	     
	    /* pe = (pencilwitheraser)p;
	     pe.methodwitherase();
	     //pe.write();
	     
	     redpencil rp = new redpencil();
	     rp.write();
	     
	     //rp = (pencil)pe;
	     rp.write();*/
	     // generics is 
	    
	     
	     	}

}
