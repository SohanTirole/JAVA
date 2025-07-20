/*
 27. Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m.
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		float Ld, Wd;
        System.out.println("Eter the length and width of the Dianing room ");
        Ld = sc.nextFloat();
        Wd = sc.nextFloat();

        System.out.println("Rate of tiling a Dining room");
        float rate = sc.nextFloat();
		//Area=Length×Breadth
		float Aread = Ld*Wd;
		float TC = Aread*rate;
		System.out.println("Total Cost : "+TC+" $"); 
		
	}
}