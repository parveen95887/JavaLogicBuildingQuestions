package core.java.TwoDArrayPrograms;

import java.util.Arrays;

public class compareToMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {1, 2, 5, 4, 0};
      int arr2[]= {1,2,5,4,0};
      
     // boolean equals = Arrays.equals(arr, arr2);
      
      boolean res=true;
      for(int i=0;i<arr.length;i++) {
    	  
    	  if(arr[i] !=arr2[i]) {
    		  
    		  res =false;
    	  }
      }
      
      if(res) {
    	  
    	  System.out.println("Equal ");
      }else {
    	  System.out.println("Not Equal");
      }
	}

}
