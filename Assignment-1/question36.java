/*
36. What is the surface area of a cylinder if the diameter is 15m height is 7m?
*/
class Test 
{
	public static void main(String args[])
	{
		long SArea;
		float r=(15/2.0f);
		//Surface Area=2πr(r+h)
		SArea = (long)((2*(3.1416)*r)*(r+7));
		System.out.println("Surface of Area of A Cylinder : "+SArea+" m^2");
	}
}