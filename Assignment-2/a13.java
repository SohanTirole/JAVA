/*
13. The area of a right triangle is 184 cm² and one of its legs is 16 cm long. Find the length of other leg.
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Area, Base, Length;
		System.out.println("Enter the Area of traingle : ");
		Area = sc.nextFloat();
		System.out.println("Enter the One legs value : ");
		Base = sc.nextFloat();
		
		Length = (2*Area)/Base;
		
		System.out.println("Length of the traingle is :"+Length+" cm");
	}
}