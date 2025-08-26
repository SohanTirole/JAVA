//9) WAP to find out area of triangle 
//   (by herons formula)
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //Area = √{s(s-a)(s-b)(s-c)}
        System.out.println("Enter the three sides of traingle");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        float s =(float) ((a+b+c)/(2.0));
        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println(String.format("Area of traingle : %.2f",area));
    }
}
