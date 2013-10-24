public class PrimeGenerator implements Generator<Integer> {
	private int currentPrime = 1;

	public Integer next() {
	    int returnPrime = currentPrime;
	    if ( currentPrime == 1 )
	        currentPrime = 2;
	    else if ( currentPrime == 2 )
	        currentPrime = 3;
	    else
	        do {
	            currentPrime += 2;
            } while ( ! isPrime(currentPrime) );
	    return returnPrime;
	}
	
	private boolean isPrime(int n) {
	    for ( int f = 2; f <= (int)Math.sqrt(n); f++ )
	        if ( n % f == 0 )
	            return false;
	    return true;
    }
}
