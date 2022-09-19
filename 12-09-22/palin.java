import java.util.*;
class palin
{
        public static void main(String args[])
        {
                Scanner ss = new Scanner(System.in);
                int n = ss.nextInt();
                int copy=n, r=0, d=0;
                while(copy>0)
                {
                        d = copy%10;
                        r = r*10+d;
                        copy/=10;
                }

                if(r==n)
                        System.out.println("PALIN");
                else
                    	System.out.println("NOT PALIN");
	}
}
