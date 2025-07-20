/*
43. Find the cost of polishing the base of a cone whose height is 4cm and slant height 5 cm at the rate of 10 rs. Per sq. cm
*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float r, l, h, Cost, Area;
		System.out.println("Enter the Cone Height : ");
		h = sc.nextFloat();
		System.out.println("Enter the Slant Height : ");
		l = sc.nextFloat();
		System.out.println("Enter the Cost of Polishing per sq. cm");
		Cost = sc.nextFloat();
		
		//Pythagoras Theorem l^2=r^2+h^2⇒r^2=l^2−h^2
		r = (float)((l*l)-(h*h));
		r = (float)(Math.sqrt(r));
		
		//Area of base=πr^2	
		Area =(float)((3.1416)*r*r);
		Cost = (float)(Area*10);
		System.out.println("Cost of Polishing : "+Cost+" rs");
		
	}
}

