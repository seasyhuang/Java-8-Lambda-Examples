package java8lambdabasics;

import java.util.Arrays;
import java.util.Comparator;

public class Java8LambdasPart1 {
	
	
	public static void main(String[] args) {
		String s1 = "hello world";
		String s2 = "world hello";
		String[] testStrings = new String[] {s1, s2};
		
		// java 7 way
		
		Arrays.sort(testStrings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s1.length() - s2.length());
			}
		});
		
		
	}
	

}
