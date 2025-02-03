package IntegerProgram;

public class Find2ndLargestNumber {

	public static void main(String[] args) {
	int[] Array= {1,3,2,7,5};
	int firstLargest=Integer.MIN_VALUE;
	int secondLargest=Integer.MIN_VALUE;
	for(int num:Array) {
		if(num>firstLargest) {
			secondLargest=firstLargest;
			firstLargest=num;
		}
		else if(num>secondLargest && num!=firstLargest) {
			secondLargest=num;
		}
	}
	System.out.println(secondLargest);

	}

}
