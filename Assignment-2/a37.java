/*
37. The surface of the cylinder is 149 cm². The cylinder height is 6 cm. What is the diameter of this cylinder?
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	float SurfaceArea, height, Diameter;

	System.out.println("Enter the Surface Area of Cylinder : ");
	SurfaceArea = sc.nextFloat();
	System.out.println("Enter the Height of Cylinder : ");
        height = sc.nextFloat();

	//A=2πr^2+2πrh
        float a = 2;
        float b = 2*height;
        float c = -SurfaceArea;
    
        double Radius = (Math.sqrt((b*b-4*a*c)/Math.PI)/4.0f)-3;
        System.out.println("Radius of Cylinder : "+Radius);
	}	

}