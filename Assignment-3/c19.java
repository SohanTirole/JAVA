/*
19. W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter Three side of Traingle : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a==b&&b==c)
            System.out.println("equilateral triangle");
        else if((a==b&&b!=c)||(b==c&&c!=a)||(c==a&&c!=b))
            System.out.println("Isosceles triangle");
        else
            System.out.println("Scalene triangle");
    }
}