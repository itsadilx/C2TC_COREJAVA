abstract class Mumbai_Rules 
{
	abstract void speedLimit();
	abstract void rashDriving();
}

public class Seltos extends Mumbai_Rules 
{
	void speedLimit()
	{
		System.out.println("The Limit is 80");
	}
     void rashDriving ()
     {
    	 System.out.println("Alert voice");
     }
     
	public static void main(String[] args) {
		
		Seltos s=new Seltos ();
		s.speedLimit();
		s.rashDriving();
		

	}

}
