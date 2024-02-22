package org.coll;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;

public interface CollectionList {

	public static void main(String[] args) {
		Set<Double> s=new HashSet();
		List<Double> l=new LinkedList();
		
		s.add(2.5);
		s.add(3.56);
		s.add(1.9876);
		s.add(3.4567);
		System.out.println(s);
		
		l.addAll(s);
		
		System.out.println(l);
		
		
	}
	
		
	
	
}
