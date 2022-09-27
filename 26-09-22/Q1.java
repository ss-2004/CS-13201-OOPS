// Shresth Sonkar
// 20214272
// Q1

import java.util.*;
class Employee
{
	private String name;
	private String department;
	private String position;
    private int idNumber;
	
    Employee()
	{
		name = "";
	    department = "";
	    position = "";
        idNumber = 0;
	}

    Employee(String name, int idNumber)
	{
		this.name = name;
	    this.department = "";
	    this.position = "";
        this.idNumber = idNumber;
	}

	Employee(String name, String department, String position, int idNumber)
	{
		this.name = name;
	    this.department = department;
	    this.position = position;
        this.idNumber = idNumber;
	}

    void setInfo()
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter Name : ");
		setName(ss.nextLine());
		System.out.println("Enter Department : ");
		setDepartment(ss.nextLine());
		System.out.println("Enter Position : ");
		setPosition(ss.nextLine());
        System.out.println("Enter ID Number : ");
		setidNumber(ss.nextInt());
    }

    void setName(String name)
	{
		this.name = name;
	}
	
	void setDepartment(String department)
	{
		this.department = department;
	}
	
	void setPosition(String position)
	{
		this.position = position;
	}

    void setidNumber(int idNumber)
	{
		this.idNumber = idNumber;
	}
	
	String getName()
	{
		return name;
	}
	
	String getDepartment()
	{
		return department;
	}
	
	String getPosition()
	{
		return position;
	}

    int getidNumber()
	{
		return idNumber;
	}

    void displayInfo()
    {
        System.out.println(getName()+"\t"+getidNumber()+"\t"+getDepartment()+"\t"+getPosition());
    }
}

class Q1
{
	public static void main(String args[])
	{
        Employee emp1 = new Employee();
        System.out.println("\nFill Employee 1 info : ");
        emp1.setInfo();
        
        Employee emp2 = new Employee();
        System.out.println("\nFill Employee 2 info : ");
        emp2.setInfo();
        
        Employee emp3 = new Employee();
        System.out.println("\nFill Employee 3 info : ");
		emp3.setInfo();

        System.out.println("\nNAME\tID Number\tDepartment\tPosition");
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
	}

}

/* OUTPUTS

~/desktop/cse/ASSGN/OOLAB/26-09-22 $ javac Q1.java
~/desktop/cse/ASSGN/OOLAB/26-09-22 $ java Q1      

Fill Employee 1 info : 
Enter Name : 
Susan Meyers
Enter Department : 
Accounting
Enter Position : 
VP
Enter ID Number : 
47899

Fill Employee 2 info : 
Enter Name : 
Mark Jones
Enter Department : 
IT
Enter Position : 
Programmer   
Enter ID Number : 
39119

Fill Employee 3 info : 
Enter Name : 
Joy Rogers
Enter Department : 
Manufacturing
Enter Position : 
Engineer       
Enter ID Number : 
81774

NAME            ID Number       Department      Position
Susan Meyers    47899           Accounting      VP
Mark Jones      39119           IT              Programmer
Joy Rogers      81774           Manufacturing   Engineer
~/desktop/cse/ASSGN/OOLAB/26-09-22 $

*/

