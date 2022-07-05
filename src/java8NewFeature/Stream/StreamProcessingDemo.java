package java8NewFeature.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamProcessingDemo {
    public static void main(String[] args) {

        List<Integer> list= new ArrayList<>();

        list.add(23);
        list.add(20);
        list.add(33);
        list.add(10);

//        long count = list.stream().count();
//        System.out.println(count);
//        list.stream().filter(i->i>=25).forEach(i-> System.out.println(i));
//        using comparator

//        get stream object
        Stream<Integer> stream = list.stream();
//        configure stream by filtering out required value
        Stream<Integer> integerStream = stream.filter(i -> i >= 5);
//        you can sort on any stream filter or mapped or on a normal stream (non filter or non mapped too)
        Integer min = integerStream.min((l1, l2) -> l1.compareTo(l2)).get();
        System.out.println("minimum : "+min);

        System.out.println("Now in single line");
//        find max value
        Integer max = list.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("max :"+max);

        Stream<Integer> sorted = list.stream().sorted((i1, i2) -> i2.compareTo(i1));
        sorted.forEach(i-> System.out.println("Descending order : "+i));

//        Ascending order
        list.stream().sorted((l1, l2) -> l1.compareTo(l2)).forEach(i-> System.out.println(i));

    }
}
