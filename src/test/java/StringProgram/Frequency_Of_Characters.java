package StringProgram;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency_Of_Characters {

	public static void main(String[] args) {
		String s="madam";
		char[] str = s.toCharArray();
		LinkedHashMap<Character, Integer> frequencyMap=new LinkedHashMap<>();
		for(char ch:str) {
			frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0)+1 );
		}
		for(Entry<Character, Integer> ch:frequencyMap.entrySet()) {
		System.out.println(ch.getKey()+" "+ch.getValue());
		}
		
		
	}

}
