/*
1) Calculate the sum of all even elemet and all odd element
1   2   3
4   5   6   
7   8   9*/

import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        //Getting user input form user
        for(int r=0 ; r<m ; r++)
        {  
            System.out.println("Enter the "+n+" element in "+r);
            for(int c=0 ; c<n ; c++)
            {
                arr[r][c] = sc.nextInt();
            }
        }
        System.out.println();
        //Display the 2D Array 
        for(int r=0 ; r<m ; r++)
        {
            for(int c=0 ; c<n ; c++)
            {
                System.out.print(" "+arr[r][c]);
            }
            System.out.println();
        }
        int sumEven =0;
        int sumOdd =0;
        for(int row[] : arr)
        {
            for(int element : row)
            {
                if(element%2==0)
                    sumEven = sumEven + element;
                else
                    sumOdd = sumOdd + element;
            }
        }
        System.out.println();
        System.out.println("Sum of all even Number : "+sumEven);System.out.println("Sum of all Odd : "+sumOdd);
    }
}