/*
29. Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two Number : ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.print("Please Enter your Choice.. from +,>,== ");
        String sign = sc.next();

        switch(sign)
        {
            case "+": 
                    int sum = A+B;
                    System.out.println("Sum of A + B = "+sum);
                    break;
            case ">" :
                    if(A > B){
                        System.out.println(A+" is greatest");
                        }
                    else{
                        System.out.println(B+" is greatest");
                    }
                    break;
            case "==" : 
                    if(A == B){
                        System.out.println("A and B are equal");
                        }
                    else{
                        System.out.println("A and B are not equal");
                    }
                    break;
            default : System.out.println("Given Sign is Invalid");
        }
    }

}