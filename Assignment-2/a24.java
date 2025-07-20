/*
24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall?
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float VBrick,VWall,H,W,L,h,w,l;
		System.out.println("Enter the Height, Width and Length of the Brick");
		H = sc.nextFloat();
		W = sc.nextFloat();
		L = sc.nextFloat();
		
		System.out.println("Enter the Height, width and length of the Wall");
		h = sc.nextFloat();
		w = sc.nextFloat();
		l = sc.nextFloat();
		
		VBrick = H*W*L;
		VWall = (h*100)*(w*100)*(l*100);
		
		float TNOB = (float)(VWall/VBrick);
		System.out.println(TNOB+" Brick's used in Wall");
		float Cost = ((TNOB/1000)*900);
		System.out.println(Cost+" Total Cost of the Brick's which is used in Wall");
	}
}