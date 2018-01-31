package java8lambdabasics;

import java.util.Arrays;
import java.util.Collections;
//import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava8 {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(				
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 62), 
				new Person("Thomas", "Carlyle", 63), 
				new Person("Charlotte", "Bronte", 64),
				new Person("Matthew", "Arnold", 39)		
				);
		
		// Step 1: sort list by last name 
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		// Step 2: create a method that prints all elements in the list
//		printAll(people);
		printConditionally(people, p -> true);
		
		
		System.out.println("////////////////////////////////");
		
		// Step 3: create a method that prints all people who have a last name starting with C
		System.out.println("Printing all persons with last name beginning with C\n");
		printConditionally(people, p -> p.getLastName().startsWith("C"));

		System.out.println("\nPrinting all persons with first name beginning with C");
		printConditionally(people, p -> p.getFirstName().startsWith("C"));
		
		
	}
	
//	private static void printAll(List<Person> people) {
//		for (Person p : people) {
//			System.out.println(p);
//		}
//	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
//			if (p.getLastName().startsWith("C")) {
//				System.out.println(p);
//			}	
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}
}