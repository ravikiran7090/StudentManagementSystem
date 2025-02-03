package StringProgram;

public class Revers_Only_Letters {

	public static void main(String[] args) {
		String s="1ab2yug777kdjv";
		char[] str = s.toCharArray();
		int left=0;
		int right=str.length-1;
		while(left<right) {
			if(!Character.isAlphabetic(str[left])) {
				left++;
			}
			else if(!Character.isAlphabetic(str[right])){
				right--;
			}
			else {
				char temp=str[left];
				str[left]=str[right];
				str[right]=temp;
				
			
			left++;
			right--;
			}
		}
		
		
		System.out.print("output "+new String(str));

	}

}
