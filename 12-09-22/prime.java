import java.util.*;
class evenodd
{
        public static void main(String args[])
        {
                Scanner ss = new Scanner(System.in);
                int c=0, n = ss.nextInt();

		for(int i=2; i<n/2; i++)
		{
			if(n%i==0)
				c++;
			if(c>=1)
				break;
		}

                if(c==0)
                        System.out.println("Prime");
                else
                        System.out.println("Not prime");
        }
}
