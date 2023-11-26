package core.java.Arrays;

public class FindMaxAndMinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {11,8,9,1,12,4,7,};
        boolean res=cheklist.chekorde(arr);
        System.out.println(res);
		/*
		 * int[] arr = { 5, 8, -2, 15, 10, -3, 0, 12 };
		 * 
		 * int max = arr[0]; // Initialize max with the first element int min = arr[0];
		 * // Initialize min with the first element
		 * 
		 * for(int i=1;i<arr.length;i++) { //8>5 //-2>8//15>8//10>15//-3>15//0>15//12>15
		 * if(arr[i]>max) { max=arr[i];//8,15, } //8<5
		 * //-2<5//15<-2//10<-2//-3>-2//0<-2//12<-2 if(arr[i]<min) { min=arr[i];//-2 } }
		 * 
		 * System.out.println("Maximum: " + max); System.out.println("Minimum: " + min);
		 */        
    }


	}
//for chek the given list is in assending order or not 
 class cheklist
 {
	 public static boolean chekorde(int arr[]) {
		 boolean assending=true;
		 for(int i=0;i<arr.length-1;i++)
		 {
			 if(arr[i]>arr[i+1])
			 {
				 assending=false;
			 }
			 //System.out.println(assending);
		 }
		 
		 if(assending)
		 {
		      assending=true;
		 }
		 return assending;
	 }
 }