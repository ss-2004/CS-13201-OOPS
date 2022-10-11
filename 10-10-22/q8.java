// Shresth Sonkar
// 20214272
// q8

import java.util.*;
class q8
{
	String str;

	q8()
	{
		str="";
	}

	void input()
	{
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter a line of text. No punctuation please.");
		str = ss.nextLine();		
	}

	void generate()
	{
		String fw = str.substring(0, str.indexOf(' '));
		String lw = str.substring(str.indexOf(' '));
		lw = lw.trim();
		lw = lw.replace(lw.charAt(0), Character.toUpperCase(lw.charAt(0)));
		str = lw + " " + fw;
		System.out.println("I have rephrased that line to read: \n" + str);
	}

	public static void main(String args[])
	{
		q8 fn = new q8();		
		fn.input();
 		fn.generate();
	}
}

/* OUTPUTS

 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q8.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q8
Enter a line of text. No punctuation please.
Java is the language
I have rephrased that line to read: 
Is the language Java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q8
Enter a line of text. No punctuation please.
Hello world
I have rephrased that line to read: 
World Hello
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/
