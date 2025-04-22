package IntegerProgram;

public class HighestConsecutiveNumber {

	public static void main(String[] args) {
		int[] arr = {12, 5, 6, 7, 27, 2, 3, 4, 8, 9, 10, 15, 16,1000,1001};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		int maxNum=Integer.MIN_VALUE;
		int start=arr[0],end=arr[0];
		int maxStart=arr[0], maxEnd=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]==arr[i-1]+1) {
				end=arr[i];
				if(end>maxNum) {
					maxNum=end;
					maxStart=start;
					maxEnd=end;
				}
				}
				else {
					start=arr[i];
					end=arr[i];
				}
			}
		
		System.out.println("consecutive sequence ");
		for(int i=maxStart; i<=maxEnd; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Maximum Number : "+maxEnd);

	}

}
