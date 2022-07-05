package java8NewFeature.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ToArrayDemo {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.add(11);
        list.add(255);
        list.add(30);
        list.add(8);

        Stream<Integer> filteredList = list.stream().filter(i -> i >= 30);
//        filteredList.forEach(i-> System.out.println(i));
        System.out.println("Now converting List to array");
        Object[] objects = filteredList.toArray();

        for (Object o : objects) {
            System.out.println(o);
        }
        System.out.println("in single line");

        Object[] objects1 = list.stream().filter(i -> i > 10).toArray();

        for (Object o:objects1){
            System.out.println(o);
        }

    }
}
