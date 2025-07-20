/*
1.	The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
*/

class Test
{
	public static void main(String args[])
	{
		float A,L,W,P;
		L=70;
		P=230;

		//Width of the Rectangle(W) = (P = 2(L + W)) → W = P/2 - L
		W = P/2-L;
		System.out.println("Width of the Rectangle : "+W);

		//Area of the Rectangle(A) = L*W
		A = L*W;
		System.out.println("Area of the Rectanlge : "+A);
		
	}
}