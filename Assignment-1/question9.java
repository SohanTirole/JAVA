/*
9. Find the area of an equilateral triangle, the length of whose sides is 12 cm.
*/

class Test 
{
	public static void main(String args[])
	{
		float S;
		double Area; 
		S = 12;

		// Formula : Area = (√3/4) × a² 
			
		Area = (Math.sqrt(3)/4)*(S*S);
		
		System.out.println("Area of equilateral Triangle is : "+Area+" cm");
	}
}
