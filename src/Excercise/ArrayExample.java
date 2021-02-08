package Excercise;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 99;
		int[] numbers = new int[4]; //{10,12,23,34};
		double[] marks = new double[] {21.5,22,7,24.5,23};
	//	int[] position = [10,20,30,40,50];
		String[] cars = {"Honda", "Toyota","Nissan"};
		
		char[] c = {'a','e'};
		
		
		int[] intArray;
		intArray=new int[20];
		int[] intArray2 = new int[] {1,2,3,4,5,6};
		
		int arraylength=marks.length;
		
		System.out.println("Length of the marks array "+  marks.length);
		
	/*	System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		*/
		/*
		for (int j=0;j<arraylength;j++) //5
		{
			System.out.println(marks[j]);	//marks[0],marks[1]		
		}	*/
	
		int m=0;
		
		/*do
		{
			System.out.println("Printing marks : "+marks[m]);
			m++;			
		} 
		while(m<arraylength);  */
		
		
		for (int i=0;i<cars.length;i++)
		{
			System.out.println(cars[i]);
		}
		//while loop
//		int k = marks.length;
	//	System.out.println(k);
	//	int m=0;
		
	/*	while(m<(marks.length))
		{
			System.out.println("Printing marks : "+marks[m]);
			m++;
			
		} */
				
		
	/*	position[0] = 10;
		position[1] = 20;
		position[2] = 30;
		position[3] = 40;
		position[4] = 50;
	//	System.out.print(position[4]);
		
	*/
	}

}
