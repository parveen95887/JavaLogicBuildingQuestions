package core.java.stringques;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Jony";
       
        //convert string into charArray
        char[] charArray = str.toCharArray();
        //iterate array form last to 0
        for(int i=charArray.length-1;i>=0;i--) {
        	
          char ch2=charArray[i];
        String ab=	str.valueOf(ch2);
        System.out.print(ab);
        
        reverseString.reversetr(str);
        reverseString.rev3("ramlal");
        }
	}
        //second approach
        
	
	public static void reversetr(String str) {
		StringBuilder sb=new StringBuilder(str);
		StringBuilder reverse = sb.reverse();
		System.out.println(reverse);
    }
     
	//3rd approachi
	public static void rev3(String str) {
		
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
	}
}
