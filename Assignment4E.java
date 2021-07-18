package com.assign4;

abstract class Medicine{
	double attributePrice;
	double ExpiryDate;
	String getDetails()
	{
		return String.format(attributePrice+" "+ExpiryDate);
		
	}
	public abstract void displayLabel();
}

class Tablet extends Medicine{

	@Override
	public void displayLabel() {
		System.out.println("store in cool dry places");
	}
}

class Syrup extends Medicine{

	@Override
	public void displayLabel() {
		System.out.println("For external use only");
	}
}

class Ointment extends Medicine{

	@Override
	public void displayLabel() {
		System.out.println("Take as per doctor's advice");
	}
}

public class Assignment4E {

	public static void main(String[] args) {
		Medicine m1 = new Tablet();
		m1.displayLabel();
		
		
	}

}
