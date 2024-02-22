package org.coll;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public interface ListType {

	public static void main(String[] args) {
		
		List<String> l=new Vector<>();
		
		l.add(null);
		l.add("db");
		l.add("sk");
		l.add("sd");
		l.add("kp");
		
		System.out.println("original list:" +l);
		Collections.reverse(l);
		System.out.println("reverselis" +l);
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
