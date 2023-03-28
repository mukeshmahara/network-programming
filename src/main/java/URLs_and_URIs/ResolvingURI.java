package URLs_and_URIs;

import java.net.URI;
import java.net.URISyntaxException;

public class ResolvingURI {
    public static void main(String[] args) {
        URI absolute = null;
        try {
            absolute = new URI("http://www.example.com/");

            URI relative = new URI("images/logo.png");
            URI resolved = absolute.resolve(relative);

            System.out.println("Absolute URI "+absolute);

            System.out.println("Relative URI "+ relative);
            System.out.println("Resolved URI "+resolved);
//            Let's check the class of resolved object
            System.out.println(resolved.getClass());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
