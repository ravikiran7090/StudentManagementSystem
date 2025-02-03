package StringProgram;

public class Print_The_LastWord_Length {

	public static void main(String[] args) {
		String s=" Ravi   Kiran ";
		//s=s.trim();
		char[] str = s.toCharArray();
		int count=0;
		for(int i=str.length-1; i>=0; i--) {
			if(str[i]!=' ') {
				count++;
			}
			else {
				if(count>0) {
					System.out.print(count);
					break;
				}
				
			}
		}
	//	System.out.print(count);
		

	}

}
