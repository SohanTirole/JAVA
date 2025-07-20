/*
40. Calculate the volume of the cylinder: r = 5 cm, h = 9 cm
*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Vc, r, h;
		System.out.println("Enter the Radious of the Cylinder : ");
		r = sc.nextFloat();
		System.out.println("Enter the Height of the Cylinder : ");
		h = sc.nextFloat();

		
		//Volume=πr^2h

		Vc = (float)((3.1416)*(r*r*h));
		System.out.println("Volume of the Cylinder : "+Vc+" cm^3");
	
	}
}