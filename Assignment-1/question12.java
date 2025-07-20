/*
12. Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm. Find the length of the other side.
*/
class Test 
{
	public static void main(String args[])
	{
		float Area, B, H, L;
		B = 12;
		H = 13;

		//Pythagoras Theoram : In a right-angled triangle: A2+B2 = C2
		// 						C2-A2=B2
		L =(H*H)-(B*B);
		L =(float)Math.sqrt(L);
		
		System.out.println("Length : "+L);

		
		//Formula : Area of triangle = 1/2 * Base * Height
		Area = (B*L)/2;
		System.out.println("Area or Right angled Traingle is : "+Area+" cm^2");
		
		
	}
}