// Shresth Sonkar
// 20214272
// Q2

import java.util.*;
class Car
{
	private String make;
	private int yearModel;
    private int speed;
	
	Car(String make, int yearModel)
	{
		this.make = make;
	    this.yearModel = yearModel;
        speed = 0;
	}
	
	String getMake()
	{
		return make;
	}
	
	int getYearModel()
	{
		return yearModel;
	}

    int getSpeed()
	{
		return speed;
	}

    void accelerate()
    {
        
        speed += 5;
    }

    void brake()
    {
        speed -= 5;
    }
}

class Q2
{
	public static void main(String args[])
	{
        Scanner ss = new Scanner(System.in);
        String make;
	    int yearModel;
        
        System.out.println("Enter make : ");
		make = ss.nextLine();
		System.out.println("Enter yearModel : ");
		yearModel = ss.nextInt();

        Car car = new Car(make, yearModel);
        for(int i=1; i<=5; i++)
        {
            car.accelerate();
            System.out.println("Speed : " + car.getSpeed() + " kmph");
        }

        System.out.println();
        for(int i=1; i<=5; i++)
        {
            car.brake();
            System.out.println("Speed : " + car.getSpeed() + " kmph");
        }
	}
}

/* OUTPUTS

~/desktop/cse/ASSGN/OOLAB/26-09-22 $ javac Q2.java
~/desktop/cse/ASSGN/OOLAB/26-09-22 $ java Q2      
Enter make : 
Tata
Enter yearModel : 
2021
Speed : 5 kmph
Speed : 10 kmph
Speed : 15 kmph
Speed : 20 kmph
Speed : 25 kmph

Speed : 20 kmph
Speed : 15 kmph
Speed : 10 kmph
Speed : 5 kmph
Speed : 0 kmph
~/desktop/cse/ASSGN/OOLAB/26-09-22 $

*/

