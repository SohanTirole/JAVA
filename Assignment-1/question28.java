/*
28. A carpet is 5 m long and 4 m wide. Find its price at the rate of $ 205 per square meter.
*/
class Test 
{
	public static void main(String args[])
	{
		float Lc, Wc;

		Lc=5;
		Wc=4;

		double AreaC=Lc*Wc;
		double Cc = AreaC*205;
		System.out.println("Total Cost : "+Cc+" $");
	}
}