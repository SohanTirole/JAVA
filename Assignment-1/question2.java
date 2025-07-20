/*
2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter. 
*/
class Test
{
	public static void main(String args[])
	{
		float L, P, B, A;
		A = 96;
		B = 8;
	
		//Formula : Length of the Rectangle = Area / Breadth
		L = A/B;
		System.out.println("Length of the Rectangle is : "+L);
		
		 //Formula : Perimeter of the Rectangle = 2(L+B)
		P = 2*(L+B);
		System.out.println("Perimeter of the Rectangle is : "+P);		
	}
}