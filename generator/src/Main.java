// Purpose: to test the various generator classes
// Author: UH
// Last update: 2013-10-24

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] arg) {
        List<Integer> numbers = 
            CollectionsPlusPlus.generate(
                new IntGenerator(0,1),
                10000);
        for ( int i = 1; i <= 1000; i++ ) {
            Collections.shuffle(numbers);
            Collections.sort(numbers);
            System.out.println("sort " + i + " finished");
        }
        
        numbers =  CollectionsPlusPlus.generate(new MultGenerator(0,1),100);
        for ( int i : numbers )
            System.out.println( i );
        
        numbers = CollectionsPlusPlus.generate(new FibonacciGenerator(),25);
        for ( int i : numbers )
            System.out.println( i ); // A new comment
            
        numbers = CollectionsPlusPlus.generate(new PrimeGenerator(),25);
        for ( int i : numbers )
            System.out.println( i );
        
        numbers = CollectionsPlusPlus.generate(new BackwardsIntGenerator(0,2),10);
        for ( int i : numbers )
            System.out.println( i );
            
        List<Double> doubles =
            CollectionsPlusPlus.generate(new GeometricGenerator(1000,1.1),25);
        for ( double d : doubles )
            System.out.println( d );
    }
}
