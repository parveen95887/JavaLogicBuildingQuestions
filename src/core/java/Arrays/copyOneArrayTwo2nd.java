package core.java.Arrays;

public class copyOneArrayTwo2nd {

	public static void rotateArray(int arr[],int str,int from) {
		int index=0;
		//1, 2, 3, 4, 5, 6, 7
		int arr2[]=new int[arr.length];
		//System.out.println(arr.length);
		for(int i=str;i<from;i++){
			arr2[index++] =arr[i];
		}
		//System.out.println(index);
		for(int j=0;j<str;j++){
			arr2[index++]=arr[j];
		}
		for(int j=0;j<arr2.length;j++){
			
			System.out.print(arr2[j]+",");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		int arr[] = {1, 2, 3, 4, 5, 6, 7}; int str = 2, from =7;
		
		copyOneArrayTwo2nd.rotateArray(arr, str, from);
		System.out.println();
		int a[]= {3,5,8};
		int b[]=new int[a.length];
		
		b=a;
		//b[0]++;
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}
	}
}
