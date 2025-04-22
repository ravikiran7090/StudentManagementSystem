package StringProgram;

public class RemoveDublicate {

	public static void main(String[] args) {
		String str1 = "automation";
		String output = removeDuplicate(str1);
		System.out.print(output);

	}

	private static String removeDuplicate(String str1) {
		char[] s = str1.toLowerCase().toCharArray();
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < s.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (s[i] == s[j]) {
					isDuplicate = true;
				}
			}
			if (!isDuplicate) {
				str.append(s[i]);
			}
		}
		return str.toString();
	}

}
