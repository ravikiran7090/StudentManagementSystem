package IntegerProgram;

import java.math.BigInteger;

public class Factorial_Of_Big_Number {

	public static void main(String[] args) {
		int num=5666;
		BigInteger factorial=BigInteger.ONE;
		for(int i=1; i<=num; i++) {
			factorial=factorial.multiply(BigInteger.valueOf(i));
		}
		System.out.print(factorial);

	}

}
