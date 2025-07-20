/*
8. WAP to check wheather number is even or odd
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any nuber : ");
        int n = sc.nextInt();

        if(n%2==0)
            System.out.println(n+" is Even");
        else
            System.out.println(n+" is Odd");
    }

}