/*
19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume?
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Cube, Cuboid, H, W, L, E;
		System.out.println("Enter the Edge of cube");
		E = sc.nextFloat();
		System.out.println("Enter the Measuring of cuboid");
		L = sc.nextFloat();
		W = sc.nextFloat();
		H = sc.nextFloat();

		//Cuboid : Volume = length × width × height
		Cuboid = (L*W*H);
		System.out.println("Volume of Cuboid : "+Cuboid);
		
		//Cube : Volume = edge *edge *edge
		Cube = (E*E*E);
		System.out.println("Volume of Cube : "+Cube);
		
	}
}