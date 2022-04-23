package bike;

public class Duke extends Dio
{
	  private void twoWheel()
	{
		System.out.println("good bike");
	}
	
	public static void main (String[] args)
	{
		Duke k = new Duke();
		k.fourWheel();
		k.twoWheel();
	}

}
