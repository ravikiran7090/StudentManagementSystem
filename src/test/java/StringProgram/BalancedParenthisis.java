package StringProgram;

import java.util.Stack;

public class BalancedParenthisis {

	public static void main(String[] args) {
	String input="((()))()";
   
	boolean status = checkParenthis(input);
	System.out.print(status);
	}

	private static boolean checkParenthis(String input) {
		char[] inputArray = input.toCharArray();
		Stack<Character> stack= new Stack<Character>();
		for(char currentChar:inputArray) {
			if(currentChar=='(') {
				stack.push(currentChar);
			}
			else {
				if(currentChar==')') {
					if(stack.empty()) {
						return false;
					}
					else {
						char pop = stack.pop();
						if(pop!='(') {
							return false;
						}
					}
				}
			}
		}
		return stack.isEmpty();
	}

}
