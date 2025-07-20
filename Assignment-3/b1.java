/*
1. Take values of length and breadth of a rectangle from user and check if it is square or not.
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float L, H, S;
		System.out.println("Enter the Length and Breadth of Rectangle");
		L = sc.nextFloat();
		H = sc.nextFloat();
		
		if(L==H)
			System.out.println("Given Ractangle is Squre");
		else
			System.out.println("Given Rectangle is not Squre");
		
	}
}