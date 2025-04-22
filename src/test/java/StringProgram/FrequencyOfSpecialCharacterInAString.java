package StringProgram;

import java.util.HashMap;
import java.util.Map.Entry;

public class FrequencyOfSpecialCharacterInAString {

	public static void main(String[] args) {
		String input="Ravi!@#@$^&&1234";
		HashMap<Character, Integer> frequencyMap=new HashMap<Character, Integer>();
		for(char currentChar:input.toCharArray()) {
			if(!((currentChar>='a' &&currentChar<='z')||(currentChar>='A' &&currentChar<='Z')||(currentChar>='0' &&currentChar<='9')|| (currentChar==' '))) {
				if(frequencyMap.containsKey(currentChar)) {
					frequencyMap.put(currentChar, frequencyMap.get(currentChar)+1);
				}
				else {
					frequencyMap.put(currentChar, 1);
				}
				
			}
		}
		for (Entry<Character, Integer> ch:frequencyMap.entrySet())
		System.out.println(ch.getKey() +" "+ch.getValue());
	}

}
