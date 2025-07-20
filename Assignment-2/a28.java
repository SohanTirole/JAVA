/*
28. A carpet is 5 m long and 4 m wide. Find its price at the rate of $ 205 per square meter.
*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		float Lc, Wc;
        System.out.println("Enter the Length and width of a carpet : ");
        Lc = sc.nextFloat();
        Wc = sc.nextFloat();

        System.out.println("Enter the Price of the Carpet per Square meter");
        float rate = sc.nextFloat();
		double AreaC=Lc*Wc;
		double Cc = AreaC*rate;
		System.out.println("Total Cost : "+Cc+" $");
	}
}