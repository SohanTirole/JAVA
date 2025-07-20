/*
25. 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden. What is the area of the path?
*/

import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc	 = new Scanner(System.in);
		float L, W, AreaB, Brick;
		System.out.println("Enter the Total number of Brick's used in path");
		Brick = sc.nextFloat();
		System.out.println("Enter the Length and Width of the Brick");
		L = sc.nextFloat();
		W = sc.nextFloat();

		AreaB = L*W;
		float AreaP = AreaB*Brick;

		System.out.println("Area of the Path of the Garden : "+AreaP);
		
	}
}