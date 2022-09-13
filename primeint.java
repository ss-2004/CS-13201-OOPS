/*
    NAME : Shresth Sonkar 
    REGNO : 20214272
*/

import java.util.*;
class primeint
{
    boolean isPrime(int n)
    {
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String args[])
    {
        primeint p = new primeint();
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt(), b = ss.nextInt();
        for(int i=a+1; i<b; i++)
        {
            if(p.isPrime(i))
                System.out.print(i + ", ");
        }
        System.out.println();
    }
}

/* OUTPUTS

~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ javac primeint.java 
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ java primeint
11 30
13, 17, 19, 23, 29,  
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ 

*/