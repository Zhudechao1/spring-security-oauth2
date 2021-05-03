import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SecretTest {
    public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("8792647891"));
    }
}
