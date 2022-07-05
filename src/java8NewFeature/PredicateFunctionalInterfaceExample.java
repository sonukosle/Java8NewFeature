package java8NewFeature;

import java.util.function.Predicate;

public class PredicateFunctionalInterfaceExample {



    public static void main(String[] args) {
        Predicate<String> checkLength= s-> s.length()>=5;
        System.out.println("the String length is greater then or equals to : "+"checkLength : "+checkLength.test("Code"));
    }
}
