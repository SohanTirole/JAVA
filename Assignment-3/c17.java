/*
17. W.A.P to check the sign of given number. 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any numer");
        int n = sc.nextInt();

        if(n>0)
            System.out.println("Giver number is '+' Positive");
        else if(n==0)
            System.out.println("Given number is '0' Nutral");
        else
            System.out.println("Given number is '-' Negative");
    }
}