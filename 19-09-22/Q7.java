// Shresth Sonkar
// 20214272
// Q7

import java.util.*;
class Q7
{
	public static void main(String args[])
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter l, b : ");
        double l=ss.nextDouble(), b=ss.nextDouble();
        System.out.println("PERIMETER = "+(2*(l+b)));
    }
}

/* OUTPUTS 

 > ~/20214272/OOPLAB/19-09-22 $ javac Q7.java
 > ~/20214272/OOPLAB/19-09-22 $ java Q7
Enter l, b : 
3 4
PERIMETER = 14.0
 > ~/20214272/OOPLAB/19-09-22 $ java Q7
Enter l, b : 
1 9
PERIMETER = 20.0
 > ~/20214272/OOPLAB/19-09-22 $

*/
