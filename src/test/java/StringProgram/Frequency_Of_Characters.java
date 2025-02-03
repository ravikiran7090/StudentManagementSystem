package StringProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Frequency_Of_Characters {

	public static void main(String[] args) {
		String s="madam";
		char[] str = s.toCharArray();
		LinkedHashMap<Character, Integer> frequencyMap=new LinkedHashMap<Character, Integer>();
		for(char ch:str) {
			frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1 );
		}
		for(char ch:frequencyMap.keySet()) {
		System.out.println(ch+" "+frequencyMap.get(ch));
		}
		
		
	}

}
