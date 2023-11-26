package core.java.Arrays;

import java.util.HashSet;
import java.util.Set;

class FindCommonsElementFromArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Array1[] = {"Article","for", "Geeks", "for", "Geeks"}; 
        String  Array2[] = {"Article", "Geeks", "Geeks"};
        int[] arr1 = { 1, 4, 9, 16, 25, 36, 49, 64, 81, 100 };
    // create Array 2
    int[] arr2 = { 100, 9, 64, 7, 36, 5, 16, 3, 4, 1 };
		FindCommonsElementFromArrays.FindCommonElemtn(Array1, Array2);
		FindCommonsElementFromArrays.FindCommonElemtninInteger(arr1, arr2);
	
	}
	
	public static void FindCommonElemtn(String Array1[],String Array2[]) {
		//Find common Element from both Arrays
	
	           Set<String> newarr=new HashSet<>();
	          for(int i=0;i<Array1.length;i++){
	        	  for(int j=0;j<Array2.length;j++){
		        	  if(Array1[i]==Array2[j]){
		        		  
		        		  newarr.add(Array1[i]);
		        	  }
		          }  
	          }
	          for(String s:newarr){
	        	  
	        	  System.out.println(s);
	          }	
	}
    //Same With integer number
 	public static void FindCommonElemtninInteger(int Array1[],int Array2[]) {
 		 Set<Integer> set1=new HashSet<Integer>();
 		Set<Integer> set2=new HashSet<Integer>();
 		for(int x:Array1) {
 			
 			set1.add(x);
 		}
      for(int y:Array2) {
 			
 			set2.add(y);
 		}
      //This method is add the unique element
       set1.retainAll(set2);
      for(int z:set1) {
    	  System.out.println(z);
      }
 		
 	}
}
