/*
32. A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden.

*/
class Test 
{
	public static void main(String args[])
	{
		float AreaG, AreaS, SideG, SideS;

		SideG = 150;
		SideS = 25;

		//Area of Sqare = side*side
		AreaG = SideG*SideG;

		AreaS = SideS*SideS;

		float AreaGardenF = AreaG-AreaS;
		System.out.println("Area of Squere Garden is : "+AreaGardenF+" m^2");
	}
}
