// Shresth Sonkar
// 20214272
// q7

import java.util.*;
class q7
{
	boolean isLoShu(int arr[][])
	{
		int sum[] = new int[8];
		int k=0, s=0;

		for(int i=0; i<3; i++)
		{
			s=0;
			for(int j=0; j<3; j++)
			{			
				if(i == j)
					sum[6]+=arr[i][j];
				if(i + j == 2)
					sum[7]+=arr[i][j];
				s += arr[i][j];
			}			
			sum[k++] = s;
		}

		for(int j=0; j<3; j++)
		{
			s=0;
			for(int i=0; i<3; i++)
				s += arr[i][j];
			sum[k++] = s;		
		}

		for(int i=0; i<sum.length/2; i++)
		{
			if(sum[i] != sum[sum.length-i-1])
				return false;
		}
		return true;
	}

	public static void main(String args[])
	{
		q7 arr = new q7();		
		int square[][] = new int[3][3];

		Scanner ss = new Scanner(System.in);
		System.out.println("Fill Array : ");

		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
				square[i][j] = ss.nextInt();		
		}
	
 		if(arr.isLoShu(square))
			System.out.println("Given magic square is Lo Shu");
		else
			System.out.println("Given magic square is NOT Lo Shu");
	}
}

/* OUTPUTS

 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q7.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q7
Fill Array : 
4 9 2
3 5 7
8 1 6
Given magic square is Lo Shu
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q7
Fill Array : 
1 2 3
4 5 6
7 8 9
Given magic square is NOT Lo Shu
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/
