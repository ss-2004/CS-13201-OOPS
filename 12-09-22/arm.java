import java.util.*;
class arm
{
        public static void main(String args[])
        {
                Scanner ss = new Scanner(System.in);
                int n = ss.nextInt();
		int copy=n, copy2=n, c=0, s=0, d=1, p=1;

		while(copy>0)
		{
			c++;
			copy/=10;
		}
		while(copy2>0)
		{
			d = copy2%10;
			for(int i=1; i<=c; i++) 
				p*=d;
			s += p;
			copy2/=10;
			p=1; d=0;
		} 

		if(s==n)
                	System.out.println("ARMSTRONG");
		else
			System.out.println("NOT ARMSTRONG");
        }
}
