package StringProgram;

public class StringConverter {

	
	
		    public static void main(String[] args) {
		        String input = "ame sma dcd";
		        System.out.println(convertString(input));  // Output: aME sMA dCD
		    }

		    public static String convertString(String input) {
		        StringBuilder result = new StringBuilder();

		        for (String word : input.split(" ")) {
		            if (word.length() >= 3) {
		                result.append(word.substring(0, 1).toLowerCase())  // First character to lowercase
		                      .append(word.substring(1, 3).toUpperCase())  // Next two characters to uppercase
		                      .append(word.substring(3));  // Append remaining part of the word
		            } else {
		                result.append(word);
		            }
		            result.append(" ");
		        }

		        return result.toString().trim();
		    }
		}


	


