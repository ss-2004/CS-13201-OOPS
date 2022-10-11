// Shresth Sonkar
// 20214272
// q12

import java.util.*;
class q12
{
	String tkn[];
    String str, del;

	q12()
	{
		int size = input();
		tkn = new String[size];
	}

	int input()
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a paragraph : ");			
		str = ss.nextLine();
        System.out.println("Enter delimiters : ");			
        del = ss.nextLine();
		
		str = str.trim();
		StringTokenizer s = new StringTokenizer(str, del);
		return s.countTokens();	
	}

	void fillArray()
	{
		StringTokenizer s = new StringTokenizer(str, del);
        int k=0;

		while(s.hasMoreTokens())
		    tkn[k++] = s.nextToken();
	}

	void sort()
	{
		for(int i=0; i<tkn.length; i++)
		{
			for(int j=0; j<tkn.length-i-1; j++)
			{
				if(tkn[j].compareTo(tkn[j+1]) > 0)
				{
					String t = tkn[j+1];
					tkn[j+1] = tkn[j];
					tkn[j] = t;
				}
			}		
		}
	}

    void rmDuplicate()
    {
        for(int j=0; j<tkn.length-1; j++)
        {
            if(tkn[j].equals(tkn[j+1]))
                tkn[j+1] = "#";
        }
    }

	void display()
	{
		System.out.println("Sorted : ");
		for(int i=0; i<tkn.length; i++)
		{	
            if(!tkn[i].equals("#"))
                System.out.print(tkn[i] + ", ");
        }
		System.out.println();
	}

	public static void main(String args[])
	{
		q12 fn = new q12();	
        fn.fillArray();	
 		fn.sort();
        fn.rmDuplicate();
		fn.display();
	}
}

/* OUTPUTS

 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q12.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q12
Enter a paragraph : 
zyxwvutsrqponmlkjihgfedcba
Enter delimiters : 
flrx
Sorted : 
edcba, kjihg, qponm, wvuts, zy,
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/
