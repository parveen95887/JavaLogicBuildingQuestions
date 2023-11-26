package core.java.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class a {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       //String name = br.readLine();
       
      //int a=Integer.parseInt(br.readLine());
      //int b=Integer.parseInt(br.readLine());
      //int c=Integer.parseInt(br.readLine());
      //String checkoddEven = a.checkoddEven(num);
      //System.out.println(checkoddEven);
      //int findlargest = findlargest(a,b,c);
     // System.out.println(findlargest);
       //a.chekfriend("jony");
   	}
	
	//addintion of binary number
	public static String addbinarynumbers(String x,String y)
	{
		int n1=Integer.parseInt(x, 2);
		int n2=Integer.parseInt(y, 2);
		
		int sum=n1+n2;
		
		String res=Integer.toBinaryString(sum);

		return res;
	}
	
	public static String checkoddEven(int number)
	{
		if(number %2==0)
		{
			return "Even nuber";
		}else
		{
			return "nuber is odd";
		}
	}
	
	public static int findlargest(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			//System.out.println();
			return a;
		}
		else if(b>a && b>c)
		{
			//System.out.println();
			return b;
		}
		else 
		
			return c;
	}
	
	//chekelseif
	public static void chekfriend(String name) {
		 
		if(name.equals("karan")) {
			
			System.out.println("karna is a javaDeveloper");
		}
		else if(name.equals("Magu"))
		{
			System.out.println("Magu is an Android Developer");
	    }
		else if(name.equals("hemu"))
		{
			System.out.println("Hemu is an IOS DEVELOPER");
	    }else if(name.equals("guri"))
		{
		 System.out.println("guri is web-develpoer");	
	    }else {
	    	
	    	System.out.println(" Jony is Strugling to get a job");
	    }
	}
}

