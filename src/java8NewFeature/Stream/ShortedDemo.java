package java8NewFeature.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ShortedDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Suuny");
        list.add("Aman");
        list.add("pradeep");
        list.add("Angel");
        list.add("Supriya");

//        Stream<String> stringStream = list.stream().map(i -> i + " "+"Kosle");
//        stringStream.forEach(i-> System.out.println(i));
//        Stream<String> stringStream = list.stream().filter(i->i.equals("pradeep"));
//        stringStream.forEach(i-> System.out.println(i));
        Stream<String> stringStream = list.stream().filter(i->i.length()==7);
        stringStream.forEach(i-> System.out.println(i));

        System.out.println("descending order");
//        System.out.println("Sorted manner");
//        list.stream().sorted().forEach(i-> System.out.println(i));

        list.stream().sorted((l1,l2)->l1.compareTo(l2)).forEach(i-> System.out.println(i));
    }


}
