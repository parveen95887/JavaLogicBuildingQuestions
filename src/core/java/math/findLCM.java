package core.java.math;

public class findLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lalu=hcfoftwonumber(17,13);
		System.out.println(lalu);
	}
   //hcf(highest common divisore)
  //lcm(least common multiple)
	//Function for find lcm
	public static int lcmoftwoNumber(int x,int y)
	{
		int i,l,lcm;
		//find the max value from them x and y
		 l=x>y?x:y;
		 //itirate an loop statr from max
	   for( i=l;i<=x*y;i+=l)
	   {
		    //now check the both x and y are divede by i this i is lcm 
		   if(i%x==0 && i%y==0)
		   {
			   //now break the loop because it no execute furter statement 
			   break ;
		   }
	   }
	    
	   lcm=i;
	   return lcm;
	}
	

	public static int hcfoftwonumber(int x,int y)
	{
	  int min,i;
	  if(x<y)
	  {
		  min=x;
	  }else
	  {
		  min=y;
	  }
	  for(i=min;i>=1;i--)
	  {
		 if(x%i==0 && y%i==0)
		 {
		   break;	 
		 }
	  }
	  return i;
		
	}
	
}
