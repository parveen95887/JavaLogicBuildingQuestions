
 package UseComparableInterf;

public class student  {
 
	
   String name;
	int marks;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", marks=" + marks + "]";
	}

}
