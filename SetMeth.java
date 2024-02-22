package org.coll;

import java.util.Set;
import java.util.TreeSet;
public interface SetMeth {

	public static void main(String[] args) {
		
    Set<Integer> s=new TreeSet<>();
		
		s.add(20);
		s.add(34);
		s.add(36);
		System.out.println(s);
		for (Integer c : s) {
			System.out.println(c);
		}
		

	
	}	
}
