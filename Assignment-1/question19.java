/*
19. A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume?
*/
class Test
{
	public static void main(String args[])
	{
	
		float Cube, Cuboid;

		//Cuboid : Volume = length × width × height
		Cuboid = (7*4*8);
		System.out.println("Volume of Cuboid : "+Cuboid);
		
		//Cube : Volume = edge *edge *edge
		Cube = (7*7*7);
		System.out.println("Volume of Cube : "+Cube);
		

	}	
}
