package jaguar;

public class Numbers {
	
	static String p = " karhti";
	
	public int empId()
	{
		int id = 255;
		return id;
	}
			
	public static String  empName()
	{
		 String a =" jackie";
		 String fullName = a + p;
		 
		 return fullName;
	}
	
		public static void main (String[] args)
		{
			
			Numbers s = new Numbers();
			int i = s.empId();
			k
			System.out.println(" emp id: "+i);
			
			String empName = empName();
			System.out.println(empName);
			
		}
}
