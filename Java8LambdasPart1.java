package java8lambdabasics;

import java.util.Arrays;
import java.util.Comparator;

public class Java8LambdasPart1 {
	
	
	public static void main(String[] args) {
		
//		http://www.java-programming.info/tutorial/pdf/java/13-Java-8-Lambda-Expressions-Part-1.pdf
		String s1 = "hello world";
		String s2 = "world hello world";
		String s3 = "testing string";
		String s4 = "test";
		String s5 = "lambdas";
		String[] testStrings = new String[] {s1, s2, s3, s4, s5};
		String[] lambdaTestStrings = new String[] {s1, s2, s3, s4, s5};
		
		// Array sorted by length - java 7
		Arrays.sort(testStrings, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s1.length() - s2.length());
			}
		});
		System.out.println(Arrays.toString(testStrings));
		
		// Array sorted by length - java 8
		System.out.println("Sorted by length");
		Arrays.sort(lambdaTestStrings, (ls1, ls2) -> ls1.length() - ls2.length());
		System.out.println(Arrays.toString(lambdaTestStrings));
		
		
		// Array sorted by reverse length - java 8
		System.out.println("Sorted by reverse length");
		Arrays.sort(lambdaTestStrings, (ls1, ls2) -> ls2.length() - ls1.length());
		System.out.println(Arrays.toString(lambdaTestStrings));
		
	}
}
