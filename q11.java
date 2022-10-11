// Shresth Sonkar
// 20214272
// q11

import java.util.*;
class q11
{
	String tkn[];
    String str;

	q11()
	{
		int size = input();
		tkn = new String[size];
	}

	int input()
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a paragraph : ");			
		str = ss.nextLine();
		
		str = str.trim();
		StringTokenizer s = new StringTokenizer(str);
		return s.countTokens();	
	}

	void fillArray()
	{
		StringTokenizer s = new StringTokenizer(str);
        int k=0;

		while(s.hasMoreTokens())
		{
			tkn[k++] = s.nextToken();
		}
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
		q11 fn = new q11();	
        fn.fillArray();	
 		fn.sort();
        fn.rmDuplicate();
		fn.display();
	}
}

/* OUTPUTS

 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q11.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q11
Enter a paragraph : 
the quick brown fox jumps over the lazy dog
Sorted : 
brown, dog, fox, jumps, lazy, over, quick, the,
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/
