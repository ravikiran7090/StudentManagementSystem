package IntegerProgram;

public class Find_Missing_Number {

	public static void main(String[] args) {
		int[] inputArray= {1,2,4,5};
		int MissingNumber=0;
		
		for(int i=0; i<=5; i++) {
			MissingNumber^=i;
		}
		for(int number:inputArray) {
			MissingNumber^=number;
		}
		System.out.print("Missing Number is : "+MissingNumber);

	}

}
