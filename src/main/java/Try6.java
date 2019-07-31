import java.util.Optional;

public class Try6 {
    public static void main(String[] args) {
        System.out.println(Optional.ofNullable(null).orElse(1));
    }
}
