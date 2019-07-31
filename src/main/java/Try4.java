import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Try4 {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 4).boxed().collect(toList()));
        System.out.println(asList(1, 2, 3).stream().map(num -> num * 3).collect(toList()));
    }
}
