//7. WAP to search an element in array using binary search.
import java.util.Scanner;
class Test
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please let us know the length of the Array");
        int n = sc.nextInt();
        int i;
        int arr[] = new int[n];
        for(i=0 ; i<arr.length ; i++)
        {
            System.out.println("Please enter the "+(i+1)+" element..");
            arr[i] = sc.nextInt();
        }

        //BUBBLE SORT
        for(int j=0 ; j<arr.length ; j++)
        {   
            int flag = 0;
            for(i=0; i<(arr.length-1) ; i++)
            {
                int a;
                if(arr[i]>arr[i+1])
                {
                    a = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = a;
                    flag =1;
                }
            }
            if(flag==0)
                break;
        }
        System.out.println();
        System.out.println("Sorted Array : ");
        for(i=0 ; i<arr.length ; i++)
        {
            System.out.println(arr[i]);
        }

        System.out.println();
        //BINARY SEARCHING
        int mi, li, hi, item;
        System.out.println("Please Enter the number which you want to find out in the Array..");
        item = sc.nextInt();
        li = 0;
        hi = (arr.length);
        hi = hi-1;
        mi = (li+hi)/2;
        for(i=0 ; i<arr.length ; i++)
        {
            if(arr[i]==item)
            {
                while(li<=hi)
                {
                    if(arr[mi]==item)
                    {
                        System.out.println("Item at "+mi+" Position");
                        break;
                    }
                    else if(item > arr[mi])
                    {
                        li = mi + 1;
                    }else if(item < arr[mi])
                    {
                        hi = mi - 1;
                    }
                    mi = (li + hi)/2;
                }

            }
            else if(arr[arr.length-1]!=item&&i==arr.length-1&&arr[mi]!=item)
                System.out.println("Enter element not found in Array");
        }
    }
}