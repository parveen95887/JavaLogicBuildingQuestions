package core.java.math;

public class AddComplexNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		complex2 ob1=new complex2(4,5);
		complex2 ob2=new complex2(6,5);
		ob1.show();
		ob2.show();
        complex2 addcomplexnumber = complex2.addcomplexnumber(ob1, ob2);
        addcomplexnumber.show();
	}

}
class complex2
{
	
	int real,imag;
	
	public complex2(int x,int y)
	{
		this.real=x;
		this.imag=y;
	}
	
	public  void show()
	{
		System.out.println(this.real+"i"+this.imag);
	}
	
	
	public static complex2 addcomplexnumber(complex2 cp1,complex2 cp2)
	{
		 complex2 cp3= new complex2(0,0);
		 cp3.real=cp1.real+cp2.real;
		 cp3.imag=cp1.imag+cp2.imag;
		 
		 return cp3;
	}
	
	
	
}