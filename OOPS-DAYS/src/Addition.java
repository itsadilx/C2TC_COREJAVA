
public class Addition {

	public void add(int x, int y)
	{
		System.out.println ("Add is"+ (x+y));
	}
	
	 public void add(int x, int y,int z)
	{
		System.out.println ("Add is"+ (x+y+z));
	}
	
	 public void add(int x, int y,int z,int q)
		{
			System.out.println ("Add is"+ (x+y+z+q));
		}
	 public static void main (String[] args ) 
	 {
	 
	 Addition ob=new Addition ();
	 ob.add (3, 6);
	 ob.add (3, 6,5);
	 ob.add (3, 6,5,7);
	 }}
