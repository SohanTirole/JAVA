/*
15. Shelly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?
*/
class Test
{
	public static void main(String args[])
	{
		float AreaR, Length, Breadth;
		Length = 22;
		Breadth = 15;

		//Area of rectangular = Length * Width
		AreaR = Length * Breadth;
		
		float AreaS, S=21, result;
		//Area of Squar = side * side
		AreaS = S*S;
		
		if(AreaR>AreaS)
		{
			System.out.println("Rachel's Garden is Bigger By : "+AreaR);
		}
		else
		{
			System.out.println("Shelly's Garden is Bigger By : "+AreaS);
		}
	}
}