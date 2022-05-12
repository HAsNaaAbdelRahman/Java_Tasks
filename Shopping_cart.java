import java.util.Scanner;
public class Shopping_cart {
	String name ;
	float price ;
	int quntity ;
	Scanner in = new Scanner(System.in);

	public Shopping_cart() {
		name = null ;
		price = 41.0f;
		quntity = 0 ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuntity() {
		return quntity;
	}
	public void setQuntity(int quntity) {
		this.quntity = quntity;
	}
	public Shopping_cart(String name, float price, int quntity) {
		this.name = name;
		this.price = price;
		this.quntity = quntity;
	}
	public void add1()
	{
		name= in.nextLine();
		quntity= in.nextInt();
	}
	public void Display() {
		System.out.println("Name : " + name +" "+"Price : " +price + " " + "Qauntity : " + quntity );
	}



public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Shopping_cart [] arr = new Shopping_cart[1];// any size
      for(int i = 0 ; i < arr.length ; i++) {
    	  arr[i] = new Shopping_cart();
    	  
      }
  	for(int i=1;i<=arr.length;i++)
	{
		System.out.println("Enter The  number :"+i);
		System.out.println(" And Qauntity : " );
		arr[i-1].add1();
		
	}
	for(int i=1;i<=arr.length;i++)
	{ 
		arr[i-1].Display();
	}
	}
}