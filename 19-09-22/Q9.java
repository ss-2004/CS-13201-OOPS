// Shresth Sonkar
// 20214272
// Q9

import java.util.*;
class Q9
{
	int HCF(int a, int b)
	{
		if(Math.max(a,b)%Math.min(a,b) == 0)
			return Math.min(a,b);
		else
			return HCF(b, Math.max(a,b)%Math.min(a,b));
	}

	int LCM(int a, int b)
	{
		if(a == b) return a;
		else if(a == 1 || b == 1) return a*b;
		else return (a*b)/HCF(a,b);
	}

	public static void main(String args[])
    {
        Q9 fn = new Q9();
        Scanner ss = new Scanner(System.in);
        int in1, in2;
        for(int i=0; i<5; i++)
        {
			System.out.println("Enter numbers : ");			
            in1 = ss.nextInt();
			in2 = ss.nextInt();
            System.out.println("LCM : "+fn.LCM(in1,in2));
            System.out.println("HCF : "+fn.HCF(in1,in2));
        }
    }
}

/* OUTPUTS 

 > ~/20214272/OOPLAB/19-09-22 $ javac Q9.java
 > ~/20214272/OOPLAB/19-09-22 $ java Q9
Enter numbers : 
2 3
LCM : 6
HCF : 1
Enter numbers :
12 10
LCM : 60
HCF : 2
Enter numbers :
1 3
LCM : 3
HCF : 1
Enter numbers :
40 8
LCM : 40
HCF : 8
Enter numbers :
7 5 
LCM : 35
HCF : 1
 > ~/20214272/OOPLAB/19-09-22 $

*/
