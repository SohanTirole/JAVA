/*
6) Addition of two Matrix
*/

import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Order of first Matrix");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int arr[][] = new int[m][n];
        System.out.println();
        System.out.println("Enter the Order of Second Matrix");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr1[][] = new int[x][y];
        System.out.println();

        //Getting user input form user for First Matrix
        System.out.println("Enter the elemts of First Metrix");
        for(int r=0 ; r<m ; r++)
        {  
            System.out.println("Enter the "+n+" element in "+(r+1)+" row");
            for(int c=0 ; c<n ; c++)
            {
                arr[r][c] = sc.nextInt();
            }
        }
        System.out.println();

        //Getting user input form user for Second Matrix
        System.out.println("Enter the elemts of Second Metrix");
        for(int r=0 ; r<x ; r++)
        {  
            System.out.println("Enter the "+n+" element in "+(r+1)+" row");
            for(int c=0 ; c<y ; c++)
            {
                arr1[r][c] = sc.nextInt();
            }
        }
        System.out.println();

        //Display the first 2D Array 
        System.out.println("First Matrix..");
        for(int r=0 ; r<m ; r++)
        {
            for(int c=0 ; c<n ; c++)
            {
                System.out.print(" "+arr[r][c]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Second Matrix..");
        //Display the Second 2D Array 
        for(int r=0 ; r<x ; r++)
        {
            for(int c=0 ; c<y ; c++)
            {
                System.out.print(" "+arr1[r][c]);
            }
            System.out.println();
        }



        System.out.println();
        System.out.println("Addition of Two Matrix..");
        for(int r=0 ; r<m ; r++)
        {
            for(int c=0 ; c<n ; c++)
            {
                 
                    System.out.print(" "+(arr[r][c]+arr1[r][c]));
            }
            System.out.println();
        }
         
    }
}