
public class Qsixd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0 ;
		int n2=1,n3,i, sum=0 ;    
		 System.out.print(n1+" "+n2);    
		 
		 sum = sum + n2;
		 for(i=2 ;i < 15; ++i) {    
			 n3=n1+n2; 
			 if ( n3< 100 ) {
			  
				 sum = n3 + sum ;
				 System.out.print(" " + n3); 
			}    
			 n1=n2;    
			 n2=n3; 
	}
		 System.out.print("\n Sum =  " + (sum));    
}
}