/*
8. Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².
*/

class Test
{
	public static void main(String args[])
	{
		float Area, H, B;
		H = 20;
		//we have area in the form of m^2

		//Convert the height from cm to m^2	
		Area=(float)0.8*10000;
		
		H = H/100;

		//Formula : Area of Triangle = 1/2*base*height
		B = (2*Area)/H;
		System.out.println("Base of Triangle is : "+B+" m^2");
	}
}