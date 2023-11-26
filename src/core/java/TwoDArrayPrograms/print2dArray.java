package core.java.TwoDArrayPrograms;

import java.util.Scanner;

public class print2dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter row");
	 int 	row=sc.nextInt();
		System.out.println("Enter column");
	int	col=sc.nextInt();
		print2dArray.showTDArray(row, col);
	}
	
	public static void showTDArray(int row ,int col) {
		Scanner sc=new Scanner(System.in);	
		int arr[][]=new int[row][col];
		//System.out.println(arr.length);//2 length of row
		
		for(int i=0;i<row;i++) {
			//System.out.println(arr[i].length);//4 column length
			for(int j=0;j<col;j++) {
			
				 arr[i][j]=sc.nextInt();
			}
		}
		//print array
        for(int m=0;m<row;m++) {
			
			for(int j=0;j<col;j++) {
				
				System.out.print(arr[m][j]+" ");
			}
			System.out.println();
		}
	
		
		//other way to print an 2 d array
		/*
		  int mat[][] = { { 1, 2, 3, 4 },
                  { 5, 6, 7, 8 },
                  { 9, 10, 11, 12 } };
		  
		  for(int arr5[]:mat) {
			  
			 for(int x:arr5) {
				 System.out.print(x+" ");
			 }
			 System.out.println();
		  }
		  */
	}

}
