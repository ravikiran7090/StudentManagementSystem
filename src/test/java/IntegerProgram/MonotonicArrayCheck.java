package IntegerProgram;

public class MonotonicArrayCheck {

	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6};
		boolean increasing=true;
		boolean decreasing=true;
		for(int i=1; i<array.length; i++) {
			if(array[i-1]<array[i]) {
				increasing= false;	
			}
			else if(array[i-1]>array[i]) {
				decreasing=false;
			}
		}
		if(increasing||decreasing) {
		System.out.println("The given Array is Monotonic");	
		}
		else {
			System.out.println("The given Array is Non-Monotonic");
		}

	}

}
