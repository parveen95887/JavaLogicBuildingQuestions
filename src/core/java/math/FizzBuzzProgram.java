package core.java.math;

public class FizzBuzzProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question//condition
		//print 1 To 100 number  
		//if number is divide by 3 print Fizz
		//if number is Divide by 5 then print Buzz
		//if number id Divisible by both 3 and 5 then print FizzBuzz
		
		for(int i=1;i<=100;i++) {
			
			if(i%3==0 && i%5==0) {
				System.out.print("FizzBuzz");
			}else if(i%3==0) {
				System.out.print("Fizz");
			}else if(i%5==0) {
				System.out.print("Buzz");
			}else{
				System.out.print(" "+i+" ");
			}
			
		   }

	}

}
