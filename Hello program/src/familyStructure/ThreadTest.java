package familyStructure;


public class ThreadTest implements Runnable {

	private static int counter = 1;

	public void run(){
			for (int i=0; i<10; i++){
					System.out.println(i + counter++);
					try {
						//Thread.sleep(50);
					}catch (Exception e) {}
			}
	}

}


