import java.util.Scanner;
public class Q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float Fahrenheit, Celsius;
		System.out.println( "Enter the temperature in Fahrenheit: ");
		Scanner s = new Scanner(System.in);
		Fahrenheit = s.nextInt(); 
        Celsius  = ((Fahrenheit-32)*5)/9;  
        System.out.println("Temperature in celsius is: "+Celsius);  

	}

}
