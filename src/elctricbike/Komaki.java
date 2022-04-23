package elctricbike;

import bike.Duke;

 public  class Komaki  extends Duke
 {
	
	protected  void threeWheel()
	{
		System.out.println("good electric bike");
	}


 public static void main (String[] args)
{
	Komaki m = new Komaki();
	m.fourWheel();
	m.twoWheel();
	m.oneWheel();
	m.threeWheel();
}
}