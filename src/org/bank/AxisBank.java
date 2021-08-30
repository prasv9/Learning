package org.bank;

public class AxisBank extends BankInfo {
 
public void dep() {
System.out.println("deposit interst is 9%");
	
}
 public static void main(String[] args) {
	AxisBank a= new AxisBank();
	a.dep();
	a.fix();
	a.sav();
	System.out.println("Branch1");

	System.out.println("Branch2");

	
}
}