
public class Triangle extends GeometricObject {

	@Override
	public double displayArea() {
		
		return r1*r2*0.5;
	}

	@Override
	public double perimeter() {
	
		return r1 + r2 + r3;
	}

	@Override
	public boolean isValid() {
		if((r1*r1) == (r2 *r2)  + (r3 * r3) ) return true ;
		else return false;
	}

}
