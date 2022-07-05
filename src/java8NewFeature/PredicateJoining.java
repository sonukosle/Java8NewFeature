package java8NewFeature;

import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args) {
        Predicate<String> checkLength = s -> s.length() >= 4;
        System.out.println(" String Length is greater than or equal to 5 :" + checkLength.test("Sunny"));
        Predicate<String> checkEvenLength = s -> s.length() % 2 == 0;
        System.out.println("String length is Even : " + checkEvenLength.test("Sunny"));

//        it can be joining with end
        System.out.println("After joining with end output : " + checkLength.and(checkEvenLength).test("JavaT"));
//        boolean javaT = checkLength.test("JavaT");
//        String s2="JavaT";
//        System.out.println(s2.length());

//        it can be joining with or
        System.out.println("After joining with or output : " + checkLength.or(checkEvenLength).test("JavaT"));

        //        it can be joining with negate
        System.out.println("After joining with negate : "+checkLength.negate().test("JavaT"));
    }
}
