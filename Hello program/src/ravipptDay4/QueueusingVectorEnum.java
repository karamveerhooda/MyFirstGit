package ravipptDay4;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import ravipptDay4.QuesueEmptyException;

public class QueueusingVectorEnum {
    public Vector vec;
	public QueueusingVectorEnum(Vector vec){
		this.vec = vec;
	}
	
	public void push(Vector<String> vec){
		vec.add("jay");
		vec.add("rom");
		vec.add("rimi");
		vec.add("sim");
		vec.add("jio");
		vec.add("tom");
		vec.add("rosh");
		vec.add("rakesh");
		vec.add("jolly");
		vec.add("twinkle");
		vec.add("ramesh");
		vec.add("charlie");
		vec.add("tango");
	}
	public void pop(Vector<String> vec) throws QuesueEmptyException
	{
		System.out.println("Size of vector is :"+vec.size());
		int vecsize = vec.size() - 1;
		for(int i = vecsize; i >= 0; i--){
			System.out.println("Elements in vector :"+vec.get(i));
		}
		if (vecsize == -1)
		{ 
			throw new QuesueEmptyException("Empty Queue");
		}
	}
	public void peek(Vector<String> vec){
		
		// display vec and after popping first element do break;		
	}
	public void Srch(Vector<String> vec, String str) throws ItemNotFoundException
	{
		boolean  ind=(vec.contains(str))?false:true;
		if(ind){
			throw new ItemNotFoundException(str);
		}
	}
	void PrintAll(Vector vec, Enumeration vEnum) throws QuesueEmptyException
	{
		while(vEnum.hasMoreElements()){
		   System.out.println(vEnum.nextElement());
		}
		if(vec.isEmpty()){
			throw new QuesueEmptyException("Queue is Empty");
		}
	}
	public static void main(String[] args) {

	Vector<String> vec = new Vector<String>(7, 2);
	Enumeration<String> vEnum = vec.elements();
	
	QueueusingVectorEnum obj = new QueueusingVectorEnum(vec);
    obj.push(vec);
    obj.pop(vec);
    obj.peek(vec);
    obj.Srch(vec, "rom");
    obj.PrintAll(vec,vEnum);
 }
}
