/*
    NAME : Shresth Sonkar 
    REGNO : 20214272
*/

import java.util.*;
class bs
{
    public static void main(String args[])
    {
        int arr[] = {9, -2, 7, 3, 0, 4};
        int key = -2, ind= -1;
        int hi=arr.length-1, lo=0, mid;

        for(int i=0; i<arr.length; i++)
        {   
            mid = (hi+lo)/2;
            if(key == arr[mid])
            {
                ind = mid; 
                break;
            }
            else if(key < arr[mid])
                hi = mid;
            else if(key > arr[mid])
                lo = mid;
        }
        System.out.println(key + " at " + ind);
    }
}

/* OUTPUTS

~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ javac bs.java
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ java bs.java 
-2 at 1
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $

*/
