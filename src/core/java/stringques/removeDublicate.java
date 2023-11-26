package core.java.stringques;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeDublicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //removeDublicate.removeDuplicateChar("programming");
		//removeDublicate.removeDuplicateChar2("programmming");
		removeDublicate.removeDublicateBySetInterface("progmramminmg");
	}
    
	//remove duplicate char from string
	public static void removeDuplicateChar(String str) {
	    //approach 1
		  StringBuilder sb=new StringBuilder();
			  str.chars().distinct().forEach(c ->sb.append((char)c));
			 System.out.println(sb);
	 }
	//With second Approach
	//remove duplicate char from string
		public static void removeDuplicateChar2(String str) {
		    //approach 2
			  StringBuilder sb=new StringBuilder();
				  char[] charArray = str.toCharArray();
				  for(int i=0;i<charArray.length;i++) {
					  boolean repeted=false;
					  for(int j=i+1;j<charArray.length;j++) {
						   
						   if(charArray[i]==charArray[j]) {
							   repeted=true;
							   break;
						   }					  
						   }
					   
					    if(!repeted) {
					    	
					    	sb.append(charArray[i]);
					    }
				
					}
				  System.out.println(sb);
		 }
//3rd approach 
		 public static void removeDublicateBySetInterface(String str) {
			 
			  StringBuilder stb=new StringBuilder();
			  Set<Character> sl=new LinkedHashSet<>();
			  
			  for(int i=0;i<str.length();i++) {
				  
				  sl.add(str.charAt(i));
			  }
			  for(Character c:sl) {
				  
				  stb.append(c);
			  }
			  System.out.println(stb);
    }
}