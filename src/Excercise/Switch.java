package Excercise;

public class Switch {

	public static void main(String[] args) {
		
		int int1=0,int2=10;
		
	//	System.out.println(int2/int1);
		
		try
		{
			System.out.println(int2/int1);
		}
		catch (Exception e)
		{
			//e.printStackTrace();
			System.out.println("you are in catch block");
		}
		//System.out.println("out side of try/catch block");		
		
		
		int month = 4;
		String name = "January";


		switch(month){  //switch (expression)
		case 1: //case value
			//Execute if the variable is matched with the case (value1) 
			System.out.print("1 is January\n");
			break;  //break acts as exit
		case 2:
			//Execute if the variable is matched with the case (value2)
			System.out.print("2 is February\n\n");
			break;   
		case 3:
			//Execute if the variable is matched with the case (value2)
			System.out.print("3 is March\n\n");        
			break;
		default:System.out.print("Not in the month range\n");
		}
		
			
		}
}
