/*
    NAME : Shresth Sonkar 
    REGNO : 20214272
*/

import java.util.*;
class qs
{
    int partition(int arr[], int srt, int end)
    {
        int pivot = arr[end];
        int t, pi = srt;
        for(int i=srt; i<end; i++)
        {
            if(arr[i] <= pivot)
            {
                t = arr[pi];
                arr[pi] = arr[i];
                arr[i] = t;
                pi++;
            }
        }
        t = arr[pi];
        arr[pi] = arr[end];
        arr[end] = t;

        return pi;
    }

    void quickSort(int arr[], int srt, int end)
    {
        if(srt < end)
        {
            int pi = partition(arr, srt, end);
            quickSort(arr, srt, pi-1);
            quickSort(arr, pi+1, end);
        }
    }

    public static void main(String args[])
    {
        qs q = new qs();
        int arr[] = {9, -2, 7, 3, 0, 4};
        q.quickSort(arr, 0, arr.length-1);
        for(int i=0; i<arr.length-1; i++)
            System.out.print(arr[i] + ", ");

        System.out.println();
    }
}

/* OUTPUTS

~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ javac qs.java
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $ java qs.java 
-2, 0, 3, 4, 7, 
~/Desktop/CSE/ASSGN/OOLAB/12-09-22 $

*/
