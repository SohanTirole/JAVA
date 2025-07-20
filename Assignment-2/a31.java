/*
    31. What will be the area of a square with perimeter 200 m?
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		float Area, P, Side;
        System.out.println("Enter the Perimeter of the Squere");
        P = sc.nextFloat();
		
		//P=4×side
		Side = P/4;
		//Area of Square = Side*Side;
		Area = Side*Side;
		System.out.println("Area of Squre is : "+Area+" m^2");
	}
}