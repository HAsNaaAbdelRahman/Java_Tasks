import java.util.Scanner;
import static java.lang.Math.*;

public class Main {


	public static void main(String[] args) {
		
      System.out.println("Enter three sides of triangle : ");
      Scanner in = new Scanner(System.in);	
      
      double a = 0.0, b = 0.0, c = 0.0;
      
      
      a = in.nextDouble();
      b = in.nextDouble();
      c = in.nextDouble();

      
      
      Triangle r1 = new Triangle();
      r1.setColor("Red");
      r1.setR1(c);
      r1.setR2(b);
      r1.setR3(a);
      System.out.println(r1.displayArea());
      System.out.println(r1.perimeter());
      System.out.println(r1.isValid());

		
	
	}

}
