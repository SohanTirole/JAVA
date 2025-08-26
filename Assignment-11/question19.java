//19) Program to check whether entered character is in lowercase or not using conditional operator and if yes, then convert it into uppercase
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character..");
        char ch = sc.next().charAt(0);

        String res = ch>=97&&ch<=122 ?  "yes" : "Invalid Input" ;

        if(res=="yes")
            System.out.println((char)(ch-32));
        else
            System.out.println(res);
    }
}