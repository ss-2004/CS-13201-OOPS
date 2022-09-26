// Shresth Sonkar
// 20214272
// Q5

import java.util.*;
class PayRoll
{
	private String name;
	private int ID;
	private double payRate;
    private double hoursWorked;
	
	PayRoll(String name, int ID, double payRate, double hoursWorked)
	{
		this.name = name;
	    this.ID = ID;
	    this.payRate = payRate;
        this.hoursWorked = hoursWorked;
	}
	
	String getName()
	{
		return name;
	}
	
	int getID()
	{
		return ID;
	}
	
	double getPayRate()
	{
		return payRate;
	}

    double getHoursWorked()
	{
		return hoursWorked;
	}

	double getGrossPay()
	{
		return getPayRate() * getHoursWorked();
	}
}

class Q4
{
	public static void main(String args[])
	{
		Scanner ss = new Scanner(System.in);
        String n;
        int i;
        double pr;
        double hw;
		
		System.out.println("Enter Name : ");
		n = ss.nextLine();
		System.out.println("Enter ID : ");
		i = ss.nextInt();
		System.out.println("Enter Pay Rate : ");
		pr = ss.nextDouble();
        System.out.println("Enter Hours Worked : ");
		hw = ss.nextDouble();

        PayRoll p = new PayRoll(n, i, pr, hw);
		System.out.println("GrossPay = $" + p.getGrossPay());
	}

}

/* OUTPUTS

~/desktop/cse/ASSGN/OOLAB/26-09-22 $ javac Q4.java
~/desktop/cse/ASSGN/OOLAB/26-09-22 $ java Q4                                                                       ➜ ~/desktop/cse/ASSGN/OOLAB/26-09-22 $ j Q4      
Enter Name : 
rohit
Enter ID : 
1234
Enter Pay Rate : 
20
Enter Hours Worked : 
120
GrossPay = $2400.0
~/desktop/cse/ASSGN/OOLAB/26-09-22 $ 

*/

