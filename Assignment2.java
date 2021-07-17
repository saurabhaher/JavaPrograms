package com.assign2;
import java.util.Scanner;

class CircleComputation{
	double radius;
	Scanner In = new Scanner(System.in);
	void insert()
	{
	System.out.println("enter the radius");
	 
	 radius = In.nextDouble();
	 
	}
	void ComputeArea()
	{
		double area = radius * radius * 3.14;
		System.out.printf("Area is "+"%.2f", area);
		System.out.println();
	};
	
	
	void ComputeCircumference()
	{
		double C = radius *2 *3.14;
		System.out.printf("Circumference is "+"%.2f", C);
	}
}

class Customer{
	int CustID;
	String CustName,CustCity;
	public String getCustName() 
	{
		    return CustName;
	}
	public void setCustName(String c) 
	{
		    this.CustName = c;
	}
	public String getCustCity() 
	{
		    return CustCity;
	}
	public void setCustCity(String c) 
	{
		    this.CustCity = c;
	}
	public int getCustID() 
	{
		    return CustID;
	}
	public void setCustID(int c) 
	{
		    this.CustID = c;
	}
	public void print()
	{
		System.out.println(CustID+"\t"+CustName+"\t"+CustCity);
	}

}

class Employee {
	String Name;
	int Code,Hours,WPH;
	
	public Employee(String s,int Code, int Hours, int WPH)
	{
		this.Name= s;
		this.Code =Code;
		this.Hours =Hours;
		this.WPH = WPH;

	}
	public void WageCalculator()
	{
		int wage = WPH* Hours;
		System.out.println(wage);
	}
}

class Area
{
	public static float calculateArea(float radius)
	{
		return (float) (radius*3.14*radius);
	}
	public static float calculateArea(float length, float breadth)
	{
		return (float) (length *breadth);
	}
	public static float calculateArea(int radius, float height)
	{
		return (float) (radius*3.14*radius*height);
	}
	
}



public class Assignment2 {

	public static void main(String[] args) {

		System.out.println(Area.calculateArea(2f,3f));

	}

}
