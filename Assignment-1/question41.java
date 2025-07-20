/*
41. I need to calculate the cylinder volume with a height of 50 cm and a diameter of 30 cm.

*/

class Test 
{
	public static void main(String args[])
	{
		float Vc, h, r;
		h=50;
		r = (30.0f/2);

		//Volume=πr^2h
		
		Vc = (float)(((3.1416)*r*r*h));
		System.out.println("Volume of the Cylinder : "+Vc+" cm^3");
	
	}
}