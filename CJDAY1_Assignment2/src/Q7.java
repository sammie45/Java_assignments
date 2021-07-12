import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float Fahrenheit, Celsius;
		System.out.println( "Enter the temperature in Fahrenheit: ");
		Scanner s = new Scanner(System.in);
		Fahrenheit = s.nextInt(); 
		if ( Fahrenheit < 0 ) {
			System.out.println("Invalid input");
		}
		else {
        Celsius  = ((Fahrenheit-32)*5)/9;  
        String str = String.format("%.02f", Celsius);
        System.out.println("Temperature in celsius is: "+str);  
		}

	}

}
