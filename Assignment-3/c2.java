/*
2. WAP to calculate area of rectangle
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float Area, L, W;

        System.out.println("Enter the Length and Width of the Rectangle : ");
        L = sc.nextFloat();
        W = sc.nextFloat();

        Area = L*W;
        System.out.println("Area of Rectangle : "+Area);
    }

}