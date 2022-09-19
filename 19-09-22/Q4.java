// Shresth Sonkar
// 20214272
// Q4	

import java.util.*;
class Q4
{
	boolean isEqual(String str1, String str2)
	{	
		if(str1.length() != str2.length()) 
			return false;
		for(int i=0; i<str1.length(); i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
				return false;
		}
		return true;
	} 

	String Reverse(String str)
	{	
		char t;
		int i=0, l=str.length()-1;
		for(i=0; i<l/2; i++)
		{
			t = str.charAt(i);
			str.replace(str.charAt(i), str.charAt(l-i));
			str.replace(str.charAt(l-i), t);
		}
		return str; 		
	}
	
	String changeCase(String str)
	{
		char ch;
		for(int i=0; i<str.length(); ++i)
		{
			ch = str.charAt(i);
			if(Character.isUpperCase(ch))
				str.replace(str.charAt(i), Character.toLowerCase(ch));
			else
				str.replace(str.charAt(i), Character.toUpperCase(ch));				
		}
		return str;
	}

	public static void main(String args[])
        {
                Q4 fn = new Q4();
                Scanner ss = new Scanner(System.in);
                System.out.println(fn.changeCase("HELLO"));
                System.out.println(fn.Reverse("WORLD"));
                
        }
}
