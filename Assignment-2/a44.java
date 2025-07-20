/*
44. Find the 28th term of an Arithmetic Progression -21 -18 -15 -12 . . . . . 
*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a, diff;
		System.out.println("Enter the Term you want to find out : ");
		int n = sc.nextInt();
		a =-21;
		diff = (-18)-(-21);
		
		 
		//a+(n-1)*d
		int term = a+(n-1)*diff; 	
	
		System.out.println("28th term is : "+term);
	}
}
