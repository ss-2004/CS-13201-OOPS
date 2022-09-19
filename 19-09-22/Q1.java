// Shresth Sonkar
// 20214272
// Q1

import java.util.*;
class Q1
{
	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n=ss.nextInt(), min=99999, max=-99999, sum=0;
		double avg=0.0;
		int arr[] = new int[n];
		for(int i=0; i<n; i++)
		{	
			arr[i] = ss.nextInt();
			sum += arr[i];
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Max : "+max+"\nMin : "+min+"\nSum : "+sum+"\nAvg : "+(sum/(n*1.0)));
	}
}

/* OUTPUTS 

 > ~/20214272/OOPLAB/19-09-22 $ javac Q1.java
 > ~/20214272/OOPLAB/19-09-22 $ java Q1
Enter size : 
4
1 2 3 4
Max : 4
Min : 1
Sum : 10
Avg : 2.5
 > ~/20214272/OOPLAB/19-09-22 $ java Q1
Enter size : 
5
9 -2 3 4 0
Max : 9
Min : -2
Sum : 14
Avg : 2.8
 > ~/20214272/OOPLAB/19-09-22 $

*/
