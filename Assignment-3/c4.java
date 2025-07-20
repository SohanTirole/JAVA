/*
4. WAP to exchange value to two variable with third variable and without third variable

   // Bitwise ^ operator
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int A,B,C,Oa,Ob;
        System.out.println("Enter the Value of A and B : ");
        A = sc.nextInt();
        B = sc.nextInt();
        Oa = A;
        Ob = B;

        System.out.println("Before Exchange Value of A & B ");
        System.out.println("A : "+A);
        System.out.println("B : "+B);

        System.out.println("After Exchange the Value of A & B");
        System.out.println("With Using 3 Variable---");
        C = A;
        A = B;
        B = C;
        System.out.println("A : "+A);
        System.out.println("B : "+B);

        System.out.println("Without usign third Variable---");
        Oa = Oa+Ob;
        Ob = Oa-Ob;
        Oa = Oa-Ob;
        System.out.println("A : "+Oa);
        System.out.println("B : "+Ob);


    }

}