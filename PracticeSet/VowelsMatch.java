package com.basic;

public class VowelsMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(VowelsMatches("rss"));
		System.out.println(VowelsMatches("Sawant"));

	}

	private static boolean VowelsMatches(String string) {
		// TODO Auto-generated method stub
		return string.toLowerCase().matches(".*[aeiou].*");
	}

}
