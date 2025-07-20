/*
4. Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m
*/
class Test 
{
	public static void main(String args[])
	{
		float A, L, W, Cost, Rate;
		L=300;
		W=150;
		Rate=6;
		
		//Formula : Area=Length×Width
		A = L*W;
		System.out.println("Area of Land : "+A);

		//Formula : Cost=(Area/100)×Rate per 100 m^2
		Cost = (A/100)*Rate;
		System.out.println("Cost of tilling the Land : "+Cost);
		 
	}
}
