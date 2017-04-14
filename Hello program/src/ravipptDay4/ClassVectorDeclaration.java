/**
 * 
 */
package ravipptDay4;

import java.util.Vector;

/**
 * @author punam
 *
 */
public class ClassVectorDeclaration {
	
	public int id;
	public String name;
	
	public ClassVectorDeclaration(){
		id = 0;
		name = null;
	}
	public ClassVectorDeclaration(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	/*public boolean equals(Object obj)
	{
		ClassVectorDeclaration vecdec = (ClassVectorDeclaration)obj;  // how to read/understand this line?
		if(this.id == vecdec.id){
			if(this.name.equals(vecdec.name)){
				return true;
			}else if ((this.name == null) && (vecdec.name == null)) return true;
		}
		return false;
	}*/
	public String toString(){
		
		return " " +id+" "+name+" "; 
	}
	public boolean equals(ClassVectorDeclaration vec){
		
		System.out.println("Comparing the elements");
		return this.name == vec.name;
	}

	public boolean equals(Object objc){
		return this.equals((ClassVectorDeclaration)objc);
	}
}