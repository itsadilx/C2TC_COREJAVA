/*write a program in java to make such a pattern like right angle triangle with a number which will repeat a number in a row
  the pattern as follows :
1 
22 
333 
4444 */
package assignment2;
import java.util.Scanner;
public class Question6 {


	  public static void main(String[] args)

				{
	   	          int i,j,n;

	               System.out.print("Input number of n : ");
	            	Scanner in = new Scanner(System.in);
			    n = in.nextInt();
	  
	               for(i=1;i<=n;i++)
	               {
		           for(j=1;j<=i;j++)
		            System.out.print(i);
		          System.out.println("");
	              }
	            }
	            } 
				
