import java.util.Comparator;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5,6,7,8,9};
        Stream<Integer> stream = Stream.of(array);
        Stream.of(array).filter(x->x%2==0).map(x->x*x)
                .max(Comparator.comparing(x->x)).stream().toList().forEach(System.out::println);
    }
}