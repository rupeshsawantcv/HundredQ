package com.collectionFram;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		LinkedList list1 = new LinkedList();
		Vector vctr = new Vector();
	    Stack  stc = new Stack();
	    
	    list.add("Rupesh");
	    list.add("Sawant");
	    list.add(16);
	    list.add("Satara");
	    list.add(null);
	    list.add("Rupesh");
	    list.add(null);
	    list.add("Rupesh");
	    
	    list1.addAll(list);
	    vctr.addAll(list1);
	    stc.addAll(vctr);
	    
	    System.out.println(list);
	    System.out.println(list1);
	    System.out.println(vctr);
	    
	    for(Object pro : stc) {
	    	System.out.println(pro);
	    }
	    

	}

}
