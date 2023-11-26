package UseComparableInterf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student st=new student();
	    st.setName("A");
	    st.setMarks(3);
	    student st2=new student();
	    st2.setName("B");
	    st2.setMarks(5);
	    student st3=new student();
	    st3.setName("c");
	    st3.setMarks(2);
	    
	    List list=new ArrayList<>();
	    list.add(st);
	    list.add(st2);
	    list.add(st3);
	   System.out.println(list);
	   
	   Collections.sort(list,new idComparatore());
	   System.out.println(list);

	   Collections.sort(list,new nameComparatore());
	   System.out.println(list);
	  
	}

}
