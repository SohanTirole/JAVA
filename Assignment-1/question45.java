/*
45. Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .*/

class Test
{
	public static void main(String args[])
	{
		int a, n;
		float sum;
		a=-21;
		int d = -18-(-21);

		System.out.println("Difference : "+d);

		//Sn = 2n[2a+(n−1)d]
		n=28;
		sum = (n/2)*(-(a*2)+(n-1)*d);
			
		System.out.println("Sum of the 28th term is : "+sum);
	}
}
