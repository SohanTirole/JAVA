/*
36. What is the surface area of a cylinder if the diameter is 15m height is 7m?
*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		long SArea;
		float r,diameter;
		System.out.println("Enter the Diameter of the Cylinder");
		diameter = sc.nextFloat();
		r = (diameter/2);
		
		//Surface Area=2πr(r+h)
		SArea = (long)((2*(3.1416)*r)*(r+7));
		System.out.println("Surface of Area of A Cylinder : "+SArea+" m^2");
	}
}