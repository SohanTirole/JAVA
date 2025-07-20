/*
1. WAP to calculate area of circle 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float Area,r;
        System.out.println("Enter the Radious of the Circle : ");
        r = sc.nextFloat();

        Area =(float)(3.1416*r*r);

        System.out.println("Area of Circle is : "+Area);
    }

}