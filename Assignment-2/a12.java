/*
12. Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm. Find the length of the other side.

*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float H, Area, Base, Length;
		
		System.out.println("Enter the Hypotenuse of the Triangle :  ");
		H = sc.nextFloat();
		System.out.println("Enter the side of the Tringle : ");
		Base = sc.nextFloat();
		

		//Using Pythagoras Theoram
		Length=(H*H)-(Base*Base);
		Length = (float)(Math.sqrt(Length));
		
		Area = (Base*Length)/2;

		System.out.println("Area of the Triangle is : "+Area);
		System.out.println("Length of the Tringle is : "+Length);

		
	}
}