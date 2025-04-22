package IntegerProgram;

public class StarProgram {

	public static void main(String[] args) {
	int star =7;
	int space=0;
	int n=4;
	for(int i=n; i>=1; i--) {
		for(int k=1; k<=n-i; k++) {
			System.out.print(" ");
		}
		for(int j=1; j<=2*i-1; j++) {
			System.out.print("*");
		}
		
		
	
		System.out.println();
		space=space+1;
		star=star-2;
	}
		
		
		
	}

}
