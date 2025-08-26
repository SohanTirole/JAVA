//14) Program to find out total and percentage by getting marks of 5 subjects
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the five Subjects Marks");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();

        System.out.println("Total of Five Subject : "+(a+b+c+d+e));
        float per =(float)(((a+b+c+d+e)/500.0)*100);
        System.out.println("Percentage of Five Subject : "+per);
    }
}