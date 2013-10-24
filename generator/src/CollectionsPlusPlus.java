import java.util.List;
import java.util.LinkedList;

public class CollectionsPlusPlus {

    public static <T> List<T> generate(Generator<T> generator, int n) {
        LinkedList<T> l = new LinkedList<T>();
        
        for ( int i = 0; i < n; i++ ) {
            T e = generator.next();
            l.addLast(e);
        }
            
        return l;
    }
    
    public static <T> List<T> generateReverse(Generator<T> generator, int n) {
        LinkedList<T> l = new LinkedList<T>();
        
        for ( int i = 0; i < n; i++ ) {
            T e = generator.next();
            l.addFirst(e);
        }
            
        return l;
    }
}
