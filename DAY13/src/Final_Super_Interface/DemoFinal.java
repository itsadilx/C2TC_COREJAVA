package Final_Super_Interface;
class Demo
{
	String color="red";
	void display ()
	{
		System.out.println("hello m12");	
	}
}
public class DemoFinal extends Demo
{
       void display ()
       {
    	   System.out.println("hello");
    	   System.out.println(super.color);
       }
       final int studid=123;
       
	public static void main(String[] args)
	{
	 DemoFinal df=new DemoFinal();
	 df.display ();

	}

}
