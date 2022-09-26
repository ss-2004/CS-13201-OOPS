// Shresth Sonkar
// 20214272
// Q6

import java.util.*;
class TestScores
{
	private int score1;
	private int score2;
	private int score3;
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	int getScore1()
	{
		return score1;
	}
	
	int getScore2()
	{
		return score2;
	}
	
	int getScore3()
	{
		return score3;
	}
	
	void setScore1(int score1)
	{
		this.score1 = score1;
	}
	
	void setScore2(int score2)
	{
		this.score2 = score2;
	}
	
	void setScore3(int score3)
	{
		this.score3 = score3;
	}
}

class Q5
{
	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter radius : ");
		double r = ss.nextDouble();
		TestScores c1 = new TestScores(r);
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

