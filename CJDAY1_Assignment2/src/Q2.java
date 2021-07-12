import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, j, count = 1;
		int arr[] = new int[20];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of employees :");
		num = sc.nextInt();
		
		if ( num < 0) {
			System.out.println("Invalid input");
			
		}
		else if ( num > 20 ) {
			System.out.println("Only 20 employees are allowed");
		}
		
		else {
			System.out.println("Enter salaries of employees :");
			for ( i = 0; i < num; i++) {
				arr[i] = sc.nextInt();
				if ( arr[i] < 0) {
					System.out.println("Invalid input!");
					break;
				}
			}
			for ( i = 0; i < num; i++) {
				for ( j = i + 1; j < num; j++) {
					if ( arr[i] == arr[j]) {
						count++;
					}
				}
				if ( count != 1 ) {
					break;
				}
			}
			
		}
		
		System.out.println("No. of employees having same salary : " +count);
	}

}