/*
    NAME : Shresth Sonkar 
    REGNO : 20214272
*/

import java.util.*;
class sumprime
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
        int n = ss.nextInt();
        for(int i=2; i<=n-2; i++)
        {
            if(p.isPrime(i) && p.isPrime(n-i))
            {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}

/* OUTPUTS

~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ javac sumprime.java
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ java sumprime
11
NO
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ java sumprime
13
YES
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ 

*/
