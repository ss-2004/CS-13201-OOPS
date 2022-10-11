// Shresth Sonkar
// 20214272
// q4, q6, q11, q12, q13

import java.util.*;
class Lottery
{
    int lotteryNumbers[] = new int[5];

    Lottery()
    {
        Random rnd = new Random();
        for(int i=0; i<5; i++)
            lotteryNumbers[i] = (int)Math.floor(10*Math.abs(rnd.nextDouble()));
    }

    int matchingDigitsIn(int lotteryPick[])
    {
        int c=0;
        for(int i=0; i<5; i++)
        {
            if(lotteryNumbers[i] == lotteryPick[i])
                c++;
        }
        return c;
    }

    int[] lotteryCpy()
    {
        int cpy[] = new int[5];
        for(int i=0; i<5; i++)
            cpy[i] = lotteryNumbers[i];

        return cpy;
    }
}

class q4
{
    public static void main(String args[])
    {
        Lottery l = new Lottery();
        Scanner ss = new Scanner(System.in);
        
        int lotteryPick[] = new int[5];
        for(int i=0; i<5; i++)
            lotteryPick[i] = ss.nextInt();

        if(l.matchingDigitsIn(lotteryPick) < 5)
            System.out.println("Matching digits : " + l.matchingDigitsIn(lotteryPick));
        else
            System.out.println("YOU ARE GRAND PRIZE WINNER !");

        System.out.println("Lottery numbers : ");
        int cpy[] = l.lotteryCpy();
        for(int i=0; i<5; i++)
            System.out.print(cpy[i] + ", ");
        System.out.println();
    }
}

/* OUTPUTS 

 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q4.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q4      
4 2 7 9 3
Matching digits : 1
Lottery numbers : 
6, 3, 7, 1, 5, 
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q4.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q4      
4 2 7 9 3
Matching digits : 0
Lottery numbers : 
1, 5, 1, 6, 0, 
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/