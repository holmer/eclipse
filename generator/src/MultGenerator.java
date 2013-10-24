public class MultGenerator implements Generator<Integer> {
	private int currentValue;
	private int increment;
	
	public MultGenerator( int startValue, int increment ) {
		currentValue = startValue;
		this.increment = increment;
	}

	public Integer next() {
	    int returnValue = currentValue;
	    currentValue += increment; 
	    increment++;
	    return returnValue;
	}
}