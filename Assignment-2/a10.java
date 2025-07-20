/*
10. Find the area of an isosceles right angled triangle of equal sides 15 cm each.
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float s, Area;
        System.out.println("Enter the side of an isosceles right angle tringle : ");
        s = sc.nextFloat();

        Area = (float)((s*s)/2);
        System.out.println("Area of an isosceles right angle tringle : "+Area+" cm^2");

    }
}