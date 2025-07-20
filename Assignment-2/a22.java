/*
22. A pond is 50 m long, 30 m wide and 2 m deep. Find the capacity of the pond in cubic metre.
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float L, W, D, Volume;
		System.out.println("Enter the Measuring of the Pond : How much Long, Wide, Deep");
		L = sc.nextFloat();
		W = sc.nextFloat();
		D = sc.nextFloat();
		
		//Volume = height * width * length
		Volume = L * W * D;
		System.out.println("Capacity of the Pond is : "+Volume);
		
	}
}