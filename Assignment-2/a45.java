/*
45. Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .*/

import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, n;
		System.out.println("Enter the Turm up to where yout to some of the serise : ");
		n = sc.nextInt();
		
		float sum;
		a=-21;
		int d = -18-(-21);
	

		System.out.println("Difference : "+d);

		//Sn = 2/n[2a+(n−1)d]
		n=28;
		sum = (n/2)*((2*a)+(n-1)*d);
			
		System.out.println("Sum of the Series up to 28th term is : "+sum);
	}
}
