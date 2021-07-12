import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d, e, f, g, h, i, j, amt;
		System.out.println("Enter the amount : ");
		Scanner s = new Scanner(System.in);
		amt = s.nextInt();
		a = amt / 500;
		b = amt % 500;
		c = a / 100;
		d = a % 100;
		e = c / 50;
		f = c % 50;
		g = e / 10;
		h = e % 10;
		i = g / 5;
		j = g % 5;
		int sum = a + c + e + g + i;
		System.out.println(" " +sum );
	}

}
