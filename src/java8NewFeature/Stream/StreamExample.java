package java8NewFeature.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(25);
        arrayList.add(55);
        arrayList.add(4);

//        List<Integer> element = StreamExample.findElement(arrayList);
//        for (Integer i  :element){
//            System.out.println(i);
//        }

        List<Integer> collect = arrayList.stream().filter(i -> i >= 5).collect(Collectors.toList());

//        for (Integer i:collect){
//            System.out.println(i);
//        }
        collect.stream().forEach(e -> System.out.println(e));

//        arrayList.stream().filter(i -> i%2 == 0).forEach(i -> System.out.println(i));

    }

//    public static List<Integer>findElement(List<Integer> arr){
//
//        List<Integer> newArrl= new ArrayList<Integer>();
//        for (Integer i:arr)
//        {
//            if (i>=5){
//                newArrl.add(i);
//            }
//        }
//
//
//        return newArrl;
//    }
}
