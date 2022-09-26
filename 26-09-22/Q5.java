// Shresth Sonkar
// 20214272
// Q5

import java.util.*;
class TestScores
{
	private int score1;
	private int score2;
	private int score3;
	
	TestScores()
	{
		score1 = 0;
		score2 = 0;
		score3 = 0;
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

	double getAvgScore()
	{
		return ( getScore1() + getScore2() + getScore3() )/3.0;
	}
}

class Q5
{
	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);
		TestScores t = new TestScores();
		
		System.out.println("Enter Score 1 : ");
		t.setScore1(ss.nextInt());
		System.out.println("Enter Score 2 : ");
		t.setScore2(ss.nextInt());
		System.out.println("Enter Score 3 : ");
		t.setScore3(ss.nextInt());
		
		System.out.println("Avg Score = " + t.getAvgScore());
	}

}

/* OUTPUTS

~/desktop/cse/ASSGN/OOLAB/26-09-22 $ javac Q5.java
~/desktop/cse/ASSGN/OOLAB/26-09-22 $ java Q5
Enter Score 1 : 
98
Enter Score 2 : 
94
Enter Score 3 : 
91
Avg Score = 94.33333333333333
~/desktop/cse/ASSGN/OOLAB/26-09-22 $ 

*/

