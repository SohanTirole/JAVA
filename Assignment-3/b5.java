/*
5.Take input of age of 3 people by user and determine oldest and youngest among them.
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int A,B,C;

		System.out.println("Enter the Age of Three People : ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();

		if(A>B)
		{
			if(A>C)
			{
				System.out.println("A is oldest Person");
			}
			else
			{
				System.out.println("C is Oldest Person");
			}
		}
		else
		{
			if(B>C)
				System.out.println("B is Oldest Person");
			else
				System.out.println ("C is Oldest Person");
		}
		//------------------------------------------------------------
		if(A<B)
		{
			if(A<C)
			{
				System.out.println("A is Youngest Person");
			}
			else
			{
				System.out.println("C is Youngest Person");
			}
		}
		else
		{
			if(B<C)
				System.out.println("B is Youngest Person");
			else
				System.out.println ("C is Youngest Person");
		}

	}
	
}	