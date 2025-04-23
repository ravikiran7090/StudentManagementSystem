package IntegerProgram;

public class DiffereentTriangle {
	
	    public static void main(String[] args) {
	    	int n = 5;
			/* 
	*
	**
	***
	****
	*****
		*/
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

			
			
			/* 
	    *
	   **
	  ***
	 ****
	*****
		*/
			
		  for (int i = 1; i <= 5; i++) {
				for (int k = n - i; k >= 1; k--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			
			/* 
		* 
	   * * 
	  * * * 
	 * * * * 
	* * * * * 
			*/
			
			
		  for (int i = 1; i <= n; i++) {
				for (int j = n - i; j >= 1; j--) {
					System.out.print(" ");
				}
				for (int k = 1; k <= i; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			/* 
	*****
	 ****
	  ***
	   **
	    * 
			*/
			
			
			
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				for (int k = i; k <= n; k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			
			/* 
	* * * * * 
	 * * * * 
	  * * * 
	   * * 
	    * 
			*/
			
			
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				for (int k = i; k <= n; k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			
			/* 
	*
	**
	* *
	*  *
	*****
			*/
			
			
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					if ((j == 1) || (j == i) || (i == n)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}

				}
				System.out.println();
			}
	       
	    }
	}


