package Excercise;

public class While {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int i=0;
	
		do//while (condition is true)
		{
			System.out.println("value of "+ i);
			Thread.sleep(1000);
			i++;  //i=i-1;			
		}
		while(i<10);
		
		
		
	}

}
