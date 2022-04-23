package oldbike;

import elctricbike.Komaki;

public class HeroHonda extends Komaki
{
	
	protected  void fiveWheel()
	{
		System.out.println("good hero bike");
	}


 public static void main (String[] args)
{
	HeroHonda x = new HeroHonda();
	x.fourWheel();
	x.twoWheel();
	x.oneWheel();
	x.threeWheel();
	x.fiveWheel();
}
}
