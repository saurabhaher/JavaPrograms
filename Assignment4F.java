package com.assign4;

interface Polygon {
	
	void calcArea();
	void calcPeri();
	
}

class square implements Polygon{
	float side=0;
	@Override
	public void calcArea() {
		System.out.println(side*side);
	}

	@Override
	public void calcPeri() {
		System.out.println(4*side);
	}
	
}

class Rectangle implements Polygon{
	float length=0, breadth=0;
	@Override
	public void calcArea() {
		System.out.println(length* breadth);
		
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println(2*(length+breadth));
	}
	
}
public class Assignment4F {

	public static void main(String[] args) {
		square s1 = new square();
		Rectangle r1 = new Rectangle();
		s1.side =4;
		s1.calcArea();
		r1.length=2;
		r1.breadth=3;
		r1.calcArea();

	}

}
