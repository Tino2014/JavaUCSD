package mymodule5;

public class AbstractDemo {
	public static void main(String args[]) {
		Salary s = new Salary("Zhiqi Lu", "Shanghai", 1234, 3600.0);
		Employee e = new Salary("Luyao Peng", "HongKong", 5678, 1200.0);
		
		System.out.println("Calling mailCheck using Salary reference--");
		s.mailCheck();
		
		System.out.println("Compute pay for Salary object s--" + s.computePay());
		System.out.println("Compute pay for Employee reference object e--" + e.computePay());
		
		System.out.println("Calling mailCheck using Employee reference--");
		e.mailCheck();
	}
}
