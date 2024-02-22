package org.coll;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface Mapinter {
public static void main(String[] args) {
	
	Map<Integer, Character> m=new LinkedHashMap<>();
	m.put(10, 'c');
	m.put(345, 'b');
	m.put(456, 'h');
	m.put(678, 'd');
	System.out.println(m);
	//getkey method
	Character ch = m.get(345);
	System.out.println(ch);
	//values method
	Collection<Character> v = m.values();
	System.out.println(v);
	//keyset method
	Set<Integer> k = m.keySet();
	System.out.println(k);
	//entryset
	Set<Entry<Integer, Character>> d = m.entrySet();
	System.out.println(d);
	
}
}
