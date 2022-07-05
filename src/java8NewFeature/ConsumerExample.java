package java8NewFeature;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<Integer> doubleMe = (i) -> System.out.println("After double " + 2 * i);
        doubleMe.accept(5);

        Consumer<Integer> squareMe = (i) -> System.out.println("After square " + i * i);
        squareMe.accept(5);

        squareMe.andThen(doubleMe).accept(12);
    }
}
