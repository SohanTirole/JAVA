//18) Program to check whether entered character is in uppercase or not using conditional operator and if yes, then convert it into lowercase
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character..");
        char ch = sc.next().charAt(0);
        String res = ch>=65&&ch<=90 ? "true" : "false";
        if(res=="true")
        {
            ch = (char)(ch+32);
            System.out.println(ch);
        }
        else
            System.out.println("Not a Upper Case Character");
    }
}