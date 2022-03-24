package multithreading;

class MSExcel implements Runnable
{
	public void run()
	{
		System.out.println("MSExcel id "+Thread.currentThread().getId());
	}
}
class Twitter implements Runnable
{
	public void run()
	{
		System.out.println("Twitter id "+Thread.currentThread().getId());
	}
	
}
class Facebook implements Runnable
{
	public void run()
	{
		System.out.println("Facebook id "+Thread.currentThread().getId());
	}
	
}
public class RunnableExample {
	public static void main(String[] args)
	{
		
    MSExcel ob=new MSExcel ();
    Thread t=new Thread (ob);
    t.start ();
    
    Twitter ob1=new Twitter ();
    Thread t1=new Thread (ob1);
    t1.start();
    
    Facebook ob2=new Facebook ();
    Thread t2=new Thread (ob2);
    t2.start();
	}

}
