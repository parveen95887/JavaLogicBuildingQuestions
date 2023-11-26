package core.java.Arrays;

public class RemoveOneElementIntoArray {

	public static void main(String[] args) {
	  	// TODO Auto-generated method stub
		int arr[] = {3, 9, 2, 3, 1, 7, 2, 3, 5 }; int key = 3;
		RemoveOneElementIntoArray.remveAllOccurance(arr, key);
	}

	
	//remove all occurance of an particular element from an array with single array not create new array
	public static void remveAllOccurance(int arr[],int element){
        int m=0;
        int size=0;
      //count the size of new array by travering and chek the element those are not eqaul to 3 
       for(int i=0;i<arr.length;i++){
		     if(arr[i] !=element){
		        size++;
		        }
		  }
   //insert element into array by cheking condition 
	  for(int i=0;i<arr.length;i++){
		     if(arr[i] !=element){
		       arr[m++]=arr[i];
		        }
		  }
	  //print all new elemtn added into array  trver it from new size of array 
		  for(int x=0;x<size;x++) {
           System.out.print(arr[x]+"=");    
         }
	}
}
