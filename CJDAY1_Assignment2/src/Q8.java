
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag1=1 , flag2=1 , count = 0;
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if ( n < 0 ) {
			System.out.println("Invalid input");
			flag1 =0;
		}
	    
	    if ( flag1 != 0) {
	    	int arr1[] = new int[n];
	    	int arr2[] = new int[n];
	    	int arr3[]= new int[2*n];
	    	
	    	for ( int i= 0; i<n ; i++) {
				arr1[i] = sc.nextInt();
				if (arr1[i] <= 0 ) {
					flag2 = 0;
					System.out.println("Invalid input");
				}
	    	}
	    	for ( int i= 0; i<n ; i++) {
				arr2[i] = sc.nextInt();
				if (arr2[i] <= 0 ) {
					flag2 = 0;
					System.out.println("Invalid input");
				}
	    	}
	    	if ( flag2 != 0) {
	    		for ( int i= 0; i<n ; i++) {
	    			if ( arr1[i] == arr2[i]) {
	    				arr3[i] = arr1[i];
	    				arr3[i+1] = arr1[i+1] > arr2[i+1] ? arr1[i+1] : arr2[i+1] ;
	    				
	    			}
	    			else {
	    				arr3[i] = arr1[i];
	    				arr3[i+1] = arr1[i+1];
	    				arr3[i+2] = arr2[i];
	    				arr3[i+3] = arr2[i+1];
	    				
	    			}
	    		}
	    	}
	    	
	    	for ( int i= 0; i<n ; i++) {
	    		System.out.println(arr3[i] + " ");
	    	}
	}

}
}
