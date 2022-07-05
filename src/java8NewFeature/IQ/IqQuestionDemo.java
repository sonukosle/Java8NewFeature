package java8NewFeature.IQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IqQuestionDemo {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 10, 25, 30, 80, 80, 80, 45, 30);
        Set<Integer> set = new HashSet<>();

//        example to find duplicate elements in list;
        list.stream().filter(a -> !set.add(a)).collect(Collectors.toSet()).forEach(a -> System.out.println(a));
    }
}
