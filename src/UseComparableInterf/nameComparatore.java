package UseComparableInterf;

import java.util.Comparator;

public class nameComparatore implements Comparator<student>{

	@Override
		public int compare(student o1, student o2) {
			// TODO Auto-generated method stub
			
			return o1.name.compareTo(o2.name);
		}

	

}
