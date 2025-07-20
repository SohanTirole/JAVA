/*
17. Luci is making a display board for the school exhibition. The display board is a 3 m by 2 m rectangle. He needs to add a ribbon border around the entire display board. What is the length of ribbon that he needs?
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Peri, L, B;

		System.out.println("Enter the Size of Display Board : ");
		L = sc.nextFloat();
		B = sc.nextFloat();
		
		//Perimeter=2×(Length+Breadth)
		Peri = 2*(L+B);
		
		System.out.println("Luci Needs "+Peri+" meter ribbon border for adding arround the display");
	}
}