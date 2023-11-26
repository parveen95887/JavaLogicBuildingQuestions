package core.java.Arrays;



public class MultiplimportantQuestOfArray {
//Hare in this class are 6-7 important question of array
	//count total element in array 
	//find odd and even element and make int arrays of odd and even 
	//find maximum value in arrayq
	//find second maximum value
	//find min value in array
	//find sum of all element and sum of even and odd element
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,7,10,8,5,3,12};
		//find sum of all elements
		/*int sum=0;
		int count=0;
		for(int i=0;i<arr.length;i++){
			
			sum=sum+arr[i];
			count++;
		}
		System.out.println(sum);
		System.out.println(count);
		*/
	    int res=arrymethod.EvenElementCount(arr);
		System.out.println(res);
		int max=arrymethod.maxNumber(arr);
		System.out.println(max);
		arrymethod.secondLargest(arr);
		
		arrymethod.arryofOddAndEven(arr);
	}

}
class arrymethod{
	//Even Element count
	public static int EvenElementCount(int arr[]) {
		  int EvenElement=0;	 
		for(int x=0;x<arr.length;x++) {
			if(arr[x]%2 ==0){
			 EvenElement +=arr[x];
			}
		}
		 return EvenElement;
	}
	//find max number 
	public static int maxNumber(int arr[]) {
		  int max=arr[0];	 
		  
		  //{2,7,10,8,5,3,12}
		for(int x=0;x<arr.length;x++) {
			if(max<arr[x]){
			  
				max=arr[x];
			}
		}
		 return max;
	}
	//find min number 
		public static int minNumber(int arr[]) {
			  int min=arr[0];	 
			  //{2,7,10,8,5,3,12}
			for(int x=0;x<arr.length;x++) {
				if(min>arr[x]){
				  
					min=arr[x];
				}
			}
			 return min;
		}
		
		//Find Second Largest Number & also this is a sorting of array
		public static void secondLargest(int arr[]){
			  int temp=0;
			for(int i=0;i<arr.length;i++){
				
				for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]){
					
					temp=arr[i];//10
					arr[i]=arr[j];//10=8;
					arr[j]=temp;
				//}
				}
			}
			}
			 System.out.print(arr[arr.length-2]);
		}
		//0,1, 2,3,4,5, 6
		//2,7,10,8,5,3,12
		//vary important Find the odd and Even array into this Given  Array 
		public static void arryofOddAndEven(int arr[]){
	
			int oddsize=0;
			 int evensize=0;
			 //use to find the count of even and odd number
			for(int i=0;i<arr.length;i++) {
				if(arr[i]%2==0){
					evensize++;
					//System.out.println("size of even number"+evensize);
				  	 
			     }else {
			    	 oddsize++;
			     }
			}
			//end
			 System.out.println("even size is"+evensize);
			 System.out.println("odd size is"+oddsize);
		  //declare arry of odd and even 
			int oddArr[]=new int[oddsize];
			int evenArr[]=new int[evensize];
			//this index initialize value one by one with increment of each even array index and odd array index 
			//according to there number of odd and even element;
			int evenindex=0;
			int oddindex=0;
		   //now you traverse the array and filter the even and odd elements
			for(int i=0;i<arr.length;i++){
				
					if(arr[i]%2==0){
						 //assign even number into even array  
	  					 evenArr[evenindex]=arr[i];
	  					 evenindex++;//increment index of even array 			    
				     }else {
				    	 oddArr[oddindex]=arr[i];
				    	 oddindex++;
				     }
				}
			System.out.println("Even Number Array");
			//print the both array element 
			for(int x=0;x<evenArr.length;x++) {
				
				System.out.print(evenArr[x]+" ");
			}
			System.out.println();
			System.out.println("Odd Number Array ");
        for(int x=0;x<oddArr.length;x++) {
				
				System.out.print(oddArr[x]+" ");
			}
		}
}
		