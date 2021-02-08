package Excercise;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="02022020";
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			reverse=reverse+name.charAt(i);
	//		System.out.print(i);
		}
		System.out.println(reverse);
	//	System.out.println(reverse);
		
		if (name.equals(reverse)) //10==10
		{
			System.out.print(name+" is a Paliandrome");			
		}
		else
			System.out.print(name + " is not a paliandrome");

	}

}
