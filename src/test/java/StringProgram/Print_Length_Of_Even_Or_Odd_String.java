package StringProgram;

public class Print_Length_Of_Even_Or_Odd_String {

	public static void main(String[] args) {
		String word="ravik";
		int length=word.length();
		System.out.print(length);
		if(length%2==0) {
			System.out.print(" The give word is of even length ");
		}
		else {
			System.out.print(" The give word is of odd length ");
		}

	}

}
