class method1
{
	int a;
	void firstmethod()
	{
		
	}
	int firstmethod(int b, int c)
	{
//		b= 5; c= 6;
		return b*c;
	}
	double firstmethod(double a)
	{
//		a = 100.5;
		return a*a;
	}
}

public class Methodoverload {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		method1 methobj = new method1();
		methobj.firstmethod();
		System.out.print("No arguments ");
		int a = methobj.firstmethod(5, 6);
		System.out.println();
		System.out.print("Result of paramter method is :"  + a);
		System.out.println();
		System.out.print("Result of single parameter method is :" + methobj.firstmethod(5.5));
	}

}
