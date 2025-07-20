/*
23. Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float VCubic,side, VCarton, L,W,H;
		System.out.println("Enter the Length, Height and Width of Carton");
		L = sc.nextFloat();
		H = sc.nextFloat();
		W = sc.nextFloat();
		System.out.println("Enter the One side of Cubical boxes");
		side = sc.nextFloat();
		
		//Volume of the cubic = length * Breadth * Height 
		VCubic = side*side*side;
		
		//Volume of Carton = lenth*Breadth*Height
		VCarton = L*W*H;

		float Boxes = VCarton/VCubic;
		System.out.println(Boxes+" Numeber of cubical boxes carry by carton ");
	}
}