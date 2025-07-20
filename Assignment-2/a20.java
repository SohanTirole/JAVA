/*
20. What is the volume of a brick of ice-cream with length 25 cm, breadth 10 cm and height 8 cm?
*/
import java.util.Scanner;
class Test
{	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Brick;
		System.out.println("Enter the Length, Breadth and Height of the Brick");
		float L,W,H;
		L = sc.nextFloat();
		W = sc.nextFloat();
		H = sc.nextFloat();
		
		
		//Voluem of Cuboid = length × width × height

		Brick = L*W*H;

		System.out.println("Volume of Brick is : "+Brick+" cm^3");
	}
}