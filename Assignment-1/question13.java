/*
13. The area of a right triangle is 184 cm² and one of its legs is 16 cm long. Find the length of other leg.
*/
class Test
{
	public static void main(String args[])
	{
		float Area = 184, L = 16,H;
		//Converting the value of Area from cm^2 to cm
		 
		
		//Area = 1/2 * base * height

		H = (2*Area)/L;
		System.out.println("Length of other legs : "+H);
		
	}
}