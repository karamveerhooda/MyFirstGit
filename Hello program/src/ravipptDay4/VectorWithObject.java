package ravipptDay4;

import java.util.Vector;
import ravipptDay4.ItemNotFoundException;

public class VectorWithObject {

	public static void main(String[] args) throws ItemNotFoundException{
		
		Vector V = new Vector();
		
		V.add(new ClassVectorDeclaration(1,"ramada"));
		V.add(new ClassVectorDeclaration(2,"raysoft"));
		V.add(new ClassVectorDeclaration(3,"princeton"));
		V.add(new ClassVectorDeclaration(4,"city"));
		V.add(new ClassVectorDeclaration(5,"Montvale"));
		V.add(new ClassVectorDeclaration(6,"Merce"));
		V.add(new ClassVectorDeclaration(7,"BMW"));
		V.add(new ClassVectorDeclaration(8,"ANDY"));
		
		System.out.println("Elements in Vector :" +V.elementAt(3));
		System.out.println("Searching the element");
		ClassVectorDeclaration obj = new ClassVectorDeclaration(4,"city");
		System.out.println();
		System.out.println("Located at location" +V.indexOf(obj));
		
		
			}
}
