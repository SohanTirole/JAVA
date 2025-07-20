/*
25. 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden. What is the area of the path?
*/
class Test
{
	public static void main(String args[])
	{
		float TNB = 100, L=24, B=15, H;
		//Area of Rectangle = length * width
		float AOB = L*B;
		
		float AOP = AOB*TNB;
		System.out.println("Area of Path is : "+AOP+" cm^2");

		
	}
}