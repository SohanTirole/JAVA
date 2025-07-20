/*
	23. Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
*/
class Test
{
	public static void main(String args[])
	{
		float VCubic,side, VCarton;
		side=3; 
		
		//Volume of the cubic = length * Breadth * Height 
		VCubic = side*side*side;
		
		//Volume of Carton = lenth*Breadth*Height
		VCarton = 15*9*12;

		float Boxes = VCarton/VCubic;
		System.out.println(Boxes+" Numeber of cubical boxes carry by carton ");
		
		

	}
}