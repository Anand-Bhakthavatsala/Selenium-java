package Excercise;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		int a[]= {0,1,2,3,4,5,6,7,8,9};		//declare and initialize array
		int length=a.length;  //get array size
		System.out.println("Array length "+length);
		for (int i=0;i<length;i++)  //loop to print the values inside the array
		{
			System.out.print(a[i]+"  ");
		} */
		
		int a[][]= {{2,4,6,8},{1,3,5,7}}; //two dimensional array of type integer
		
		try
		{
			for (int i=0;i<2;i++)
			{
				for (int j =0;j<4;j++)
				{
					System.out.print(a[i][j]+ " ");
				}
				System.out.println();			
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
