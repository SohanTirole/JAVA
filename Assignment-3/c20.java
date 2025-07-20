/*
20. W.A.P to check whether a charachter is an alphabet or not.
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        char charachter;
        System.out.println("Enter any Character");
        charachter = sc.next().charAt(0);

        if(((charachter>='a')&&(charachter<='z'))||((charachter=>'A')&&(charachter<='Z')))
            System.out.println("Entered Character is Alphabet..");
        else
            System.out.println("Entered Character is not a Alphabet..");
    }
}