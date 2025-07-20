/*
26. How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?
*/

class Test
{
	public static void main(String args[])
	{
		float AOB, TCB, Lp, Bp, Lb, Wb;

		//Area of one brick=Length×Breadth
		Lp=120;
		Bp=(float)(2.4);
		Lb= 15;
		Wb=24;
		float AoB =(float)(Lb*Wb);
		float AOP = (float)((Lp*100)*(Bp*100));
		float TNB = AOP/AoB;
		System.out.println("Total Number of Brick used : "+TNB);
		
		
		
	}
}