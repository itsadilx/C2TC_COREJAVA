//write a java method to find the smallest number among three number using scanner class
package assignment2;
import java.util.Scanner;  
public class Question2 
{
	 
	 public static void main(String[] args)
	    {
		 
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Enter the number of elements in an array:");
		 int min;
		 int n=scan.nextInt();
		
		 int arr[]=new int[n]; 
		 
		 for(int i=0; i<n; i++){
		    System.out.print("Enter the element "+(i+1)+": ");
		    arr[i]=scan.nextInt();
		    }
		    min=arr[0];
		    for(int i=0; i<n; i++){
		      if(min>arr[i]){
		      min=arr[i];
		    }
		    }
		    System.out.print("\nThe smallest value is: "+min);
		 }
		 }
