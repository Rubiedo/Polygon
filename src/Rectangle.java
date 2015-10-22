
public class Rectangle implements Polygon {
	
	public double length;
	public double width;
	
	public Rectangle(double l, double w) {
        this.length = l;
        this.width = w;
    }

	
	@Override
	public double getPerimeter() {
		return 2*(this.length) + 2*(this.width);
	}

	@Override
	public double getArea() {
		return this.length*this.width;
	}


	
}