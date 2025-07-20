/*
6. WAP to find greater among two number 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter any two number : ");
        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b)
            System.out.println(a+" is the Greatest ");
        else
            System.out.println(b+" is the Greatest ");
        
    }

}