package IntegerProgram;

public class MoveAllZeroToEndOfArray {

	public static void main(String[] args) {
		int Array[]= {1,0,2,0,3,0,0,4,0,5,0};
		
		int NonZeroNumber=0;
		for(int current=0; current<Array.length; current++) {
			if(Array[current]!=0) {
				int temp=Array[NonZeroNumber];
				Array[NonZeroNumber]=Array[current];
				Array[current]=temp;
				NonZeroNumber++;
			}
			
		}
		for(int num:Array) {
		System.out.print(num);
		}
		
	}

}
