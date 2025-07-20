/*
30. How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?
*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        float L,W,l,w,Areat,Areaf;
		System.out.println("Enter the length and width of tile ");
        L = sc.nextFloat();
        W = sc.nextFloat();
        System.out.println("Enter the length and width of the room");
        l = sc.nextFloat();
        w = sc.nextFloat();

		Areat = L*W;
		Areaf= l*w;

		double TNT = Areaf/Areat;
		System.out.println("Total Number of Tile : "+TNT);
	}
}
