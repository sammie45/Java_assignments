import java.util.Scanner;
public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size, flag = 0;
		Scanner s = new Scanner(System.in);
		size = s.nextInt();
		if ( size < 0 ) {
			System.out.println("Invalid input");
		}
		
		else {
			int arr[] = new int[20];
			for ( int i= 0; i<size ; i++) {
				arr[i] = s.nextInt();
				if ( arr[i] < 0 && i %2== 0) {
					System.out.println("Invalid input");
					flag = 1;
					break;
				}
				else if  ( arr[i] < 0 && i %2 != 0) {
					System.out.println("Invalid input");
					flag = 1;
					break;
				}
			}
			if (flag != 1) {
				int givenscore = s.nextInt();
				for ( int i= 1; i<size ; i = (i + 2)) {
					if ( givenscore < arr[i]) {
						System.out.println(arr[i-1]);
					}
				}
			}
		}

	}

}
