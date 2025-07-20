/*
. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 
*/
class Test 
{
	public static void main(String args[])
	{
		float LengT, BreadthT,AreaT, AreaR, LengR, BreadR, NOT;
		LengT=13;
		BreadT=7;
		
		//Formula : Area of Rectangle = Length * Beidth
		AreaT = LengT*BreadT;
		System.out.println("Area of Rectangular Tile : "+AreaT);

		//Formula : Area of Rectangle = Length * Beidth
		LengR=520;
		BreadR=140;
		AreaR = LengR*BreadR;
		System.out.println("Area of Region : "+AreaR);

		//Formula : Numnber of the Tile = Area of the Region/Area of the tile
		NOT = AreaR/AreaT;
		System.out.println(NOT+" : Number of tile used for covering out the Region");


		
	}
}
