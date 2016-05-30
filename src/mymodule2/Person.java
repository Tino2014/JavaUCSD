package mymodule2;

public class Person {
	private String name;
	
	public Person(String n) {
		// super();
		this.name = n;
	}
	/*public Person() {
		this.name = "NameDefault";
	}*/
	public void setName(String n) {
		this.name = n;
	}
	public String getName() {
		return this.name;
	}
}
