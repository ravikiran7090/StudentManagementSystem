package IntegerProgram;

public class NumericHallowPyramid {

	public static void main(String[] args) {
		int totalNumber=5;
		for(int row=1; row<=totalNumber; row++) {
			for(int col=1; col<=row; col++) {
				if((col==1)||(col==row)||(row==totalNumber)) {
					System.out.print(col);
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
