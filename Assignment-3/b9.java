/*
   9. Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Character : ");
        char ch = sc.next().charAt(0);

        int a = ch;
        if(a>=65 && a<=90)
            System.out.println("Given Character is UPPERCASE");
        else
            System.out.println("Given Character is LOWERCASE");    
        
    }

}