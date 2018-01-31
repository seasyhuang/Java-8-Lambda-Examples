package java8lambdabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExerciseSolutionJava7 {
	
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(				
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 62), 
				new Person("Thomas", "Carlyle", 63), 
				new Person("Charlotte", "Bronte", 64),
				new Person("Matthew", "Arnold", 39)		
				);
		
		// Step 1: sort list by last name 
		Collections.sort(people, new Comparator<Person>() {
			
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		// Step 2: create a method that prints all elements in the list
		printAll(people);
		
		System.out.println("////////////////////////////////");
		
		// Step 3: create a method that prints all people who have a last name starting with C
		System.out.println("Printing all persons with last name beginning with C");
		printConditionally(people, new Condition() {
			
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}			
		});
		
		
	}
	
	private static void printAll(List<Person> people) {
		for (Person p : people) {
			System.out.println(p);
		}
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (p.getLastName().startsWith("C")) {
				System.out.println(p);
			}	
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
	}
}



interface Condition {
	boolean test(Person p);
	
}