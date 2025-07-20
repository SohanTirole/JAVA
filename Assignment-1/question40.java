/*
40. Calculate the volume of the cylinder: r = 5 cm, h = 9 cm
*/

class Test 
{
	public static void main(String args[])
	{
		float Vc, r, h;
		r=5;
		h=9;
		
		//Volume=πr^2h

		Vc = (float)((3.1416)*(r*r*h));
		System.out.println("Volume of the Cylinder : "+Vc+" cm^3");
	
	}
}