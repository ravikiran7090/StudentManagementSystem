package IntegerProgram;

import java.util.Arrays;

public class MissingArrayNumber {

	public static void main(String[] args) {
		int[] arr= {1,5,7,9,11};
		Arrays.sort(arr);
		for(int i=1; i<arr.length; i++) {
			for(int j=arr[i-1]; j<arr[i]; j++) {
				if(!(j==arr[i-1]||j== arr[i])) {
					System.out.println(j);
				}
			}
		}

	}

}
