/*
12. Check given character is vowel or not using switch case 
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Character : ");
        char ch = sc.next().charAt(0);

        if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            System.out.println(ch+" is Vowel");
        else
            System.out.println(ch+" is not a Vowel");
    }

}