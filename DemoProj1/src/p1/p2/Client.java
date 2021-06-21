package p1.p2;

import java.util.Scanner;

public class Client {

	public static void menu()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Select Your Bank To Know Rate Of Interest");
		System.out.println("1.BANK OF BARODA");
		System.out.println("2.STATE BANK OF INDIA");
		System.out.println("3.STATE BANK OF MYSORE");
		System.out.println("4.AXIS BANK");
		System.out.println("5.ICICI BANK");
		
		String choice=sc.next();
		
		switch(choice)
		{
			case "1":
			{
				System.out.println("BANK OF BARODA......Under Progresss");
				break;
			}
			case "2":
			{
				System.out.println("STATE BANK OF INDIA..........Under Progresss");
				break;
			}
			case "3":
			{
				System.out.println("STATE BANK OF MYSORE...........Under Progresss");
				break;
			}
			case "4":
			{
				System.out.println("Welcome To AXIS BANK");
				System.out.print("Enter Your Pan Number:");
				String pan=sc.next();
				AxisBank axis=new AxisBank();
				System.out.println("Our Rate Of Interest:"+axis.rateOfInterest());
				axis.panNumber(pan);
				break;
			}
			case "5":
			{
				
				System.out.println("Welcome To ICICI BANK");
				ICICIBank icici=new ICICIBank();
				System.out.println("Our Rate Of Interest:"+icici.rateOfInterest());
				break;
			}
			default:
			{
				System.out.println("Invalid Choice,Try Again");
			}
			
		}
		
	
	}
	
	public static void main(String[] args) {
		
		Client.menu();
	
	}

}
