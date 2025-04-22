package StringProgram;

public class StringConverter {

	public static void main(String[] args) {
		String input = "ame sma dcd";
		System.out.println(convertString(input)); // Output: aME sMA dCD
	}

	public static String convertString(String input) {
		StringBuilder result = new StringBuilder();

		for (String word : input.split(" ")) {
			if (word.length() > 0) {
				result.append(Character.toLowerCase(word.charAt(0))).append(word.substring(1).toUpperCase())
						.append(" "); // Append remaining part of the word

			}

		}
		return result.toString().trim();
	}
}
