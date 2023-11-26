package core.java.math;

public class fabonicSericeQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //fabonicSericeQuestion.fabonicserice(10);
     
     long res=fabonicSericeQuestion.findSumOfFibonacciEvenIndexes(10);
     System.out.println(res);
	}
	
	public static void fabonicserice(int number) {
		
		int x=0;
		int y=1;
		int z=0;
		int sum=0;
		System.out.println(x);
		System.out.println(y);
		int arr[]=new int[number];

		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<=number;i++) {
			
			z=arr[0]+arr[1];//0+1=1,1+1=2,1+2=3
			
		  
			System.out.println(z);
			if(z%2==0) {
				
				sum=sum+z;
			}
		}
		 System.out.println("Sum of even numbers is "+sum);
	}
	
	
	//////2nd
	public static long findSumOfFibonacciEvenIndexes(int n) {
        if (n <= 0) {
            return 0;
        }
        
        long a = 0;
        long b = 1;
        long sum = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += a;
            }
            
            long nextFib = a + b;
            a = b;
            b = nextFib;
        }
        
        return sum;
    }
}

