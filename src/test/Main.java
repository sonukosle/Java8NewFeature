package test;

import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        BiConsumer<Integer, Integer> biConsumer = (a, b) -> System.out.println(a * b);
        biConsumer.accept(10, 20);

//        method reference

//        FunctionalInterfaceDemo f = () -> System.out.println("method reference demo sam");
//        f.singleAbsMethod();

        FunctionalInterfaceDemo f=Test::testImplimentation;
        f.singleAbsMethod();
    }


    class Test{

        public static void testImplimentation(){

            System.out.println("Test implementation Sam");
        }

    }
}
