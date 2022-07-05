package java8NewFeature;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicateAndBiFunctionDemo {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a + b >= 5;
        System.out.println("BiPredicate Sum of 2 and 5 is greater than 5  : " + biPredicate.test(2, 5));
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b;
        System.out.println("Using BiConsumer Multiplication of 5 and 10 is : " + biFunction.apply(5, 10));
        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println("using BiConsumer : " + a * b);
        biConsumer.accept(5, 8);
    }
}
