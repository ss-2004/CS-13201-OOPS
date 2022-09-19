/*
    NAME : Shresth Sonkar 
    REGNO : 20214272
*/

import java.util.*;
class primeintf
{
    boolean isPrime(int n)
    {
        for(int i=2; i<=n/2; i++)
        {
            if(n%i==0) return false;
        }
        return true;
    }

    void primePrint()
    {
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt(), b = ss.nextInt();
        for(int i=a+1; i<b; i++)
        {
            if(isPrime(i))
                System.out.print(i + ", ");
        }
    }

    public static void main(String args[])
    {
        primeintf f = new primeintf();
        f.primePrint();
        System.out.println();
    }
}

/* OUTPUTS

~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ javac primeintf.java 
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ java primeintf
10 20
11, 13, 17, 19,  
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ 

*/
