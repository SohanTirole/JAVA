/*
9. WAP to check wheater number is positive or negative
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n = sc.nextInt();

        if(n>0)
            System.out.println(n+" is Positive Value");
        else
            System.out.println(n+" is Negetive Value");
    }

}