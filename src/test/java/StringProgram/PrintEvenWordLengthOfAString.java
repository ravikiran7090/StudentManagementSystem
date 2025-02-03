package StringProgram;

public class PrintEvenWordLengthOfAString {

	public static void main(String[] args) {
		String input="Sky is blue and vast";
		String[] inputArray = input.split(" ");
		for(String word:inputArray) {
			int length=word.length();
			if(length%2==0) {
				System.out.println(word);
			}
		}
		

	}

}
