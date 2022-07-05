package java8NewFeature.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        List<Integer> list= new ArrayList<Integer>();
        list.add(23);
        list.add(24);
        list.add(5);
        list.add(4);

//        Stream<Integer> integerStream = list.stream().map(i -> i * i);
//        integerStream.forEach(i-> System.out.println(i));

        list.stream().map(i->i*i).forEach(i-> System.out.println(i));

    }




}
