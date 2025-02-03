package IntegerProgram;

public class SumOfArray {

	public static void main(String[] args) {
		int[] Array= {1,22,33,54};
		int sum=0;
		for(int i=0; i<Array.length; i++) {
			sum+=Array[i];
		}
		System.out.println(sum);

	}

}
