
public class Pentagon implements Polygon {
	
	public double length;
	
	public Pentagon(double l) {
        this.length = l;
    }

	
	@Override
	public double getPerimeter() {
		return 5*(this.length);
	}

	@Override
	public double getArea() {
		return 1.72*(this.length*this.length);
	}


	
}