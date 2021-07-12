import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  sal = 0, sh = 0;
		double saving = 0;
		
		Scanner s = new Scanner(System.in);
		sal = s.nextInt();
		Scanner s1 = new Scanner(System.in);
		sh = s1.nextInt();
		
		if ( sh < 0 ) {
			System.out.println("Shifts are too small");
		}
		else {
			if ( sal < 0 ) {
				System.out.println("Salary is too small");
			}
			else if ( sal > 8000 ) {
				System.out.println("Salary is too large ");
			}
			else {
				saving = sal - ( sal * 0.2 ) - ( sal * 0.3 ) + ( sh * 0.02 * sal );
				System.out.println("Savings = " + saving);
			}
			
		
		}
		
		
	}

}
