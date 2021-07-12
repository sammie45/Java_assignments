import java.util.Scanner;

public class Q_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0, originalNumber, remainder, result = 0, n = 0;
		
		System.out.println(" Enter the number : ");
		Scanner s = new Scanner(System.in);
		number = s.nextInt();
        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10, ++n);

        originalNumber = number;

        for (;originalNumber != 0; originalNumber /= 10)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
        }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");

	}

}
