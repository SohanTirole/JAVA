/*
21. Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the Angles of the tringle : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        int sum = a+b+c;

        if(sum==180)
            System.out.println("Given Triangle is Valid...");
        else
            System.out.println("Given Triangle is not Valid..");
    }
}