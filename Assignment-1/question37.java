/*
37. The surface of the cylinder is 149 cm². The cylinder height is 6 cm. What is the diameter of this cylinder?
*/
class Test
{
	public static void main(String args[])
	{
		float SurfaceArea, height, Diameter;
        //A=2πr^2+2πrh
		SurfaceArea = 149;
        height = 6; 
        float a = 2;
        float b = 12;
        float c = -149;
    
        double Radius = (Math.sqrt((b*b-4*a*c)/Math.PI)/4.0f)-3;
        System.out.println("Radius of Cylinder : "+Radius);
	}	

}