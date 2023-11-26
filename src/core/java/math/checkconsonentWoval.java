package core.java.math;

public class checkconsonentWoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chkchar.chkconso('q');
         chkchar.calculateFactorial(5);
	}

}
class chkchar{
	
	
	public static void chkconso(char ch) {
		
		
		if(ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u') {
			
			System.out.println("vovel");
		}else {
			System.out.println("consonent");
		}
		
	}
public static void calculateFactorial(int num) {
	int fact=1;
	//5>1
	System.out.println("hello ");
	for(int i=num;num>=1;i--) {
		System.out.println("num "+num);        
		 fact=fact*i;
		 System.out.println(fact);
	 }
	 
	System.out.println(fact);
}
}