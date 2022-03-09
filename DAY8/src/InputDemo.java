import java.util.Scanner;
public class InputDemo {
	
	public static void main (String [] args) {
		System.out.println("Enter your mobile number");
		Scanner s=new Scanner (System.in);
		float x;
		x=s.nextInt();
		System.out.println("Entered number is"+x);
		
	}
}