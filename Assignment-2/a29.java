/*
29. How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?
*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        float Areat, Areaf, l, w;
        System.out.println("Enter the side of the Squere tile");
        float side = sc.nextFloat();
        System.out.println("Enter the length and width of the floor");
        l = sc.nextFloat();
        w = sc.nextFloat();

		Areat=side*side;
		Areaf=l*w;
		double NT = Areaf/Areat;

		System.out.println("Total Number of Tile Required : "+NT);
		
	}
}
