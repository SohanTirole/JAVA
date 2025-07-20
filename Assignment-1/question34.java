/*
34. A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway.
*/
class Test 
{
	public static void main(String args[])
	{
		float b1, b2, h, AreaT, Lw, UAreaW;
		b1=128;
		b2=92;
		h=40;

		//Area of Trapezoid Area= 2/1×(b1+b2)×h

		AreaT = ((b1+b2)*h)/2;
		Lw = (128+92)/2;

		float AreaW = Lw*4;

		UAreaW = AreaT - AreaW;
		
		System.out.println("Usable Area of Garden is : "+UAreaW+" m^2");
	}
}