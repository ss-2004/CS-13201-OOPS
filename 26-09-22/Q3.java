// Shresth Sonkar
// 20214272
// Q3

import java.util.*;
class PersonalInformation
{
	private String name;
	private String address;
	private int age;
    private int phno;
	
	PersonalInformation()
	{
		name = "";
	    address = "";
	    age = 0;
        phno = 0;
	}

    void setInfo()
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter Name : ");
		name = ss.nextLine();
		System.out.println("Enter Address : ");
		address = ss.nextLine();
		System.out.println("Enter Age : ");
		age = ss.nextInt();
        System.out.println("Enter Phone : ");
		phno = ss.nextInt();
    }
	
	String getName()
	{
		return name;
	}
	
	String getAddress()
	{
		return address;
	}
	
	int getAge()
	{
		return age;
	}

    int getPhNo()
	{
		return phno;
	}

    void displayInfo()
    {
        System.out.println("");
        System.out.println("Name : " + getName());
		System.out.println("Address : " + getAddress());
		System.out.println("Age : " + getAge());
        System.out.println("Phone : " + getPhNo());
    }
}

class Q3
{
	public static void main(String args[])
	{
        PersonalInformation MyInfo = new PersonalInformation();
        System.out.println("\nFill your info : ");
        MyInfo.setInfo();
        
        PersonalInformation MyFrns = new PersonalInformation();
        System.out.println("\nFill your friend info : ");
        MyFrns.setInfo();
        
        PersonalInformation MyFmly = new PersonalInformation();
        System.out.println("\nFill family info : ");
		MyFmly.setInfo();

        MyInfo.displayInfo();
        MyFrns.displayInfo();
        MyFmly.displayInfo();
	}

}

/* OUTPUTS

~/desktop/cse/ASSGN/OOLAB/26-09-22 $ javac Q3.java
~/desktop/cse/ASSGN/OOLAB/26-09-22 $ java Q3

Fill your info : 
Enter Name : 
shresth
Enter Address : 
lucknow
Enter Age : 
18
Enter Phone : 
1234567890

Fill your friend info : 
Enter Name : 
rohan
Enter Address : 
delhi
Enter Age : 
19
Enter Phone : 
0987654321

Fill family info : 
Enter Name : 
parents
Enter Address : 
lucknow
Enter Age : 
50
Enter Phone : 
1029384756

Name : shresth
Address : lucknow
Age : 18
Phone : 1234567890

Name : rohan
Address : delhi
Age : 19
Phone : 987654321

Name : parents
Address : lucknow
Age : 50
Phone : 1029384756
~/desktop/cse/ASSGN/OOLAB/26-09-22 $

*/

