/*
34. A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway.
*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);

		float b1, b2, h, AreaT, Lw, Ww, UAreaW;
       		System.out.println("Enter the First Base of trapezoid : ");
		b1 = sc.nextFloat();
		System.out.println("Enter the Second Base of trapezoid : ");
		b2 = sc.nextFloat();
		System.out.println("Enter the First Height of trapezoid : ");
		h = sc.nextFloat();
		System.out.println("Enter the width of walkway : ");
		Ww = sc.nextFloat();
		
		

		//Area of Trapezoid Area= 2/1×(b1+b2)×h

		AreaT = ((b1+b2)*h)/2;
		Lw = h;

		float AreaW = Lw*Ww;

		UAreaW = AreaT + AreaW;
		
		System.out.println("Total Area After adding Walkwaycd : "+UAreaW+" m^2");
	}
}