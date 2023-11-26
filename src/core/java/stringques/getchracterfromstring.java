package core.java.stringques;

public class getchracterfromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Geeks Gor Geeks";
		//getchracterfromstring.getCharfromString(name, 3);
		//getchracterfromstring.getCharfromString2(name, 4);
		//System.out.println(name.substring(0, 6)+"F"+name.substring(6+1));
		StringBuilder replacechar = getchracterfromstring.replacechar(6,name ,'F');
		System.out.println(replacechar);
	}
   
	public static void  getCharfromString(String str ,int index) {
		
		char ch=str.charAt(index);
		System.out.println(ch);
	}
	
	//2nd way
public static void  getCharfromString2(String str ,int index) {
		
		char[] charArray = str.toCharArray();
		System.out.println("The divent index char id + "+charArray[index]+"+ from string");
	}



  
   public static StringBuilder replacechar(int index,String str,char ch){
	   
	      //Geeks Gor Geeks
	      //Geeks
	   //by simple 
	   //str=str.substring(0, index)+ch+str.substring(index);
	   //by stringBuilder method
	   StringBuilder sb=new StringBuilder(str);
	    sb.setCharAt(index, ch);
	   return sb;
	    
   }

}