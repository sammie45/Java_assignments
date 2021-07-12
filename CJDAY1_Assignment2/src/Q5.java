import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i, j , temp , product = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		num = s.nextInt();
		
		if ( num < 0 ) {
			System.out.println("Invalid Input");
		}
		else {
			while ( num > 0) {
			temp = num % 10;
	        num = num / 10; 
	        product = product * temp;
			}
			System.out.println("Product of didgits = " +product);
		}
	}

}
