/*
29. How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?
*/
class Test 
{
	public static void main(String args[])
	{
		float Areaf, Areat;
		Areat=10*10;
		Areaf=800*900;
		double NT = Areaf/Areat;

		System.out.println("Total Number of Tile Required : "+NT);
		
	}
}
