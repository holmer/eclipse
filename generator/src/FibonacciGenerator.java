public class FibonacciGenerator implements Generator<Integer> {
	private int lastFib = 0;
	private int currentFib = 1;

	public Integer next() {
	    int nextFib = lastFib + currentFib;
	    lastFib = currentFib;
	    int returnFib = currentFib;
	    currentFib = nextFib;
	    return returnFib;
	}
}
