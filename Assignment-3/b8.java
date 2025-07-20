/*
8. 	
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
		{
			System.out.println("You have any Medical Cause : Give the Answer in 'Y' or 'N' ");
			char res = sc.next().charAt(0);
			if(res == 'Y'||res == 'y')
				System.out.println("Studen is able to sit in Exam");
			else
				System.out.println("Student is not able to sit in Exam");

		}


		
	}
}