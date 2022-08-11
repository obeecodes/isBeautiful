package isBeautiful;

public class Person {
	
	private String firstName;
	private String lastName;
	private boolean pretty;
	private boolean beautiful;
	
	public Person(String firstName, String lastName, boolean pretty) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.pretty = pretty;
	
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public boolean getpretty() {
		return pretty;
	}
	
	public void setBeautiful(boolean beautiful) {
		this.beautiful = beautiful;
	}
	
	public boolean getBeautiful() {
		return beautiful;
	}
	
}
