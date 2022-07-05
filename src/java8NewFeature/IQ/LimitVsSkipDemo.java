package java8NewFeature.IQ;

import java.util.Arrays;
import java.util.List;

public class LimitVsSkipDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(11,12,33,45,78,10,25);
        System.out.println("Example with limit");
        list.stream().limit(3).forEach(x-> System.out.println(x));
        System.out.println("Taking another example using skip");
        list.stream().skip(5).forEach(x-> System.out.println(x));
    }
}
