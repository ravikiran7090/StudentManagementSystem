package StringProgram;

public class SeperateAlphabetAndDigitFromAString {

	public static void main(String[] args) {
		String input="Ra123Vi";
		
		StringBuilder Alphbets= new StringBuilder();
		StringBuilder Numbers= new StringBuilder();
		for(char currentChar:input.toCharArray()) {
			if(Character.isAlphabetic(currentChar)) {
				Alphbets.append(currentChar);
			}
			else if(Character.isDigit(currentChar)) {
				Numbers.append(currentChar);
			}
		}
		System.out.println("Alphbet in String "+Alphbets);
		System.out.println("Number in string "+Numbers);

	}

}
