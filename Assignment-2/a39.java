/*
39. Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters.
*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		float r, h, Sc;
		System.out.println("Enter the Diameter of the Cylinder");
		float Diamtr = sc.nextFloat();
		System.out.println("Enter the Height of the Cylinder");
		h = sc.nextFloat();
		
		r=(float)(Diamtr/2);

		//Surface Area=2πr(r+h)
		Sc =(float)(2*(3.1416)*r*(r+h));
		System.out.println("Surface Area of the Cylinder : "+Sc+" cm^2");
	
	}
}