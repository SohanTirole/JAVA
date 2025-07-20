/*
33. A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways that run perpendicular from its sides. One pathway has a width of 3 m and the other, 4 m. Calculate the total usable area of the garden.

*/
import java.util.Scanner;
class Test 
{
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		float AreaG, L, W, UAreaG, AHP, AVP, PTA, Hp, Vp;

        System.out.println("Enter the Dimensions of the Rectangular Garden");
        L = sc.nextFloat();
        W = sc.nextFloat();

        System.out.println("Enter the Width of Pathway : ");
        Hp = sc.nextFloat();
        Vp=sc.nextFloat();
        
		AHP = L*Hp;
		AVP = W*Vp;
		
		AreaG = L*W;
		PTA = Hp+Vp-(Hp*Vp);
		UAreaG = AreaG-PTA;
		
		System.out.println("Usable Area of Garden is : "+UAreaG+" m^2");
	}
}