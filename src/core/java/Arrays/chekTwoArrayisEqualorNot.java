package core.java.Arrays;

import java.util.Arrays;

public class chekTwoArrayisEqualorNot {

	public static void main(String[] args) {
		// TODO A8uto-generated method stub
      int a[]= {1,2,3,4,5};
      int b[]= {1,2,3,4,5};


      //chek two array are eqaul or not 1st wth Arrays method
      
      chekTwoArrayisEqualorNot.compaeArr(a, b);
      chekTwoArrayisEqualorNot.compareArray(a, b);
	}
	//chek two array are eqaul or not 1st wth Arrays method Arrays.equal();
	 public static void compaeArr(int a[],int b[] ) {
   	  
		  //step 1st => check the both array length are equal of not if equal then check  element
		  if(a.length ==b.length) {
			  
			  boolean res = Arrays.equals(a, b);
			  if(res){
				  System.out.println("These arrays are equal");
			  }else {
				  System.out.println("These are are not equal");
			  }
		  }else {  
			  System.out.println("Array length is not equal");
		  }	  
     }
	 
	 //second way chek by our logic
	 public static void compareArray(int a[],int b[]){
	      boolean res=false;
		 if(a.length==b.length){
			 
			 for(int i=0;i<a.length;i++){
				 
				 if(a[i]==b[i]) {
					 
					res=true; 
				 }else {
					 res=false;
				 }
			 }
			 //if true then eqaul
			 if(res) {
				 System.out.println("Array are equal");
			 }else {
				 System.out.println("Not Equal");
			 }
		 }else {
			 System.out.println("Array length are not eqaul");
		 }
	 }

  
		
	        
				  
}

