import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag1 = 1, flag2 = 2, count = 0;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = s.nextInt();
		
		if ( n < 0) {
			System.out.println("invalid input");
			flag1 = 0;
		}
		if ( flag1 != 0) {
			int arr[] = new int[n];
			System.out.println("Enter array elements");
			for ( int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
				if ( arr[i] < 0) {
					flag2 = 0;
					System.out.println("Invalid input");
					break;
				}
			}
			if ( flag2 != 0) {
				System.out.println("Enter element to be counted");
				int element = s.nextInt();
				for ( int i= 0; i < n; i++) {
					if ( arr[i] == element) {
						count++;
						
					}
				
				}
				System.out.println("Count of element is : " +count);
			}
			
		}
		
		
		
		
	}

}
