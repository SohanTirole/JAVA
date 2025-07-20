/*
42. Find the Volume of Cylinder whose diameter and height are 2.25cm
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float r, Vc;
		System.out.println("Enter the Diameter and Height of Cylinder : ");
		float Diamtr = sc.nextFloat();
		float h = sc.nextFloat();
		r = (float)(Diamtr/2);
		
		//Volume=πr^2h
		
		Vc = (float)((3.1416)*r*r*h);

		System.out.println("Volume of the Cylender is : "+Vc+" cm^3");

	}
}