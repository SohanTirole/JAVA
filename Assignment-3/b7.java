/*
7. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.

*/
import java.util.Scanner;
class Test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 float Attend, Class;
		System.out.println("Enter the Total number of classes Held : ");
		Class = sc.nextInt();
		System.out.println("Etner the Total Numeber of Attendence : ");
		Attend = sc.nextInt();
		
		float Peri = (Attend/Class)*100;
		System.out.println("Attendenc : "+Peri);
		if(Peri>=75)
			System.out.println("Student is Allowed to sit in Exam");
		else
			System.out.println("Student is Not Allowed to sit in Exam");
		

	 	
	}
}