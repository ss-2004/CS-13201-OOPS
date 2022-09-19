//Shresth Sonkar
// 20214272
// Q8

import java.util.*;
class Q8
{
	boolean isPrime(int n)
	{
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

        public static void main(String args[])
        {
		Q8 fn = new Q8();
                Scanner ss = new Scanner(System.in);
                System.out.println("Enter numbers : ");
		int in;
		for(int i=0; i<5; i++)
		{
			in = ss.nextInt();
			if(fn.isPrime(in))
				System.out.println(in+" : PRIME");
			else
				System.out.println(in+" : NOT PRIME");
		}
	}
}

/* OUTPUTS

 > ~/20214272/OOPLAB/19-09-22 $ javac Q8.java
 > ~/20214272/OOPLAB/19-09-22 $ java Q8
Enter numbers : 
3 67 88  25 1
3 : PRIME
67 : PRIME
88 : NOT PRIME
25 : NOT PRIME
1 : PRIME
 > ~/20214272/OOPLAB/19-09-22 $ java Q8
Enter numbers : 
23 5 8 9 10
23 : PRIME
5 : PRIME
8 : NOT PRIME
9 : NOT PRIME
10 : NOT PRIME
 > ~/20214272/OOPLAB/19-09-22 $

*/
