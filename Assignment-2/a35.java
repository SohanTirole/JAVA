/*
 35. Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.
*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        float r, h;
        System.out.println("Enter the Radious of the Cylinder in cm : ");
        r =  sc.nextFloat();
        System.out.println("Enter the Height of the Cylindar in cm : ");
        h = sc.nextFloat();
		//Surface Area=2πr(r+h)

		float SArea =(float) ((2*(3.14)*r)*(r+h));
		
		System.out.println("Usable Area of Garden is : "+SArea+" cm^2");
	}
}