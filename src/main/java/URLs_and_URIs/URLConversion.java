package URLs_and_URIs;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;

public class URLConversion {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.mukeshmahara.com.np");
            System.out.println("TO STIRNG METHOD Called " + url.toString().getClass());

            System.out.println("TO ExternalForm METHOD Called " + url.toExternalForm().getClass());

            System.out.println("TO URI METHOD Called " + url.toURI().getClass());//throws  URISyntaxException

        } catch (MalformedURLException e) {
            System.out.println(e);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
