public class Square implements Polygon {
	
	public double length;
	
	public Square(double l) {
        this.length = l;
    }

	
	@Override
	public double getPerimeter() {
		return 4*this.length;
	}

	@Override
	public double getArea() {
		return this.length*this.length;
	}


	
}