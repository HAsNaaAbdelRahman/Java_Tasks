
import java.util.Scanner;

public class Employee {
	int number ;
	float salary ;
	public Employee(){
		number = 0 ;
		salary = 0.0f;
	}
	public Employee(int number, float salary) {
		this.number = number;
		this.salary = salary;
	}
	
	public Employee(int number) {
		this.number = number;
	}
          public Employee(float salary) {
		this.salary = salary;
	}

	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
    public void display() {
    	System.out.println(number + " " +salary);
    }
	




	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int x;                               
		float y ;
         System.out.println("Please enter the employee number && salary :");
	
		x = in.nextInt();                
		y = in.nextFloat();
		System.out.println("The employee number " + x );
		System.out.println("The salary " + y );
		
		
        

	}

}

