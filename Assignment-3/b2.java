/*
2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
Ask user for quantity
Suppose, one unit will cost 100.
Judge and print total cost for user.

*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float PurAmt;
		System.out.println("Enter the Purchase Quantity : ");
		float quantity = sc.nextFloat();
		float TCost = quantity*100;
		
		if(quantity>1000)
			PurAmt = TCost-(((TCost)*10)/100);
		else
			PurAmt = TCost;

		System.out.println("Total Amout of Purchase : "+PurAmt);
			
	}
}