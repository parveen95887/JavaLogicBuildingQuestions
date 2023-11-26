package core.java.stringques;

public class removeSpecialCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         removeSpecialCharFromString.removespch("$j%o$ny@");
         removeSpecialCharFromString.removeWhiteSpace("   j  o n y si  n  gh ");
         
	}
	//removespecail charater from am string 
	//logic is that in str.removeAll(); method 1st parameter mens if without this charater all is remove 
	public static void removespch(String str) {
    //approach 1
		 String replaceAll = str.replaceAll("[^A-Za-z0-9]", "");
		 System.out.println(replaceAll);
 }
	 //remove all spaces from a string 
	public static void removeWhiteSpace(String str) {
	    //approach 1
			 String replaceAll = str.replaceAll("\\s", "");
			 System.out.println(replaceAll);
	 }

	
	
}
