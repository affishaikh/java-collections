import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class Try1 {
    public static void main(String[] args) {
        List<String> names = asList("Rishab", "Naman", "Aftab", null);
        System.out.println(names.stream().filter(name -> Objects.nonNull(name)).map(name -> name.toUpperCase()).collect(toList()));
    }
}
