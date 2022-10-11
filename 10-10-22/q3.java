// Shresth Sonkar
// 20214272
// q3

import java.util.*;
class PayRoll
{
	private int l=7;
    private int employeeID[] = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
    private int hours[] = new int[l];
    private double payRate[] = new double[l];
    private double wages[] = new double[l];

    int getIndex(int ID)
    {
        for(int i=0; i<7; i++)
        {   
            if(ID == employeeID[i])
                return i;
        }
        return -1;
    }

    void setHours(int ID, int h)
	{
		hours[getIndex(ID)] = h;
	}

    void setPayRate(int ID, double pr)
    {
        payRate[getIndex(ID)] = pr;
    }

    void setWages(int i)
    {
        wages[i] = hours[i] * payRate[i];
    }

    int getID(int i)
    {
        return employeeID[i];
    }

	int getHours(int ID)
	{
        if(getIndex(ID) >=0 )
            return hours[getIndex(ID)];
        else
            System.out.println("Employee ID Invalid !");
        return -1;
	}

    double getPayRate(int ID)
    {
        if(getIndex(ID) >=0 )
            return payRate[getIndex(ID)];
        else
            System.out.println("Employee ID Invalid !");
        return -1;
    }

    double getWages(int ID)
    {
        if(getIndex(ID) >=0 )
            return wages[getIndex(ID)];
        else
            System.out.println("Employee ID Invalid !");
        return -1;
    }
}

class q3
{
    public static void main(String args[])
	{
		Scanner obj = new Scanner(System.in);
        PayRoll fn = new PayRoll();

        for(int i=0; i<7; i++)
        {
            int ID = fn.getID(i);
            System.out.println("Employee ID : " + ID);
            System.out.println("Enter hours : ");
            int hr = obj.nextInt();
            
            while(hr < 0)
            {
                System.out.println("Enter +ve working hours");
                hr = obj.nextInt();
            }
            fn.setHours(ID, hr);

            System.out.println("Enter pay rate : ");
            double pr = obj.nextDouble();
            
            while(pr < 6.0)
            {
                System.out.println("Enter rate > 6.0/hour");
                pr = obj.nextDouble();
            }
            fn.setPayRate(ID, hr);

            fn.setWages(i);
        }
        
        System.out.println("ID \t Wage");
        for(int i=0; i<7; i++)
        {
            int ID = fn.getID(i);
            System.out.println(ID + " \t\t " + fn.getWages(ID));
        }
	}
}

/* OUTPUTS

Employee ID : 5658845
Enter hours : 
34
Enter pay rate : 
7.6
Employee ID : 4520125
Enter hours : 
32
Enter pay rate : 
5.6
Enter rate > 6.0/hour
6.5
Employee ID : 7895122
Enter hours : 
29
Enter pay rate : 
6.7
Employee ID : 8777541
Enter hours : 
-3
Enter +ve working hours
28
Enter pay rate : 
8.5
Employee ID : 8451277
Enter hours : 
33
Enter pay rate : 
8.3
Employee ID : 1302850
Enter hours : 
26
Enter pay rate : 
7.5
Employee ID : 7580489
Enter hours : 
30
Enter pay rate : 
7.0
    ID           Wage
5658845          1156.0
4520125          1024.0
7895122          841.0
8777541          784.0
8451277          1089.0
1302850          676.0
7580489          900.0
 ➜ ~/desktop/cse/ASSGN/OOLAB/10-10-22 $

*/
