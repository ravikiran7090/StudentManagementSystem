package StringProgram;

public class Reverse_Only_vowels {

	public static void main(String[] args) {
		String s="Hello";
		char[] str = s.toCharArray();
		int left=0;
		int right=str.length-1;
		String vowel="aeiouAEIOU";
		while(left<right) {
			if(vowel.indexOf(str[left])== -1) {
				left++;
			}
			else if(vowel.indexOf(str[right])== -1) {
				right--;
			}
			else {
				char temp=str[right];
				str[right]=str[left];
				str[left]=temp;
				left++;
				right--;
			}
		}
		System.out.print("output "+ new String(str));

	}

}
