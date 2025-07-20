/*
28. Write a C program to input electricity unit charges and calculate total electricity bill according to the given condition: For first 50 units Rs. 0.50/unit For next 100 units Rs. 0.75/unit For next 100 units Rs. 1.20/unit For unit above 250 Rs. 1.50/unit An additional surcharge of 20% is added to the bill. 

*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	float BillAmt;
	System.out.println("Enter the Total Electricity Unit's : ");
	int unit = sc.nextInt();
	
	if(unit>0)
	{
		if(unit<=50)
		{
			BillAmt = unit*.50f;
			System.out.println("Bill Amount for first <=50 unitis : "+BillAmt);
		}
		else if(unit<=150)
		{
			BillAmt = (50*.5f)+((unit - 50)*0.75f);
			System.out.println("Bill Amount for <=150 unitis : "+BillAmt);
			
					
		}
		else if(unit<=250)
		{
			BillAmt = (50*.5f)+(100*0.75f)+((unit-150)*1.2f);
			System.out.println("Bill Amount for <=250 unitis : "+BillAmt);			
		}
		else if(unit>250)
		{
			BillAmt = (50*.5f)+(100*0.75f)+(100*1.2f)+(unit-250)*1.50f;
			float surcharge = (BillAmt*20.0f)/100;
			float NAmt = surcharge+BillAmt;
			System.out.println("Bill Amount for >250 unitis : -\nBasic Amoutn : "+BillAmt+"\nAddition Surcharges : "+surcharge+"\nNet Amoutn Payable : "+NAmt);			
		}
	}
    }	

}