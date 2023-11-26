package UseComparableInterf;

import java.util.Comparator;

public class idComparatore implements Comparator<student>{

	@Override
	public int compare(student o1, student o2) {
		// TODO Auto-generated method stub
		
		return o1.marks-o2.marks;
	}

}
