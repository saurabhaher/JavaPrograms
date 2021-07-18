package com.assign4;

class Address{
	private String AddressLine;
	private String city;
	
	public Address() {
		AddressLine = "";
		this.city = "";
	}
	public Address(String addressLine, String city) {
		AddressLine = addressLine;
		this.city = city;
	}
	public String getAddressLine() {
		return AddressLine;
	}
	public void setAddressLine(String addressLine) {
		AddressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAddressDetails()
	{
		String f=AddressLine+","+city;
		return f;
		
	}

}


class Customer{
	private String CustomerName;
	private Address residentialAddress;
	private Address officialAddress;
	
	
	public Address getOfficialAddress() {
		return officialAddress;
	}

	public void setOfficialAddress(Address officialAddress) {
		this.officialAddress = officialAddress;
	}

	public Customer() {
		
		CustomerName =" ";
		this.residentialAddress = new Address();
		this.officialAddress = new Address();
		
	}
	
	public Customer(String customerName, Address residentialAddress, Address officialAddress) {
	
		CustomerName = customerName;
		this.residentialAddress = residentialAddress;
		this.officialAddress = officialAddress;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	String getCustomerDetails()
	{
		String fs;
		fs= "CustomerName: " +CustomerName+"\n"+ "Address: "+ residentialAddress.getAddressDetails()+"\n"+"official Address: "+officialAddress.getAddressDetails();
		return fs;
	}
	
}

public class Assignment4A {

	public static void main(String[] args) {
		Address a1 = new Address("", "nashik");
		Address a2 = new Address("electronic city, banglore ", "banglore");
		Customer c1= new Customer("saurabh", a1,a2);
		System.out.println(c1.getCustomerDetails());

	}

}
