import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0 , b = 0;	
		while(true) {
			System.out.println("Please Enter two integer numbers : ");

		try {
			a = in.nextInt();
			b = in.nextInt();
			int sum = a + b ;
			System.out.println("Sum = " + sum);
			break;
		}catch(InputMismatchException e) {
			System.out.println("Please Enter  Integers only : ");
			in.nextLine();
		}
	
		}
     }



}