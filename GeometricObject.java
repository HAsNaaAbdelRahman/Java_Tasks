
public abstract class GeometricObject {
	double r1 ;
	double r2 ;
	double r3 ;
	 String color ;
	
	public abstract double displayArea() ;
	public abstract double perimeter() ;
	public abstract boolean isValid();

	public GeometricObject() {}
	
	
	public GeometricObject(double r1, double r2, double r3, String color) {
		this.r1 = r1;
		this.r2 = r2;
		this.r3 = r3;
		this.color = color;
	}
	public double getR1() {
		return r1;
	}

	public void setR1(double r1) {
		this.r1 = r1;
	}

	public double getR2() {
		return r2;
	}

	public void setR2(double r2) {
		this.r2 = r2;
	}

	public double getR3() {
		return r3;
	}

	public void setR3(double r3) {
		this.r3 = r3;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}