package IntegerProgram;

import java.util.Arrays;

public class ArrayAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a={1,2,3,4};
	        int[] b={5,6,9};
	        int[] c={6,9};
	        int[][] arrays={a,b,c};
	        int maxLength=0;
	        for(int[] array:arrays){
	            if(array.length>maxLength){
	                maxLength=array.length;
	            }
	        }
	        int[] result=new int[maxLength];
	        for(int i=0; i<maxLength; i++){
	            int sum=0;
	            for(int[] array:arrays){
	            	if(i<array.length) {
	                sum+=array[i];
	            	}
	            }
	            result[i]=sum;
	        }
	       System.out.println(Arrays.toString(result));
	        
	}
	

}
