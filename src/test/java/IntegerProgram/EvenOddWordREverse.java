package IntegerProgram;
import java.util.*;
public class EvenOddWordREverse {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        
	        if (num % 2 == 0) {
	            System.out.println("Output: " + num);
	        } else {
	            String word = convertToWords(num);
	            System.out.println("Output: " + new StringBuilder(word).reverse().toString());
	        }
	        
	        scanner.close();
	    }

	    // Convert number to words (supports 0-9, extendable if needed)
	    public static String convertToWords(int num) {
	        String[] words = {
	            "zero", "one", "two", "three", "four",
	            "five", "six", "seven", "eight", "nine"
	        };

	        StringBuilder wordRepresentation = new StringBuilder();
	        while (num > 0) {
	            int digit = num % 10;
	            wordRepresentation.insert(0, words[digit] + " ");
	            num /= 10;
	        }
	        return wordRepresentation.toString().trim();
	    }
	}



