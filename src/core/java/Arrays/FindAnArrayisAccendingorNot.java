package core.java.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class FindAnArrayisAccendingorNot {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
//		int arr[]= {2,3,4,5,6,12,1,18};
//		boolean assendingorder=true;
//		//find an array element in assending order or decending order
//		for(int i=0;i<arr.length-1;i++){
//			  
//			if(arr[i]>arr[i+1]){ 
//				
//				assendingorder=false;
//			}
//		} 
//		if(assendingorder){
//			
//			System.out.println("This is an Assending order array");
//		}else {
//			System.out.println("Not an assecding order Array");
//		}
     
		
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        int t = Integer.parseInt(br.readLine());//how many time of run this
		        int n = Integer.parseInt(br.readLine());//row
		        int m = Integer.parseInt(br.readLine());//column
		        System.out.println();// Writing output to STDOUT
		        String arr[][]=new String[n][m];
		        
		        for(int i=1;i<=t;i++){
                     //n=2 
		          for(int j=0;j<n;j++){
		             //m=3
		             for(int k=0;k<m;k++){
		               arr[j][k]=br.readLine();
		             }
		             }
		          int row=1;
		          int row2;
		          for(int x=0;x<n;x++){
		        	  int bc=0;
			           for(int y=0;y<m;y++){
			             //System.out.print(arr[x][y]);
			        	   if(arr[x][y].equals("#")){
			        		   bc=bc+1;
			        		   if(arr[x][y+1].equals("#"))
			        		   {
			        			    System.out.print("");  
			        		   }else{
			        			    break;
			        		   }
			        	   }
			        	   System.out.print(arr[x][y]);
			           }
			          
			           System.out.println(" Total black continus box in "+row+" is "+bc);
			           row++;
			           System.out.println();
			           //System.out.println();
		             }
		          System.out.println("-------------------");
		        }
		}
}

