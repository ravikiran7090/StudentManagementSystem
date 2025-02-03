package IntegerProgram;

public class Swap_Two_Numbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		
	//with using third variable	
	//	int temp;
	//	temp=a;
	//	a=b;
	//	b=temp;
		
		//without using third variable
		//a=a+b;
	    //b=a-b;
		//a=a-b;
		
		
		//using x OR operator
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);

	}

}
