public class GeometricGenerator implements Generator<Double> {
	private double currentValue;
	private double factor;
	
	public GeometricGenerator( double startValue, double factor ) {
		currentValue = startValue;
		this.factor = factor;
	}

	public Double next() {
	    double v = currentValue;
	    currentValue *= factor; 
	    return v;
	}
}