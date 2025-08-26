class Test
{
    public static void main(String args[])
    {
        //  Y
        int l = 5;
        for(int i=1; i<=5 ; i++)
        {
            for(int j=1 ; j<=5 ; j++)
            {
                if(i==j&&j<4||j==l)
                    System.out.print("*");
                else
                    System.out.print(" ");
               
            }
            l--;
            System.out.println();
        }
    }
}