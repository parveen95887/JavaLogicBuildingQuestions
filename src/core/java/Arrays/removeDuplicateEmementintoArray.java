package core.java.Arrays;

public class removeDuplicateEmementintoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,2,3,4,5,5,7,12};
		//////////////////
		//with using Anoter array
		int index=0;
		int temp[]=new int[arr.length];
		for(int i=0;i<arr.length-1;i++){
					
					if(arr[i] !=arr[i+1]){
					  
						temp[index]=arr[i];
						index++;
					 }
				}
				temp[index++]=arr[arr.length-1];
				System.out.println(index);
				for(int j=0;j<index;j++) {
					
					System.out.print(temp[j]+" ");
				}
		
		///////////////////////////////////////////////////////
				//withought using other Array
				/*
		int index=0;
		//int temp[]=new int[arr.length];
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i] !=arr[i+1]){
			  
				arr[index]=arr[i];
				index++;
			}
		}
		arr[index++]=arr[arr.length-1];
		System.out.println(index);
		for(int j=0;j<index;j++) {
			
			System.out.print(arr[j]+" ");
		}
   */
	}
	

}
