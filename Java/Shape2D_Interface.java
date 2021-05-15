//practical no. : 5

import java.util.*;

interface Shape
{
	public double area();
}

class Circle implements Shape
{
	double r;
	public Circle(double red)
	{
		r=red;
	}
	public double area()
	{
		return 3.14 * r * r;
	} 
	
}

class Rectangle implements Shape
{
	double length;
	double breadth;
	public Rectangle(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double area()
	{
		return length*breadth;
	}
}

class Triangle implements Shape
{
	double length;
	 double breadth;
	public Triangle(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public double area()
	{
		return ( length * breadth) /2;
	}
}

public class Shape2D_Interface
{
	public static void main(String [] args)
	{
		Circle c=new Circle(12);
		System.out.println("Area of circle is : " +c.area());
		
		Rectangle r=new Rectangle(3 ,5);
		System.out.println("Area of recentangle is :" +r.area());
		
		Triangle t=new Triangle(3 , 5);
		System.out.println("Area of triangle is : " +t.area());
		
	}
}