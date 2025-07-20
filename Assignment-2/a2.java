/*
2. The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter. 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        float L, B, Area;
    
        System.out.println("Enter the Area and Breidth of the Rectangle : ");
        Area = sc.nextFloat();
        B = sc.nextFloat();
        
        L = Area/B;

        double Peri = 2*(L+B);
        System.out.println("Perimeter of the Rectangle is : "+Peri);
        System.out.println("Length of the Rectangle is : "+L);

    }
}