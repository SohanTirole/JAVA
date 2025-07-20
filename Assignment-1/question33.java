/*
33. A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways that run perpendicular from its sides. One pathway has a width of 3 m and the other, 4 m. Calculate the total usable area of the garden.

*/
class Test 
{
	public static void main(String args[])
	{
		float AreaG, L, W, UAreaG, Hp, Vp, PTA;
		L= 30;
		W= 20;
		Hp = L*3;
		Vp = W*4;
		
		AreaG = L*W;	
		PTA = Hp+Vp-(3*4);
		UAreaG = AreaG-PTA;
		
		System.out.println("Usable Area of Garden is : "+UAreaG+" m^2");
	}
}