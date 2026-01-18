package com.basic;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= null;
		System.out.println(Reverse(name));

	}

	private static String Reverse(String in) {
		// TODO Auto-generated method stub
		if(in==null) {
			throw new java.lang.NullPointerException("string not null*");
			
		}
		StringBuffer out = new StringBuffer();
		char[] chars = in.toCharArray();
		for(int i = chars.length-1;i>=0;i--) {
			out.append(chars[i]);
		}
		return out.toString();		
	}

}
