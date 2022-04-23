package bmw;

import benz.AstaMartin;
import benz.ToYota;

public class MarutiSuzuki extends ToYota
{
	
	public void bigCar() 
	{
		System.out.println(" its a new car");
		
	} 
	public static void main(String[] args) 
	{

		MarutiSuzuki m = new MarutiSuzuki();
		m.newCar();
		m.oldCar();
		m.bigCar();
}
}