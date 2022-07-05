package java8NewFeature;

import java.util.function.Function;

public class FunctionChaining {

    public static void main(String[] args) {
        Function<Integer, Integer> doubleIt = i -> 2 * i;
        System.out.println("from doubleIt : " + doubleIt.apply(2));

        Function<Integer, Integer> cubeMe = i -> i * i * i;

        System.out.println("After doing cubeIt : " + cubeMe.apply(2));
        System.out.println("joining first doubling using apply andThen method " + doubleIt.andThen(cubeMe).apply(2));

        System.out.println("Joining first cubing using compose " + doubleIt.compose(cubeMe).apply(2));

    }
}
