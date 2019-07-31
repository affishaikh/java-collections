import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;

public class Try5 {
    public static void main(String[] args) {
        System.out.println(Pattern.compile("-").splitAsStream("block-1").collect(toList()));
    }
}
