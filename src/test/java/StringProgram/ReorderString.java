package StringProgram;

import java.util.Arrays;

public class ReorderString {
	
	
	
	    public static void main(String[] args) {
	        String input = "ImeriicI";
	        
	    for(int i=0; i<=input.length()-1; i++) {
	    	if(input.charAt(i)=='I') {
	    		System.out.print("i");
	    	}
	    	else if(input.charAt(i)=='i') {
	    		System.out.print("I");
	    	}
	    	else {
	    		System.out.print(input.charAt(i));
	    	}
	    }
	    	
	    }
}
	
	



