//28) Program to convert mm to inches
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value in Milimeter");
        float mm = sc.nextFloat();

        float inches = (float)(mm*0.0393701);

        System.out.println(mm+" Milimeter in Inches : "+inches);
    }
}