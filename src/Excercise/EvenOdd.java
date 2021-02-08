package Excercise;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 50;
				
		if (marks<=50)
		{
			System.out.print("Not eligible to join");
		}
		else if (marks >=90)
			System.out.print("A+ Grade");	
		else if (marks >=80 && marks <90)
			System.out.print("A Grade");
		else if (marks >=70 && marks <80)
			System.out.print("B Grade");
		else if (marks >50 && marks <70)
			System.out.print("You are eligible to apply for the seat");
	}

}
