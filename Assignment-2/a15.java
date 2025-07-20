/*
15. Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Areas, Arear, L, B, s;
		System.out.println("Enter ther Length and Breidth of Shelly's Garden");
		L = sc.nextFloat();
		B = sc.nextFloat();
		System.out.println("Enter the side of Rachel's Square Garden");
		s = sc.nextFloat();
		
		Areas = L*B;
		Arear = s*s;
			
		String result = (Areas>Arear)? "Greater" : "Not Greater";
		
		System.out.println("Shelly Garden is "+result);

		
		
	}
}