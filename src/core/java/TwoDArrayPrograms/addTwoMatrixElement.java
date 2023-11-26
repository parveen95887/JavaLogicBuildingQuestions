package core.java.TwoDArrayPrograms;

public class addTwoMatrixElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int	A[][] = {{1, 2}, 
                {3, 4}};
       int B[][] = {{1, 1}, 
                {1, 1}};
       int c[][]=new  int[2][2];
       for(int i=0;i<A.length;i++) {
    	   for(int j=0;j<A[i].length;j++) {
    		   for(int x=0;x<B.length;x++) {
    	    	   for(int y=0;y<B[i].length;y++) {
    	           
    	    		   c[i][j]=A[i][j]+B[x][y];    		   
    	           }   
    	       }        	   
           }   
       }
       //print matrix
       for(int i=0;i<c.length;i++) {
    	   for(int j=0;j<c[i].length;j++) {
        	    
    		  System.out.print(c[i][j]);
           }  
    	   System.out.println();
       }
	}

}
