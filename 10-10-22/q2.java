// Shresth Sonkar
// 20214272
// q2

import java.util.*;
class q2
{
	private int l;

	q2(int l)
	{
		this.l = l;
	}

	int getTotal(int arr[])
	{
		int total = 0;
		for(int i=0; i<l; i++)
			total += arr[i];
		return total;
	}

	double getAverage(int arr[])
	{
		return getTotal(arr)/l;
	}

	void getHighest(int arr[])
    {
        int max=0;
        for(int j=0; j<l; j++)
        {
            if(arr[j] > arr[max])
                max = j;
        }
        System.out.println("Max : " + arr[max]);
    }

    void getLowest(int arr[])
    {
        int min=0;
        for(int j=0; j<l; j++)
        {
            if(arr[j] < arr[min])
                min = j;
        }
        System.out.println("Min : " + arr[min]);
    }

	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);		
		
		System.out.println("Enter l for Array : ");	
		int l = ss.nextInt();	
		
		q2 fn = new q2(l);
		int arr[] = new int[l];

		System.out.println("Enter Array : ");
		for(int i=0; i<l; i++)
			arr[i] = ss.nextInt();		

		System.out.println("Total : " + fn.getTotal(arr));
		System.out.println("Avg : " + fn.getAverage(arr));
		fn.getHighest(arr);
		fn.getLowest(arr);

	}
}

/* OUTPUTS

 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q2.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q2      
Enter l for Array : 
5
Enter Array : 
7 1 9 -2 0
Total = 15
Avg = 3.0
Max : 9
Min in : -2
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/
