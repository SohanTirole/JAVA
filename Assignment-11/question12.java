//12) Program to convert uppercase to lowercase 
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);

        if(ch>=65&&ch<=90)
            System.out.println((char)(ch+32));
        else
            System.out.println("Invalid Input");
    }
}