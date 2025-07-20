/*
3.A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Salary, Bonus, NSalary;
		System.out.println("Enter the Year of Service");
		int Year = sc.nextInt();
		
		if(Year>5)
		{
			System.out.println("Please Enter your Salary : ");
			Salary = sc.nextFloat();
			Bonus = (Salary*5)/100;
			System.out.println("Your Bonus is : "+Bonus);
		}
		else
		{
			System.out.println("Sorry..Your not able to get bonus");
		}
	}
}