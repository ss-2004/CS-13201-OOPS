// Shresth Sonkar
// 20214272
// Q2

import java.util.*;
class Q2
{
    public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter P, R, T : ");
		double P=ss.nextDouble(), R=ss.nextDouble(), T=ss.nextDouble();
		System.out.println("SI = "+(P*R*T/100.0));
	}
}

/* OUTPUTS 

 > ~/20214272/OOPLAB/19-09-22 $ javac Q2.java
 > ~/20214272/OOPLAB/19-09-22 $ java Q2
Enter P, R, T : 
1000.0 1.5 4
SI = 60.0
 > ~/20214272/OOPLAB/19-09-22 $ java Q2
Enter P, R, T : 
6500000.0 9.6 10
SI = 6240000.0
 > ~/20214272/OOPLAB/19-09-22 $

*/
