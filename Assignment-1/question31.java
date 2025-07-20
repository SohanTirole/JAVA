 /*
31. What will be the area of a square with perimeter 200 m?
*/
class Test
{
	public static void main(String args[])
	{
		float Area, P, Side;
		P=200;
		//P=4×side
		Side = P/4;
		//Area of Square = Side*Side;
		Area = Side*Side;
		System.out.println("Area of Squre is : "+Area+" m");
	}
}