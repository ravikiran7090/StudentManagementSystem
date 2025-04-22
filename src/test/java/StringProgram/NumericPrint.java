package StringProgram;

public class NumericPrint {

	public static void main(String[] args) {
		String input = "Cost for two: 4000";
		String[] inputArray = input.split(" ");
		int number = Integer.parseInt(inputArray[inputArray.length - 1]);

		number += 50;
		int rev = 0;

		while (number > 0) {
			int rem = number % 10;
			rev = (rev * 10) + rem;
			number = number / 10;

		}
		System.out.print(rev);

	}

}
