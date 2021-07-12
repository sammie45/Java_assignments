
public class Q_sixc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0 ;
		int n2=1,n3 = 0 ;   
		System.out.println("Even numbers between 100 and 1000 \n");    
		    
		while ( n3 < 1000) {    
			n3=n1+n2; 
			n1=n2;    
			n2=n3; 
			if ( (n3 > 100) && (n3 % 2==0) ) {
				System.out.print( n3+ " "); 
			}    
			
	    }

	}
}