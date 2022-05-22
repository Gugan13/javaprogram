package org.bank;

public class AxisBank extends HdfcBank{

	public void empName() {
		System.out.println("Rajkumar");
	}

	public void empAddress() {
		System.out.println("Madurai");
	}

	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.empID();
		a.empName();
		a.empAddress();
		a.empState();
	}

}
