/*
26. How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float AOB, TCB, Lp, Wp, Lb, Wb;
		System.out.println("Enter the Length and Bredth of the Breck in cm : ");
		Lb = sc.nextFloat();
		Wb = sc.nextFloat();
		System.out.println("Enter the Length and Bredth of Path in Meter : ");
		Lp = sc.nextFloat();
		Wp = sc.nextFloat();

		//Area of one brick=Length×Breadth
	
		float AoB =(float)(Lb*Wb);
		float AOP = (float)((Lp*100)*(Wp*100));
		float TNB = (AOP/AoB);
		System.out.println("Total Number of Brick used : "+TNB);
			
	}
}