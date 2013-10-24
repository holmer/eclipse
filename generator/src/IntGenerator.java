
public class IntGenerator implements Generator<Integer> {
	private int currentValue;
	private int increment;
	
	public IntGenerator( int startValue, int increment ) {
		currentValue = startValue;
		this.increment = increment;
	}

	public Integer next() {
	    int v = currentValue;
	    currentValue += increment; 
	    return v;
	}
}
