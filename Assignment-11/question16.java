//16) Program to check whether entered character is in lowercase or not using conditional operator 
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character..");
        char ch = sc.next().charAt(0);
        String res = ch>=97&&ch<=122 ? "Lower Case Character" : "Not a Lower Case Character";

        System.out.println(res);
    }
}