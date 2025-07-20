/*

6. Write a program to print absolute vlaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1

*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float n;
		System.out.println("Enter any Value : ");
		n = sc.nextInt();
		
		float result = Math.abs(n);

		System.out.println("Absolute Value of "+n+" is : "+result);
		
		
	}
}