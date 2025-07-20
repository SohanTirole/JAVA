/*
21. A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Brick, Wall;
		System.out.println("Enter the Measures of the Wall : length, Breadth, Height");
		float L,W,H;
		L = sc.nextFloat();
		W = sc.nextFloat();
		H = sc.nextFloat();
		System.out.println("Enter the Measures of the Brick : length, Breadth, Height");
		float l, w, h;
		l = sc.nextFloat();
		w = sc.nextFloat();
		h = sc.nextFloat();
		
		//beacause : 1 m = 100 cm
		 Wall = (L*100)*(W*100)*(H*100);
		
		Brick = l*w*h;
		float TotalBrick = Wall/Brick;

		System.out.println(TotalBrick+" Brick's are used to make a Wall ");
	}
}