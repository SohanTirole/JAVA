/*
 27. Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m.
*/
class Test
{
	public static void main(String args[])
	{
		float Ld, Wd;
		Ld=20;
		Wd=15;
		//Area=Length×Breadth
		double Aread = Ld*Wd;
		double TC = Aread*5;
		System.out.println("Total Cost : "+TC+" $"); 
		
	}
}