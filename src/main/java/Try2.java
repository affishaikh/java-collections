import java.util.stream.Stream;

public class Try2 {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.<Integer>builder().add(121).add(11).add(22).build();
    }
}