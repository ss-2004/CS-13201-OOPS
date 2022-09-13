/*
    NAME : Shresth Sonkar 
    REGNO : 20214272
*/

import java.util.*;
class ls
{
    public static void main(String args[])
    {
        int arr[] = {9, -2, 7, 3, 0, 4};
        int key = 1, ind = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == key)
            {
                ind = i;
                break;
            }
        }
        System.out.println(key + " at " + ind);
    }
}

/* OUTPUTS

~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ javac ls.java
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ java ls.java 
1 at -1
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $

*/