// Shresth Sonkar
// 20214272
// q5

import java.util.*;
class q5
{
	int r,c;

	q5(int r, int c)
	{
		this.r = r;
		this.c = c;
	}

	int getTotal(int arr[][])
	{
		int total = 0;
		for(int i=0; i<r; i++)
			total += getRowTotal(arr, i);
		return total;
	}

	double getAverage(int arr[][])
	{
		return getTotal(arr)/(r*c);
	}

	int getRowTotal(int arr[][], int k)
	{
		int total=0;
		for(int j=0; j<c; j++)
			total += arr[k][j];
		return total;
	}

	int getColTotal(int arr[][], int k)
	{
		int total=0;
		for(int i=0; i<c; i++)
			total += arr[i][k];
		return total;
	}

	void getHighestRow(int arr[][], int k)
    {
        int max=0;
        for(int j=0; j<c; j++)
        {
            if(arr[k][j] > arr[k][max])
                max = j;
        }
        System.out.println("Max in row " + (k+1) + " : " + arr[k][max]);
    }

    void getLowestRow(int arr[][], int k)
    {
        int min=0;
        for(int j=0; j<c; j++)
        {
            if(arr[k][j] < arr[k][min])
                min = j;
        }
        System.out.println("Min in row " + (k+1) + " : " + arr[k][min]);
    }

	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);		
		
		System.out.println("Enter r, c for Array : ");	
		int r = ss.nextInt(), c = ss.nextInt();	
		
		q5 fn = new q5(r, c);
		int arr[][] = new int[r][c];

		System.out.println("Enter Array : ");
		for(int i=0; i<r; i++)
		{
			for(int j=0; j<c; j++)
				arr[i][j] = ss.nextInt();		
		}

		System.out.println("Total = " + fn.getTotal(arr));
		System.out.println("Avg = " + fn.getAverage(arr));
		System.out.println("Row Total = " + fn.getRowTotal(arr, r-1));
		System.out.println("Col Total = " + fn.getColTotal(arr, r-2));
		fn.getHighestRow(arr, r-2);
		fn.getLowestRow(arr, r-1);

	}
}

/* OUTPUTS

 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q5.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q5      
Enter r, c for Array : 
3
3
Enter Array : 
1 2 3
4 5 6
7 8 9
Total = 45
Avg = 5.0
Row Total = 24
Col Total = 15
Max in row 2 : 6
Min in row 3 : 7
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/
