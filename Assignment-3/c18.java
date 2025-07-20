/*
18. W.A.P to check whether given number is even or odd Without using % operator. 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number..");
        int n = sc.nextInt();

        if((n&1)==0)
            System.out.println(n+" is Even");
        else
            System.out.println(n+" is Odd");
    }
}