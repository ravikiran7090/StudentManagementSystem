package IntegerProgram;

public class DiffereentTriangle {
	
	    public static void main(String[] args) {
	        int n = 5;

	        // Right-Angled Triangle
	        System.out.println("Right-Angled Triangle:");
	        for (int i = 1; i <= n; i++) {
	            System.out.println("*".repeat(i));
	        }

	        // Inverted Right-Angled Triangle
	        System.out.println("\nInverted Right-Angled Triangle:");
	        for (int i = n; i >= 1; i--) {
	            System.out.println("*".repeat(i));
	        }

	        // Equilateral Triangle
	        System.out.println("\nEquilateral Triangle:");
	        for (int i = 1; i <= n; i++) {
	            System.out.println(" ".repeat(n - i) + "* ".repeat(i));
	        }
	       
	    }
	}


