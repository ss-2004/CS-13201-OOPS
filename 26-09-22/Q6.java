// Shresth Sonkar
// 20214272
// Q6

import java.util.*;
class Circle
{
	private double radius;
	private final double PI=3.14159;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	double getRadius()
	{
		return radius;
	}
	
	void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	double getArea()
	{
		return PI*getRadius()*getRadius();
	}
	
	double getDiameter()
	{
		return 2*getRadius();
	}
	
	double getCircumference()
	{
		return 2*PI*getRadius();
	}	
}

class Q6
{
	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter radius : ");
		double r = ss.nextDouble();
		Circle c1 = new Circle(r);
		System.out.println("Area = " + c1.getArea());
		System.out.println("Circumference = " + c1.getCircumference());
		System.out.println("Diameter = " + c1.getDiameter());
	}

}

/* OUTPUTS

~/20214272/OOPLAB/26-09-22 $ javac Q6.java
~/20214272/OOPLAB/26-09-22 $ java Q6
Enter radius : 
4.5
Area = 63.6171975
Circumference = 28.27431
Diameter = 9.0
~/20214272/OOPLAB/26-09-22 $

*/

