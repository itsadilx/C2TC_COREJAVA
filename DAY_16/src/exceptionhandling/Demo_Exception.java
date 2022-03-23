package exceptionhandling;

public class Demo_Exception {
	public static void main (String []args) throws Exception
		{
			/*int num =50/2;
			System.out.println(num);
			
			int num1 =50/10;
			System.out.println(num1);*/
			
			
			int arr[]=new int [4];
			try
			{
			int[] arr1= new int[9];
			  arr1[5]=20/0;
			  
		//	System.out.println(num);
			}
			catch (Exception ex)
			{
				System.out.println(ex);	
			}
			finally 
			{
				System.out.println("whatever u write here is excuted");
			}
			int num3 =50/25;
			System.out.println(num3);
		}
	}


