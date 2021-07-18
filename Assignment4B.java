package com.assign4;
import java.util.Scanner;  

class Book{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
}

class EngineeringBook extends Book
{
	private String categary;

	public String getCategary() {
		return categary;
	}

	public void setCategary(String categary) {
		this.categary = categary;
	}
	
	
}

public class Assignment4B {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		Book b1= new Book();
		System.out.println("enter author name");
		b1.setAuthor(myObj.next());
		System.out.println("enter book no");
		b1.setBookNo(myObj.nextInt());
		System.out.println("enter price");
		b1.setPrice(myObj.nextFloat());
		System.out.println("enter title");
		b1.setTitle(myObj.next());
			
		EngineeringBook e1 =new EngineeringBook();
		e1.setCategary("physics");
		
		myObj.close();
		
	}
}
