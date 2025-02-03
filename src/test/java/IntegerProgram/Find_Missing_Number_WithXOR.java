package IntegerProgram;

public class Find_Missing_Number_WithXOR {

	public static void main(String[] args) {
		int[] inputArray= {1,2,4,5,6};
		int SequenceSum=0;
		int inputArraySum=0;
		for(int i=0; i<=6; i++) {
			SequenceSum+=i;
		}
		for(int i=0; i<inputArray.length; i++) {
			inputArraySum+=inputArray[i];
		}
		System.out.print("Missing Number is : "+(SequenceSum-inputArraySum));

	}

}
