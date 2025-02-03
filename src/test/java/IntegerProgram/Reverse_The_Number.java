package IntegerProgram;

public class Reverse_The_Number {

	public static void main(String[] args) {
		int num= 123043259;
		int rev=0;
		int lastNum;
		while(num>0) {
			lastNum=num%10;
        //Check for OverFlow
			if(rev>Integer.MAX_VALUE/10 ||(rev==Integer.MAX_VALUE/10 && lastNum>7)) {
				System.out.print(0);
				System.exit(0);
			}
			//underflow condition
			if(rev<Integer.MIN_VALUE/10 ||(rev==Integer.MIN_VALUE/10 && lastNum<-8)) {
				System.out.print(0);
				System.exit(0);
			}
			
			rev=(rev*10)+lastNum;
			num=num/10;
		}
    System.out.print(rev);
	}

}
