/*
14.Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		 D

*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        float percantage;
        System.out.println("Enter the Percentage..");
        percantage = sc.nextFloat();
        if(percantage<=100)
        {
            if(percantage<60)
                System.out.println("Grade : D");
            else if( percantage>=60 && percantage<=80 )
                System.out.println("Grade : C");
            else if( percantage>80 && percantage<=90 )
                System.out.println("Grade : B");
            else if(percantage>90)
                System.out.println("Grade : A");
        }
        else
            System.out.print("Invalid Input");
    }

}