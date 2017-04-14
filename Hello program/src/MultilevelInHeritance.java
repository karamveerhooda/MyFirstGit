 class MultilevelInHeritance{
   void run(){};
   void bikerun(){};
 }

 class abc extends MultilevelInHeritance{
 void fast(){};
 void scooterfast(){System.out.println("Honda4run safely..");}
}
 class Honda4s extends scooters{
 void run(){System.out.println("running safely..");}
 void Honda4run(){System.out.println("Honda4run safely..");}
 
 public static void main(String args[]){
  Honda4 obj = new Honda4();
  obj.run();
 }
 }
