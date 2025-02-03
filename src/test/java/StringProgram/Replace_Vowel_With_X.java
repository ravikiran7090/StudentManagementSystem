package StringProgram;

public class Replace_Vowel_With_X {

	public static void main(String[] args) {
		String s="Name";
		StringBuilder sb= new StringBuilder();
        for(Character ch:s.toCharArray()) {
        	if(isVowel(ch)) {
        		sb.append('X');
        	}
        	else {
        		sb.append(ch);
        	
        }
        
        }     
        System.out.print(sb.toString());
	
	}
        public static boolean isVowel(char input) {
   		 if(input=='a'||input=='e'||input=='i'||input=='o'||input=='u'||input=='A'||input=='E'||input=='I'||input=='O'||input=='U') {
   			 return true;
   			 
   		 }
   		 else {
   			 return false;
   		 }
   	  }
	
}
	


