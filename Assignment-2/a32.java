/*
32. A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden.

*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		float AreaG, AreaS, SideG, SideS;
        System.out.println("Enter the Length of the Squre Garden");
        SideG = sc.nextFloat();
        System.out.println("Enter the Length of the Squre Swimming pool");
		SideS = sc.nextFloat();

		//Area of Sqare = side*side
		AreaG = SideG*SideG;

		AreaS = SideS*SideS;

		float AreaGardenF = AreaG-AreaS;
		System.out.println("Area of Squere Garden is : "+AreaGardenF+" m^2");
	}
}
