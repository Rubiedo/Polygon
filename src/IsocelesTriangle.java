public class IsocelesTriangle implements Polygon {
	
	public double base;
	public double height;
	
	
	
	public IsocelesTriangle(double b, double h) {
        this.base = b;
        this.height = h;
    }

	
	@Override
	public double getPerimeter() {
		
		return 2*(Math.sqrt((1/2)*(this.base*this.base) + (this.height*this.height))) + this.base;
	}

	@Override
	public double getArea() {

		return (.5)*(this.base)*(this.height);
	}


	
}