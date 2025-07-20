/*
16. Tina wants a new carpet for her rectangular dining room. Her dining room is a 5 meters by 7 meters rectangle. How much carpet does she need to buy to cover her entire dining room.
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float L, W, Area;
		System.out.println("Enter the Size of Tina's Carpet");
		L = sc.nextFloat();
		W = sc.nextFloat();


		//Area of Rectangular Area=Length×Breadth
		Area = L*W;
		System.out.println("Tina does buy "+Area+" meters^2 carpet for her rectangular dining room");
	}
}