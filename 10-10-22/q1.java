// Shresth Sonkar
// 20214272
// q1

import java.util.*;
class RainFall
{
    private double rain[];
    private String month[] = {"#", "JAN", "FEB", "MAR", "APR", "MAY", "JUN", 
    "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"};

    RainFall()
    {
        Scanner ss = new Scanner(System.in);
        rain = new double[13];
        rain[0] = -10.0;

        for(int i=1; i<=12; i++)
            rain[i] = ss.nextDouble();
    }

    double totalRain()
    {
        double tot=0.0;
        for(int i=1; i<=12; i++)
            tot += rain[i];
        return Math.round(tot);
    }

    double avgRain()
    {
        return Math.round(totalRain()/12.0);
    }

    void highestRain()
    {
        int maxMonth=0;
        for(int i=1; i<=12; i++)
        {
            if(rain[i] > rain[maxMonth])
                maxMonth = i;
        }
        System.out.println("Max Rain in " + month[maxMonth] + " : " + rain[maxMonth] + " mm");
    }

    void lowestRain()
    {
        int minMonth=1;
        for(int i=1; i<=12; i++)
        {
            if(rain[i] < rain[minMonth])
                minMonth = i;
        }
        System.out.println("Min Rain in " + month[minMonth] + " : " + rain[minMonth] + " mm");
    }
}

class q1
{
    public static void main(String args[])
    {
        System.out.println("Enter rain in each month");
        RainFall fn = new RainFall();
        
        System.out.println("Total rain : " + fn.totalRain() + " mm");
        System.out.println("Avg rain : " + fn.avgRain() + " mm");
        fn.highestRain();
        fn.lowestRain();
    }
}

/* OUTPUTS

 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q1.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q1      
Enter rain in each month
20.25
7.62
16.7
31
107.9
182.9
266
196.2
229.9
100.7
56.5
20.4
Total rain : 1236.0 mm
Avg rain : 103.0 mm
Max Rain in JUL : 266.0 mm
Min Rain in FEB : 7.62 mm
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/
