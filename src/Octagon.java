
public class Octagon implements Polygon {
	
	public double length;
	
	public Octagon(double l) {
        this.length = l;
    }

	
	@Override
	public double getPerimeter() {
		return 8*(this.length);
	}

	@Override
	public double getArea() {
		return (this.length*this.length) + (2*Math.sqrt(2));
	}


	
}