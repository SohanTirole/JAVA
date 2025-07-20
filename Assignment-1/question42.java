/*
42. Find the Volume of Cylinder whose diameter and height are 2.25cm
*/
class Test
{
	public static void main(String args[])
	{
		float r, Vc;
		r = (float)(2.25/2);
		float h = (float)(2.25);
		//Volume=πr^2h
		
		Vc = (float)((3.1416)*r*r*h);

		System.out.println("Volume of the Cylender is : "+Vc+" cm^3");

	}
}