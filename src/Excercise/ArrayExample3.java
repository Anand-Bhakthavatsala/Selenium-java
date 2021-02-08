package Excercise;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int[] position = new int[]{10,12,23,34};
		double[] marks = new double[] {21.5,22,7,24.5,23};
	//	int[] position = [10,20,30,40,50];
		String[] cars = {"Honda", "Toyota","Nissan"};
		
		int[] intArray;
		intArray=new int[20];
		int[] intArray2 = new int[] {1,2,3,4,5,6};*/
		
		int rows = 3, cols=3;
		
		int table[][]=new int[rows][cols];
		
		table[0][0]=10;
		table[0][1]=11;
		table[0][2]=12;
		
		table[1][0]=20;
		table[1][1]=21;
		table[1][2]=22;
		
		table[2][0]=30;
		table[2][1]=31;
		table[2][2]=32;
	
		int j;
		for (int i=0;i<rows;i++) //0-> 1
		{
			for(j=0;j<cols;j++)
			{
				System.out.print("  "+table[i][j]);	//table[0][2]=12;	
			//	System.out.print("  "+ j);
			}
			System.out.println();
		}
		
	//	System.out.println("out of both the for loops");
		

	}

}
