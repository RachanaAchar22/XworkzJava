package com.xworkz.Inheritance;

public class ShapeRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in ShapeRunner");
		Shape shape=new Shape();
		Shape shape1=new Circle();
		shape1.ShapeInfo();
		System.out.println(shape1.name);
		
		Circle circle=new Circle();
		circle.CircleInfo();
		System.out.println(circle.radius);

	}
}