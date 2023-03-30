package com.javahelloworld;

public class Circle {
	private double radius = 1.0;
	
//	default constructor
	public Circle() {
		System.out.println("default constructor");
	}
//	param constructor;
	public Circle (double radius) {
		this.radius =radius;
	}
//	getter method for radius
	public double getRadius() {
		return radius;
	}
// setter method to set radius;
	public void setRadius(double radius) {
		this.radius = radius;
	}
//	get area method
	public double getArea() {
		return 3.14*radius*radius;
	}
	
// get circumference method
	public double getCircumference() {
		return 2*3.14*radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
