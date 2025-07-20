/*
15. Write a java program to accept the cost price of a bike
    and display the road tax to be paid according to the 
    following criteria.
    Cost Price(In Rs)		Tax
     > 100000			 15%
     >50000 and <=100000	 10%
     <=50000			 5%			  
*/
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price of Bike..");
        float Cost = sc.nextFloat();

        if(Cost>100000)
            System.out.println("On "+Cost+" Cost you have to pay 15% Tax : "+((Cost*15)/100));
        else if(Cost>50000 && Cost<=100000)
            System.out.println("On "+Cost+" Cost you have to pay 10% Tax : "+((Cost*10)/100));
        else if(Cost<=50000)
            System.out.println("On "+Cost+" Cost you have to pay 5% Tax : "+((Cost*5)/100));
    }

}