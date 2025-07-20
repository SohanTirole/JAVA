/*
5. WAP to exchange value of two variable without using third variable and arithmetic operator
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the Value of A & B");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Befor Swapping the Value of A & B");
        System.out.println("A : "+a+"\n B : "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swapping the Value of A & B");
        System.out.println("A : "+a+"\n B : "+b);
        
    }

}