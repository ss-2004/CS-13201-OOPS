import java.util.*;
class factor
{
	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);
		int n=ss.nextInt();
		System.out.print("Factors of "+n+" : \n"+1+", "+n+", ");
		for(int i=2; i<=n/2; i++)
		{
			if(n%i == 0)
				System.out.print(i + ", ");
		}
		System.out.println();
	}
}
