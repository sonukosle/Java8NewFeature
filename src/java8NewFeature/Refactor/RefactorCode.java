package java8NewFeature.Refactor;

import java.util.stream.IntStream;

public class RefactorCode {
    public static void main(String[] args) {
        System.out.println("Finding prime Number using java8");
        System.out.println(isPrime(5));
    }

    public static Boolean isPrime(int number) {

        boolean isDivisible = false;
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0) {
//
//                isDivisible = true;
//                break;
//            }
//        }
//        return number > 1 && !isDivisible;
        return number > 1 && IntStream.range(2, number).noneMatch(n -> number % n == 0);
    }
}
