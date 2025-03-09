package StringProgram;

public class MountainArrayCheck {

	public static void main(String[] args) {
		int[] a= {1,3,5,10, 4,2, 0};
		System.out.println(mountainArrayCheck( a));

	}

	private static boolean mountainArrayCheck(int[] a) {
		if(a.length<3) {
			return false;
		}
		int i=0;
		while(i+1<a.length && a[i]<a[i+1]) {
			i++;
		}
		while(i+1<a.length && a[i]>a[i+1]) {
			i++;
		}
		
		
		if(a.length-1==i) {
		
		return true;
		}
		else {
			return false;
		}
		
	}

}
