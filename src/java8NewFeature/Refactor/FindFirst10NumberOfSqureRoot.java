package java8NewFeature.Refactor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindFirst10NumberOfSqureRoot {

    public static void main(String[] args) {
        List<Double> sqrtOf10Prime= Stream.iterate(1,i->i+1)
                .filter(RefactorCode::isPrime).peek(e-> System.out.println(e))
                .map(Math::sqrt)
                .limit(10)
                .collect(Collectors.toList());
//        System.out.println(sqrtOf10Prime);
    }
}
