package core.java.stringques;

import java.util.Arrays;

public class SortStringCharactersInAlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     SortStringCharactersInAlphabeticalOrder.sortStr("java");
     SortStringCharactersInAlphabeticalOrder.sortbyArraysMethod("javab");
    
	}
	
	
	public static void sortStr(String str) {
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			    char temp;
			for(int j=i+1;j<charArray.length;j++) {
				
				if(charArray[i]>charArray[j]) {
				   	 //sonu
					//s>o
					temp=charArray[i];
					charArray[i]=charArray[j];
					charArray[j]=temp;			
				}
			}
		}
		System.out.println(charArray);
 }
	//second Approact by Arrays.sort(charArray[]);method
	
	public static void sortbyArraysMethod(String str) {
		
		 char arr[]=str.toCharArray();
		 
		 Arrays.sort(arr);
		 System.out.println(arr);
	}
 }
