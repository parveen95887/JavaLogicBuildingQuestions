package core.java.Arrays;

public class ArmstromSumofAllRevnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	
		if(ArmstromSumofAllRevnumber.chekarmstronNumber(153)) {
			System.out.println("This is an Armstrome Number");
		}else
		{
			System.out.println("This is Not an Armstrome Number");
		}
    System.out.println(ArmstromSumofAllRevnumber.sumOfNumber(555));
    ArmstromSumofAllRevnumber.checkPalindromNum(121);
    */
				
		ArmstromSumofAllRevnumber.chekNeonNumber(10);
	}
	
	//sum of all number 
	public static int sumOfNumber(int num) {
		int sum=0;
		
		while(num !=0) {
			
			int rem=num%10;
			sum +=rem;
			num=num/10;
		}
		return sum;//1+2+3=6
	}
	
	//CkeakArmstronNumber
	public static boolean chekarmstronNumber(int num) {
		
		int sum=0;
		int prenum=num;
		while(num !=0){
			
			int r=num%10;
			sum=(r*r*r)+sum;
			num=num/10;
		}
		System.out.println(sum);
		if(prenum==sum) {
		 return true;
		}else{
			return false;
		}
	}
	
	//check palindrom number 
	public static void checkPalindromNum(int num){
		
		int rev=0;
		int prevn=num;
		while(num !=0) {
			
			int r=num%10;
			rev=(rev*10)+r;
			num=num/10;
		}
		if(prevn==rev) {
			
			System.out.println("This is a Palindrome Number");
		}else {
			System.out.println("This is not an palindrome Number");
		}
	}
	//Java Program to Check If a Number is Neon Number or Not
	//num=9 square= 9*9=81 if 8+1=9==num then it is an neon number other wise not
	
	public static void chekNeonNumber(int n) {
		
		int sqr=n*n;
		int sum=0;
		while(sqr !=0) {
			
			int r=sqr%10;
			sum=sum+r;
			sqr=sqr/10;
		}
		System.out.println("sum of neon number is"+sum);
		if(n==sum) {
			
			System.out.println("this is an neon number "+n);
		}else {
			System.out.println("this is not an neon number");
		}
	}
}
