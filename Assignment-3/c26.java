/*
26. Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer.          Calculate percentage and grade according to following: 
	Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float P, CH, C, M, B,Per;
        System.out.println("Enter the Marks of 5 Subject : in Between 1 to 100 : -\n 1 . PHYSICS\n 2 . CHEMISTRY\n 3 . MATHEMATICS \n 4 . COMPUTER\n 5 . BIOLOGY");
        P = sc.nextFloat();
        CH = sc.nextFloat();
        M= sc.nextFloat();
        C = sc.nextFloat();
        B = sc.nextFloat();
        if((P<100&&CH<100&&M<100&&B<100&&C<100)&&(P>0&&CH>0&&M>0&&B>0&&C>0))
        {
            float Obtain = P+CH+M+C+B;
            System.out.println("Enter the Total Marks");
            int Total = sc.nextInt();
            Per = (Obtain/Total)*100;

            
            if(Per>=90)
                System.out.println("Grade : A");
            else if(Per>=80||Per<90)
                System.out.println("Grade : B");
            else if(Per>=70||Per<80)
                System.out.println("Grade : C");
            else if(Per>=60||Per<70)
                System.out.println("Grade : D");
            else if(Per>=40||Per<60)
                System.out.println("Grade : E");
            else if(Per<40)
                System.out.println("Grade : F");

        }
        else
            System.out.println("PLeas Enter Valid Input...");
        
        /*
        Percentage >= 90% : Grade A 
	Percentage >= 80% : Grade B 
	Percentage >= 70% : Grade C 
	Percentage >= 60% : Grade D 
	Percentage >= 40% : Grade E 
	Percentage < 40% : Grade F
        */
        



    }

}