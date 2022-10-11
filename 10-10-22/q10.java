import java.util.*;
class q11
{
	String str[] = new String[10];

	q11()
	{
		input();
	}

	void input()
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter 10 strings");
		for(int i=0; i<10; i++)			
			str[i] = ss.nextLine();		
	}

	void sort()
	{
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<9-i; j++)
			{
				if(str[j].compareTo(str[j+1]) > 0)
				{
					String t = str[j+1];
					str[j+1] = str[j];
					str[j] = t;
				}
			}		
		}
	}

	void display()
	{
		System.out.println("Sorted : ");
		for(int i=0; i<10; i++)
			System.out.print(str[i] + ", ");
		System.out.println();
	}

	public static void main(String args[])
	{
		q11 fn = new q11();		
 		fn.sort();
		fn.display();
	}
}

/* OUTPUTS

 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q10.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q10
Enter 10 strings
the
quick
brown
fox
jumps
over
the
fat
lazy
dog
Sorted : 
brown, dog, fat, fox, jumps, lazy, over, quick, the, the, 
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q10
Enter 10 strings
honesty
is 
the
best
policy
dont
lie
or 
cheat
anyone
Sorted : 
anyone, best, cheat, dont, honesty, is, lie, or, policy, the, 
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/
