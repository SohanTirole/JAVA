/*
24. Write a Java program to count total number of notes
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amout");
        int Amount = sc.nextInt();
        System.out.println("Enter the Size of note");
        int size = sc.nextInt();

        float TNOnotes = Amount/size;
        System.out.println("Total Note's Count is : "+TNOnotes);
    }
}