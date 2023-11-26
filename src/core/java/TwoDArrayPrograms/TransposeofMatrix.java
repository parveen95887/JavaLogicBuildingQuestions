package core.java.TwoDArrayPrograms;

public class TransposeofMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 1, 1, 1 }, 
                { 2, 2, 2, 2 }, 
                { 3, 3, 3, 3 }, 
                { 4, 4, 4, 4 } }; 
		int b[][]=new int[4][4];
		 TransposeofMatrix.transpose(a,b );
	}
	
	public static void transpose(int a[][],int b[][]) {
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
			
				b[j][i]=a[i][j];
				//System.out.print(b[j][i]);
			}
		}
		
for(int i=0;i<b.length;i++){
			
			for(int j=0;j<b[i].length;j++) {
				
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
	}

}
