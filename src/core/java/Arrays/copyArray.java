package core.java.Arrays;

public class copyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {30,25,40 }; 
        // second array 
        int b[] = { 45,50,55,60,65}; 
        
        int a1=a.length;
        int b1=b.length;
        int newsize=a1+b1;
        System.out.println(newsize);
         int newarr[]=new int[newsize];
         int index=0;
        for(int i=0;i<a.length;i++){
        	
        	newarr[index++]=a[i];
        }
           
        for(int j=0;j<b.length;j++) {
        	
        	newarr[index++]=b[j];
        }
        for(int i=0;i<newarr.length;i++) {
        	System.out.print(newarr[i]+",");
        }
	}

}
