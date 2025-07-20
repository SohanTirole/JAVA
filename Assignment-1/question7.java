/*
7. Find the height of a triangle whose base is 50 cm and whose area is 500 cm².
*/
class Test 
{
	public static void main(String args[])
	{
		float Area, H, B;
		Area = 500;
		B = 50;

		//Formula : Area = 1/2*base*height
		H = (2*Area) / B;
		System.out.println("Height of the Given Traingle is : "+H+" cm");
	}
}