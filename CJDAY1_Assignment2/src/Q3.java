import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int noOfElements = s.nextInt();
		
		if ( noOfElements < 0 ) {
			System.out.println("Invalid Input");
		}
		int [] arr = new int[noOfElements];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int even = 0, odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even += arr[i];
            else
                odd += arr[i];
        }
        if ( even > odd ) {
        	System.out.println("Maximum =  " + even);
        }
        else 
        	System.out.println("Maximum =  " + odd);

	}

}

