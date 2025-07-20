/*
38. The cylinder has a volume of 1287. The base has a radius 10. What is the area of the surface of the cylinder?
*/
class Test 
{
	public static void main(String args[])
	{
		float Vc, r;
		float h;
		float Sc;
		Vc = 1287;
		r=10;
			
		//V=πr^2h
		h =(float)(Vc/((3.1416)*r*r));
		
		//Surface Area=2πr(r+h)
		Sc =(float)(2*(3.1416)*r*(r+h));

		System.out.println("Area of the surface of the Cylinder : "+Sc+" unit's^2");
	
	}
}