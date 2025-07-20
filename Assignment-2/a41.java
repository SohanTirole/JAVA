/*
41. I need to calculate the cylinder volume with a height of 50 cm and a diameter of 30 cm.

*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Vc, h, r;
		System.out.println("Enter the height of the Cylinder");
		h=sc.nextFloat();
		System.out.println("Enter the Diameter of the Cylinder");
		float Diamtr = sc.nextFloat();
		r = (float)(Diamtr/2);

		//Volume=πr^2h
		
		Vc = (float)(((3.1416)*r*r*h));
		System.out.println("Volume of the Cylinder : "+Vc+" cm^3");
	
	}
}