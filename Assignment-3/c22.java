/*
22. Write a Java program to check whether a number is divisible by 5 and 11 or not. 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please Enter any Number : ");
        n = sc.nextInt();

        if(n%5==0&&n%11==0)
            System.out.println(n+" is Divisible by 5 and 11");
        else
            System.out.println(n+" is not Divisible by 5 and 11");
    }
}