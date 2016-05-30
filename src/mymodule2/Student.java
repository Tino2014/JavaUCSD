package mymodule2;

public class Student extends Person {
	public Student(String n) {
		// compiler will add following line to your code
		// super();
		super(n);
		this.setName("Student");
	}
	
	public static void main(String[] args) {
		Student s = new Student("NameDefault");
		System.out.print(s.getName());
	}
}
