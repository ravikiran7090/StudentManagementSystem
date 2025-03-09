package IntegerProgram;
import java.util.*;


	public class LastUniqueCharacter {
	    public static void main(String[] args) {
	        String input = "tavant";
	        printLastUniqueCharacter(input);
	    }

	    public static void printLastUniqueCharacter(String input) {
	        LinkedHashMap<Character, Integer> charCount = new LinkedHashMap<>();

	        // Count occurrences of each character
	        for (char ch : input.toCharArray()) {
	            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
	        }

	        // Iterate from the end to find the last unique character
	        for (int i = input.length() - 1; i >= 0; i--) {
	            if (charCount.get(input.charAt(i)) == 1) {
	                System.out.println("Last unique character: " + input.charAt(i));
	                return; // Exit after finding the last unique character
	            }
	        }

	        System.out.println("No unique character found.");
	    }
	}



