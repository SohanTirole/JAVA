/*
 35. Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.
*/
class Test 
{
	public static void main(String args[])
	{
		float h;
		h=12;
		double r=7.7;

		//Surface Area=2πr(r+h)

		double SArea = ((2*(3.14)*r)*(r+h));
		
		System.out.println("Usable Area of Garden is : "+SArea+" cm^2");
	}
}