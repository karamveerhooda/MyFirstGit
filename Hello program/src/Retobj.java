// You can make the object as return type and can change the value of object while returning
// 
class obj3
{
	int a;
	obj3(int i)
	{
		a = i;
	}
	obj3 returnobj()
	{
		obj3 test = new obj3(a+10);
		return test;
	}
}

public class Retobj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		obj3 ob1 = new obj3(10);
		obj3 ob2;
		
		ob2 = ob1.returnobj();

		System.out.print("The object return value is : " + ob1.a) ;
		System.out.println();
		System.out.print("The changed value of returned object is : " +ob2.a);
	
	}

}
