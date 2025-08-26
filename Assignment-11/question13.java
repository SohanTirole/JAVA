//13) Program to convert lowercase to uppercase   
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char ch = sc.next().charAt(0);

        if(ch>=97&&ch<=122)
            System.out.println((char)(ch-32));
        else
            System.out.println("Invalid Input");
    }
}