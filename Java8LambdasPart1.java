package java8lambdabasics;

import java.util.Arrays;
import java.util.Comparator;

public class Java8LambdasPart1 {
	
	
	public static void main(String[] args) {
		
		part1();
		part2();
		
	} 
	
	public static void part1() {

//		http://www.java-programming.info/tutorial/pdf/java/13-Java-8-Lambda-Expressions-Part-1.pdf
		String s1 = "hello world";
		String s2 = "world helo";
		String s3 = "testing string";
		String s4 = "abc";
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
		System.out.println(Arrays.toString(testStrings) + "\n");
		
		// Array sorted by length - java 8
		System.out.println("Sorted by length");
		Arrays.sort(lambdaTestStrings, (ls1, ls2) -> ls1.length() - ls2.length());
		System.out.println(Arrays.toString(lambdaTestStrings) + "\n");
		
		
		// Array sorted by reverse length - java 8
		System.out.println("Sorted by reverse length");
		Arrays.sort(lambdaTestStrings, (ls1, ls2) -> ls2.length() - ls1.length());
		System.out.println(Arrays.toString(lambdaTestStrings) + "\n");
		
		// Array sorted alphabetically by the first character only
		System.out.println("Sorted alphabetically by the first character only");
		Arrays.sort(lambdaTestStrings, (ls1, ls2) -> ls1.charAt(0) - ls2.charAt(0));
		System.out.println(Arrays.toString(lambdaTestStrings) + "\n");
		
		// Strings that contain “e” first, everything else second. For now, put the code directly in the lambda.
		System.out.println("Strings that contain “e” first, everything else second");
		Arrays.sort(lambdaTestStrings, (ls1, ls2) -> {
			int compareFlag = 0;
			if (ls1.contains("e") && !ls2.contains("e")) {
				compareFlag = -1;
			} else if(ls2.contains("e") && !ls1.contains("e")) {
				compareFlag = 1;
			}
			return compareFlag;
		});
		System.out.println(Arrays.toString(lambdaTestStrings) + "\n");
		
		System.out.println("Strings that contain “e” first, everything else second");
		Arrays.sort(testStrings, (ls1, ls2) -> sortByE(ls1, ls2));
		System.out.println(Arrays.toString(testStrings) + "\n");
	}
	
	public static int sortByE(String s1, String s2) {
		int compareFlag = 0;
		if (s1.contains("e") && !s2.contains("e")) {
			compareFlag = -1;
		} else if(s2.contains("e") && !s1.contains("e")) {
			compareFlag = 1;
		}
		return compareFlag;		
	}

	public static void part2() {
		
	}
}
