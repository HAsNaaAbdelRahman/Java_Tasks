import java.util.Scanner;
public class Rectangle {
	
private double height ;
private double  length ;

public Rectangle() {
	height = 0.0;
	length = 0.0;
}
public double  getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public double  getLength() {
	return length;
}
public void setLength(double  length) {
	this.length = length;
}
public double area(double  h , double  l) {
	return 0.5 * h * l ;
}
public double permiter(double h , double l) {
	return 2*(h + l);
}
public String toString() {
	return "Rectangle [height=" + height + ", length=" + length + "]";
}







	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int h , l ;
       System.out.println("Please enter the height of rectangle : ");
       h = in.nextInt();
       System.out.println("Please enter the length of rectangle : ");
       l = in.nextInt();
       
      Rectangle c1 = new Rectangle();
      c1.setHeight(h);
      c1.setLength(l);
      System.out.println(c1.toString());
      System.out.println("Area " +c1.area(h, l));
      System.out.println("perimer "+c1.permiter(h, l));

   }


}
