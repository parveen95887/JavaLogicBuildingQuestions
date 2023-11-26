package core.java.math;

import java.util.Scanner;

public class chekLepaYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter start year");
		int str=sc.nextInt();
		int end=sc.nextInt();
		System.out.println("enter sending year");
    chekLepaYear.chekLeapYear(str,end);
	}
   public static void chekLeapYear(int stryr,int endyr) {
	   System.out.println("The Leap Year are");
	   for(int year=stryr;year<=endyr;year++){   
	   if(year%4==0 && year%100!=0 || year%400==0){
		  
		   System.out.println(year);
	   }
	   
	   }
   }
}
