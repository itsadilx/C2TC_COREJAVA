package throwexample;

public class DemoThrow 
{
void validate (int age)
{
	try {
		if (age<18)
			throw new ArithmeticException ("Not eligible");
			else 
				System.out.println ("Eligible");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	public static void main(String[] args)
	{
		DemoThrow dt=new DemoThrow();
		
		    dt.validate (11);
		System.out.println("welcome to c2tc");

	}

}
