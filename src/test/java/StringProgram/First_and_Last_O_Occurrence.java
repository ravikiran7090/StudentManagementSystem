package StringProgram;

public class First_and_Last_O_Occurrence {

	public static void main(String[] args) {
		String input = "Hello World hari om";
		int firstIndex = -1;
		int lastIndex = -1;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == 'o') {
				firstIndex = index;
				break;
			}

		} 
		for (int index = input.length() - 1; index >= 0; index--) {
			if (input.charAt(index) == 'o') {
				lastIndex = index;
				break;
			}
		}
		if(firstIndex<0) {
			System.out.print("Character is not present");
		}
		else {
      System.out.println(firstIndex);
      System.out.println(lastIndex);
		}
	}

}
