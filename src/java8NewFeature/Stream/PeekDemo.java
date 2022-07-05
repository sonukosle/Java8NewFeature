package java8NewFeature.Stream;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;

public class PeekDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 4, 5, 8, 10);

        list.stream().filter(e -> e % 2 == 0).peek(System.out::println).map(a -> a + a).filter(a -> a >= 5).count();
    }
}
