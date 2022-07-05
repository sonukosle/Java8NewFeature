package java8NewFeature.Stream;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 3, 5);

        System.out.println("Using reduce method");

//        int sum=0;
//        for (int i=1;i<=5;i++){
//
//            sum+=i;
//        }
//        System.out.println(sum);

//        we use reduce method when we want to sum of number of elements
        Integer integer = list.stream().reduce((a, b) -> a + b).get();
        System.out.println(integer);

    }
}
