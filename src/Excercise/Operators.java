package Excercise;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	int a,b,c;
		int a=10,b=20,c=30;		
			
		System.out.print(a);
		System.out.print(b);
		System.out.println(c);
		
		boolean exam=false;
		System.out.println(exam=true);
		char v='J';
		System.out.print(v);
		String Title = "Welcome to Java";
		System.out.println(Title+a);
		
		System.out.println(a=1000000);
		
		//Arithmetic Operators - + * / % ++ -- 
	//	System.out.println(a--);
	//	int add = a+b;
	//	System.out.println("Incremental value of a "+ (a--));
	//	System.out.print(a);
		//Relational Operator > < >= <= == != 
		if (b==c)
			System.out.print("b is equal to c");
		else
			System.out.println("false"); 
		
	//	Logical Operators : && || & | ! ^
		
		boolean India=true,China=false;
		if (India && China)
			System.out.print("India and China are true friends"); 	
		else
			System.out.print("Not true");
		

	}

}
