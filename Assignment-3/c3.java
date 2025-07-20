/*
3. WAP to calculate the percentage of students

*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float TMarks,OMarks, Percentage;
        System.out.println("Enter the Total Marks and Obtain marks of the Student : ");
        TMarks = sc.nextFloat();
        OMarks = sc.nextFloat();

        Percentage = ((OMarks/TMarks)*100);
        System.out.println("Percentage : "+Percentage+" %");


    }

}