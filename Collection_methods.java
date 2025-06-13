package Collection_ex;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_methods {

	public static void main (String[] args){
		
		Collection c1= new ArrayList();//Upcasting
		
		c1.add("Collection");
		c1.add('C');
		c1.add(1250);
		c1.add(7.455);
		c1.add(null);
		
	System.out.println(c1);
	c1.remove(1250);
	System.out.println(c1);
	boolean b1= c1.contains('c');
	System.out.println(b1);
	
	
	}
}
