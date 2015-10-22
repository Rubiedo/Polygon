
public class Hexagon implements Polygon {
	
	public double length;
	
	public Hexagon(double l) {
        this.length = l;
    }

	
	@Override
	public double getPerimeter() {
		return 6*(this.length);
	}

	@Override
	public double getArea() {
		return ((3*Math.sqrt(3))/2)*(this.length*this.length);
	}


	
}