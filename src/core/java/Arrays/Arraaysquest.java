package core.java.Arrays;

import java.util.Scanner;

public class Arraaysquest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {2,5,7,9};
       
       Scanner sc=new Scanner(System.in);
       System.out.println("how many name you want enter");
       //int size=sc.nextInt();
       //String str[]=new String[size];
       //int m=0;
      int min=Integer.MAX_VALUE;
      int max=Integer.MIN_VALUE;
      //System.out.println(maxvalue);
      //System.out.println(minvalue);
    
      for(int i=0;i<arr.length;i++)
      {
    	  
    	  //2<-21 5<2
    	  if(arr[i]<max) {
              max = arr[i];//2,5
          }
    	 //2>21,5>21
          if(arr[i] > min) {
              min = arr[i];//
          }
          
      }
      System.out.println(max);
      System.out.println(min);
       }

}
