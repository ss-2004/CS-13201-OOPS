// Shresth Sonkar
// 20214272
// Q7

import java.util.*;
class MonthDays
{
	private int month;
	private int year;
	
	MonthDays(int month, int year)
	{
		this.month = month;
		this.year = year;
	}
	
	int getNumberOfDays()
	{
		int daysIn[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if(isLeap(year) && month == 2)
			return daysIn[month] + 1;
		else
			return daysIn[month];
	}
	
	boolean isLeap(int year)
	{
		if(year % 100 == 0)
		{
			if(year % 400 == 0)
				return true;
		}
		else
		{
			if(year % 4 == 0)
				return true;
		}
		return false;
	}
}

class Q7
{
	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter month (1-12) : ");
		int m = ss.nextInt();
		System.out.println("Enter year : ");
		int y = ss.nextInt();
		MonthDays md = new MonthDays(m, y);
		System.out.println(md.getNumberOfDays() + " days");
	}
}

/* OUTPUTS

~/20214272/OOPLAB/26-09-22 $ javac Q7.java
~/20214272/OOPLAB/26-09-22 $ java Q7
Enter month (1-12) : 
2
Enter year : 
2008
29 days
~/20214272/OOPLAB/26-09-22 $ java Q7
Enter month (1-12) : 
1
Enter year : 
2004
31 days
~/20214272/OOPLAB/26-09-22 $

*/

