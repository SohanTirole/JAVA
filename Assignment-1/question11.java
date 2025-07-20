/*
11. The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m². Find the height and base of the triangle.
*/
class Test
{
	public static void main(String args[])
	{
		float Area, H, B;
		float x;
		Area = 320;
		
		//Area = 1/2 * Base * Height
		//Assume that 5x is base and 8x is height
		x=(float)(Math.sqrt((2*Area)/40));
		H = 8*x;
		B = 5*x;
		
		System.out.println("Height : "+H+" Breadth : "+B);
	}
}