import java.util.Scanner;

public class Fact {

	 int Result;
	 int fact;
	Fact( int fact){
		this.fact = fact;
	}
	
	 void facto ()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the input :");
		fact = in.nextInt();
		
		Result = fact;
		for(int i=1; i<fact; i++){
			Result = Result*i;//5,10,30,60,
		}			
	}
	
	public static void main(String[] args) {

		Fact obj1 = new Fact(6);
		obj1.facto();
		
		System.out.println( +obj1.fact+" is: " +obj1.Result);
	}
}
