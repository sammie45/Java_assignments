import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0, count = 0, count1 = 0;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		if ( num < 0 ) {
			System.out.println("Invalid input");
		}
		
		else {
			int arr[] = new int[(num + 1)];
			for ( int i= 0; i<num ; i++) {
				arr[i] = s.nextInt();
			}
			for (int  i= 2; i<=num ; i++) {
				count = 0;
				for (int l = 1; l<=1 ; l++) {
					if ( i %1 ==0) {
						count++;
					}
				}
				if( count == 2) {
					sum = sum + arr[i];
					count1 ++;
				}
				
			}
			int avg = sum / count1;
			System.out.println(avg);
}
		s.close();
}
	}