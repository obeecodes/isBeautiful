package isBeautiful;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class BeautyChecker {

	public static void main(String[] args) {
		
		Random rand = new Random();
		ArrayList<Person> group = new ArrayList<Person>();
		ArrayList<Day> year = new ArrayList<Day>();
		
		try {
			File women = new File("/Users/obee/Downloads/women.csv");
			Scanner scan = new Scanner(women);
			
			scan.useDelimiter(",|\n");
			
			while(scan.hasNext()) {
				String lastName = scan.next();
				String firstName = scan.next();
				group.add(new Person(firstName, lastName, rand.nextBoolean()));
			}
			
			group.add(new Person("Yuu", "Feeling", true));
			
			scan.close();
			
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		for(Person person : group) {
			year.add(new Day(person));
		}
		
		for(Day days : year) {
			new Thread(days).start();
		}
		
		for(Person person : group) {
			
			if(person.getpretty()) {
				if(person.getBeautiful()) {
					System.out.printf("%s %s is pretty and beautiful.\n\n", person.getfirstName(), person.getlastName());
				}else if (!person.getBeautiful()){
					System.out.printf("%s %s is pretty, but is not beautiful.\n\n", person.getfirstName(), person.getlastName());
				}
				
			}else {
				if(person.getBeautiful()) {
					System.out.printf("%s %s is not pretty, but is beautiful.\n\n", person.getfirstName(), person.getlastName());
				}else {
					System.out.printf("%s %s is not pretty and is not beautiful.\n\n", person.getfirstName(), person.getlastName());
				}
				
			}
			
		}

	}

}
