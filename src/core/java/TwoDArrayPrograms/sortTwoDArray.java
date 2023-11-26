package core.java.TwoDArrayPrograms;

import java.util.Arrays;

public class sortTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int matrix[][] = { { 39, 27, 11, 42 },
                  { 10, 93, 91, 90 },
                  { 54, 78, 56, 89 },
                  { 24, 64, 20, 65 } };
		Arrays.sort(matrix,(a,b)->Integer.compare(a[3], b[3]));
		
	      for (int i = 0; i < matrix.length; i++) {
	           
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            
	      }     
	            System.out.println();
	        }
	}
	    
	}


