package StringProgram;

import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String str1="tomato";
		String str2="matoto";
		boolean result = CheckAnagram(str1,str2);
		System.out.print(result);

	}

	private static boolean CheckAnagram(String str1, String str2) {
		if(str1.length()!=str2.length()) {
			return false;
		}
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(s2);
	
		
		return Arrays.equals(s1, s2);
		
		
	}

}
