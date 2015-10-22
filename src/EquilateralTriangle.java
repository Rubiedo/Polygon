
public class EquilateralTriangle implements Polygon {
	
	public double base;
	
	
	public EquilateralTriangle(double b) {
        this.base = b;
    }

	
	@Override
	public double getPerimeter() {
		
		return 3*this.base;
	}

	@Override
	public double getArea() {

		return (Math.sqrt(3)/4)*(this.base)*(this.base);
	}


	
}