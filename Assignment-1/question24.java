/*
24. How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall?
*/
class Test 
{
	public static void main(String args[])
	{
		float VBrick, VWall;
		
		VBrick =(float) (25*10*(7.5));
		VWall =(float)( (20*100)*(2*100)*(0.75*100));
		
		float TNB = VWall/VBrick;
		float COB = (TNB/1000)*(900);
		
		System.out.println("Total nuber of Brick Required : "+TNB+"\n Cost of Total Brick : "+COB+" $");
		
	}
}