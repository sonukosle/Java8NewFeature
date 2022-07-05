package java8NewFeature.IQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceDemo {

    public static void main(String[] args) {
//        count the number of occurrence in given string Example

        String str= "welcome to code decode and code decode welcome you";//output : {code=2, and=1, to=1, decode=2, welcome=2, you=1}
//        String str="11 1 22 22 1 4 5 66 66 7";// output : {66=2, 22=2, 11=1, 1=2, 4=1, 5=1, 7=1}
        List<String> list= Arrays.asList(str.split(" "));
        Map<String, Long> collect = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
    }
}
