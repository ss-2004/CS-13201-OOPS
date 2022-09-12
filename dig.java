import java.util.*;
class digits
{
        public static void main(String args[])
        {
                Scanner ss = new Scanner(System.in);
                int n = ss.nextInt();
                int copy=n, c=0;

                while(copy>0)
                {
                        c++;
                        copy/=10;
                }
                System.out.println("DIGITS = "+c);
	}
}
