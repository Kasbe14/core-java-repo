package com.javahelloworld;

public class MainCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(5.0);
//		setting circle one radius to 3.0 with set method
		circle1.setRadius(3.0);
//	getting the are of circle1 obj;
		System.out.println(circle1.getArea()); 
// getting circum of circle1 obj;
		System.out.println(circle1.getCircumference());
// for obj 2
		System.out.println(circle2.getArea());
		System.out.println(circle2.getCircumference());
	}

}
