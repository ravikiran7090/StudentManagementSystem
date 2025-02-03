package IntegerProgram;

import java.util.HashMap;

public class Roman_to_Integer {

	public static void main(String[] args) {
		String input="IV";
		//read right to left
		int result=0;
		int previousValue=0;
		HashMap<Character,Integer> romanMap= new HashMap<Character,Integer>();
		//I, V, X, L, C, D, and M,
		//1, 5, 10, 50, 100, 500, and 1,000.
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);
		for(int i=input.length()-1; i>=0; i--) {
			int currentValue=romanMap.get(input.charAt(i));
			if(currentValue>=previousValue) {
				result+=currentValue;
			}
			else {
				result-=currentValue;
			}
			previousValue=currentValue;
		}
		System.out.println(result);

	}

}
