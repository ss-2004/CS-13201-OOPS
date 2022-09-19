import java.util.*;
class fibo
{
        int fib(int n)
	{
		if(n==1 || n==2)
			return 1;
		else
			return fib(n-1) + fib(n-2);
	}
	
	public static void main(String args[])
        {
                fibo f = new fibo();
		Scanner ss = new Scanner(System.in);
                int n = ss.nextInt();
		for(int i=1; i<=n; i++)
	                System.out.print(f.fib(i)+", ");
        	System.out.println();
	}
}
