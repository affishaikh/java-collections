import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Try3 {
    public static void main(String[] args) {
        System.out.println(Stream.generate(() -> "Naruto").limit(20).collect(toList()));
    }
}
