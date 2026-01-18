package com.practiceSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Rupesh","Sawant","Sawant",""
				+ "Satara","Patan","Maneri");
		
		Set<String> set = list.stream().collect(Collectors.toSet());
		System.out.println(set);
		
		
		

	}

}
