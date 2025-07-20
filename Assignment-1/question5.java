/*
5. If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
*/
class Test 
{
	public static void main(String args[])
	{
		float P, TotalCost, Rate, L, B, A;
		TotalCost=1600;
		Rate = 25;
		L = 20;
		//Formula : Perimeter= Total Coast / Rate per meter
		P = TotalCost/Rate;
		System.out.println("Perimeter of the Park : "+P+" m");

		//Formula Perimeter = 2(Length + Breadth)-->Breadth = Perimeter / 2 - Length
		B = P/2-L;
		System.out.println("Breadth of the Park : "+B+" m");

		//Formula : Area = length * Breadth 
		A = L*B;
		System.out.println("Area of the Land : "+A+" m^2");

		
	}
}
