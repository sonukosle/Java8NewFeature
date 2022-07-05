package java8NewFeature.Stream;

import java.util.stream.Stream;

public class OfMethodDemo {

    public static void main(String[] args) {
        Stream.of(1, 11, 111, 1111, 11111).forEach(i -> System.out.println(i));

        String[] element = {"rohit", "Vikash", "Vikky", "sonam", "Catreena caf"};
        Stream.of(element).filter(s -> s.equals("sonam")).forEach(i -> System.out.println(i));
        Stream.of(element).map(i -> i.toUpperCase()).forEach(i -> System.out.println(i));

        Integer[] data = {12, 16, 18, 20};
        Stream.of(data).sorted().forEach(i -> System.out.println(i));
        System.out.println("filtering data");
//        Stream.of(data).filter(i->i<20).forEach(i-> System.out.println(i));
        Integer integer = Stream.of(data).min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(integer);

    }
}
