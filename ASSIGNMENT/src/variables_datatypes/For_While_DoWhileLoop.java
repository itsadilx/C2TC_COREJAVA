package variables_datatypes;

public class For_While_DoWhileLoop {

		public static void main(String[] args) 
		{
		 // for loop
		 for(int i=1,j=1; i<10||j<10;i++,j++)
		 { 
		 j++;
		 System.out.println("i="+i+" and j="+j); 
		 }
		 // while loop 
		 int i=1,j=1;
		 while(i<10 || j<10)
		 { 
		 i++; j++;
		 System.out.println("i="+i+" and j="+j); 
		 }
		// Do while loop
		int g = 1, h = 1;
		do {
		g++;
		h++;
		System.out.println("g=" + g + " and h=" + h);
		 } while (g < 10 || h < 10);
		}
		}