/*
30. How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?
*/
class Test 
{
	public static void main(String args[])
	{
		float Areat, Areaf;

		Areat = 5*8;
		Areaf= 200*400;

		double TNT = Areaf/Areat;
		System.out.println("Total Number of Tile : "+TNT);
	}
}
