package java8NewFeature;

import java.util.function.Function;

public class FunctionalInterface {

    public static void main(String[] args) {

        Function<Integer,Integer> squreme= i->i*i;
        System.out.println(squreme.apply(7));
    }
}
