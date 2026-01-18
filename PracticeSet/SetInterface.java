package com.collectionFram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet s1 = new HashSet();
		LinkedHashSet s2 = new LinkedHashSet();
		TreeSet t1 = new TreeSet();
		s1.add("Rupesh");
		s1.add("Sawant");
		s1.add("Sawant");
		s2.add("Rupesh");
		s2.add("Sawant");
		s2.add("Sawant");
		t1.add(10);
		t1.add(9);
		t1.add(8);
		t1.add(11);
		t1.add(12);
		System.out.println(t1);
		
		
		
		
		System.out.println(s1);

		System.out.println(s2);

	}

}
