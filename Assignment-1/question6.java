/*
6.Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.
*/

class Test 
{
	public static void main(String args[])
	{
		float A,B,C,Peri;
		//Formula : perimeter of a triangle(P) = A+B+C
		//: C = P-A-B
		Peri=36;
		A=10;
		B=9;
		C = Peri-A-B;
		System.out.println("Third Side of The triangle : "+C+" cm");

		//now we find Semi Perimeter
		float S = (A+B+C)/2;
		System.out.println("Semi Perimeter : "+S+" cm");
		
		//FINDIGN THE AREA OF TRINGLE 	
		
		Double Area =Math.sqrt(S*((S-A)*(S-B)*(S-C)));
		System.out.println("Area of Triangle : "+Area+"cm^2");
		
		
	}
}
