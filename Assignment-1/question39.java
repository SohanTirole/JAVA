/*
39. Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters.
*/

class Test 
{
	public static void main(String args[])
	{
		float r, h, Sc;
		h = 9;
		
		r=(12/2.0f);

		//Surface Area=2πr(r+h)
		Sc =(float)(2*(3.1416)*r*(r+h));
		System.out.println("Surface Area of the Cylinder : "+Sc+" cm^2");
	
	}
}