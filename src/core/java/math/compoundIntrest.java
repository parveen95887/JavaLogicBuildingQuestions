package core.java.math;

public class compoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p=1200;
		float r=5.4f;
		int t=2;
		float intrest=(float) (p*(Math.pow((1+r/100), t)));
		System.out.println(intrest);
		
     compoundIntrest.perimeter(10, 20);
		 
	}
	
	//calculate perimeter
    
	public static void perimeter(int lent,int breat) {
		
		 int permiter=2*(lent+breat);
		 System.out.println(permiter);
	}
}

