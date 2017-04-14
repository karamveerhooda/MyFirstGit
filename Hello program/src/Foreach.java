// Search an array using for-each style for.
/*class Foreach {
public static void main(String args[]) 
{
	int nums[] = { 6, 8, 3, 7, 5, 6, 1, 4 };
	int val = 5;
	boolean found = false;
// use for-each style for to search nums for val
	for(int x : nums) 
	{
		if(x == val) 
		{
			found = true;
			break;
		}
	}
	
	if(found)
		System.out.println("Value found!");
	}
}*/


 class Foreach{
   void run(){};
   void bikerun(){};
 }

 class scooter extends Foreach{
 void fast(){};
 void scooterfast(){System.out.println("Honda4run safely..");}
}
 class Honda4 extends scooter{
 void run(){System.out.println("running safely..");}
 void Honda4run(){System.out.println("Honda4run safely..");}
 
 public static void main(String args[]){
  Honda4 obj = new Honda4();
  obj.run();
 }
 }
