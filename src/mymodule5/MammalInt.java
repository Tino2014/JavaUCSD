package mymodule5;

public class MammalInt implements Animal{
	private int legNum;
	
	public MammalInt() {
		this.setLegNum();
	}
	
	// you need to implement all the methods in an Interface 
	public void eat() {
		System.out.println("Mammal eats");
	}
	
	public void travel() {
		System.out.println("Mamal travels");
	}
	
	// some unique method owned by MammalInt class
	public int noOfLegs() {
		return 0;
	}
	
	public void setLegNum() {
		legNum = 4;
	}
	
	public int getLegNum() {
		return legNum;
	}
	
	public static void main(String[] args) {
		MammalInt m = new MammalInt();
		m.eat();
		m.travel();
		System.out.println(m.getLegNum());
	}
}
