/*
18. Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day, how much distance does he cover in a day in km?
*/
class Test 
{
	public static void main(String args[])
	{
		float L, B, Peri;
		L = 50;
		B = 30;
		
		//Perimeter=2×(Length+Breadth)
		Peri = 2*(L+B);
		
		//Ron jogs take 10 round of the aprk each day
		float day= Peri*10;
		
		float KM = day/1000;
		System.out.println("Ron Jog "+KM+" Km cover in one Day");
		

	}
}