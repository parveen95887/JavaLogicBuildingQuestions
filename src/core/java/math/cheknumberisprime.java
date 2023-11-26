package core.java.math;

public class cheknumberisprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cheknumberisprime.chekprime(10);
	     
		cheknumberisprime.isprime(10);
		System.out.println("hello world");
	}
    
	 public static void chekprime(int n) {
         
        	 for(int i=2;i<=n/2;i++)
        	 {
        		 if(n%i==0)
        		 {
        			 System.out.println("not prime number"+i);
        		 }
        	 	 
        	 } 
        	 
        	 System.out.println(" prime");
	 }
	 
	 
	 public static void isprime(int num)
	 {
		 int i, j, count;
		 for(i=2;i<=num;i++){
			 
			 for( j=2;i<=num/2;j++)
        	 {
        		 if(num%i==0)
        		 {
        			 System.out.println("not prime number"+i);
        		 }
        	 	 
        	 } 
        	 
        	 System.out.println(" prime"); 
		 }
	 }
	 
	 
	 
	 
}
