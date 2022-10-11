// Shresth Sonkar
// 20214272
// q9

import java.util.*;
class q9
{
	String favFood, favAni, favCol, favName;

	q9()
	{
		favFood="";
		favAni="";
		favCol="";
		favName="";
	}

	void input()
	{
		Scanner ss = new Scanner(System.in);

		System.out.println("Enter favourite Food : ");
		favFood = ss.nextLine();		
		System.out.println("Enter favourite Animal : ");
		favAni = ss.nextLine();
		System.out.println("Enter favourite Color : ");
		favCol = ss.nextLine();
		System.out.println("Enter friend/relative : ");
		favName = ss.nextLine();	
	}

	void generate()
	{
		String str="I had a dream that Name ate a Col Ani and said it tasted like Food!";
		str = str.replace("Name", favName); str = str.replace("Col", favCol);
		str = str.replace("Ani", favAni); str = str.replace("Food", favFood);
		System.out.println("Replaced Words : " + str);
	}

	public static void main(String args[])
	{
		q9 fn = new q9();		
		fn.input();
 		fn.generate();
	}
}

/* OUTPUTS

 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ javac q9.java
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q9
Enter favourite Food : 
Hamburger
Enter favourite Animal : 
Dog
Enter favourite Color : 
Blue
Enter friend/relative : 
Jake
Replaced Words : I had a dream that Jake ate a Blue Dog and said it tasted like Hamburger!
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $ java q9
Enter favourite Food : 
Pizza
Enter favourite Animal : 
Cat
Enter favourite Color : 
Cyan
Enter friend/relative : 
Joe
Replaced Words : I had a dream that Joe ate a Cyan Cat and said it tasted like Pizza!
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/
