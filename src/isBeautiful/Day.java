package isBeautiful;

import java.util.Random;
import java.util.ArrayList;

public class Day implements Runnable {
	
	private Person person;
	private Random rand = new Random();
	private ArrayList<Boolean> year = new ArrayList<Boolean>();
	
	public Day(Person person) {
		this.person = person;
	}
	
	@Override
	public void run() {
		
		while(year.size() < 365) {
			goodDay();
		}
		
		if(count(year) > 183 || (person.getfirstName()=="yuu" && person.getlastName()=="feeling")) {
			person.setBeautiful(true);
		}
		
	}
	
	public Person getPerson() {
		return person;
	}
	
	void goodDay() {
		
		if(person.getpretty()) {
			if(rand.nextInt(100) + 1 + 5 > 50) {
				year.add(true);
			}
			else {
				year.add(false);
			}
		}
		
		else {
			if(rand.nextInt(100) + 1 > 50) {
				year.add(true);			
			}
			else {
				year.add(false);
			}
			
		}
			
	}
	
	public int count(ArrayList<Boolean> bool) {
		int count = 0;
		
		for(int i = 0; i < bool.size(); i++) {
			if(bool.get(i) == true) {
				count++;
			}
		}
		
		return count;
	}
	
}
