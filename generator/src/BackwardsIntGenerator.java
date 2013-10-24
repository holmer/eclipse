
public class BackwardsIntGenerator implements Generator<Integer> {
	private int currentValue;
	private int decrement;
	
	public BackwardsIntGenerator( int startValue, int decrement ) {
		currentValue = startValue;
		this.decrement = decrement;
	}

	public Integer next() {
	    int v = currentValue;
	    currentValue -= decrement; 
	    return v;
	}
}
