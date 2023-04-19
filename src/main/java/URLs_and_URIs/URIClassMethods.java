package URLs_and_URIs;

import java.net.URI;
import java.net.URISyntaxException;

public class URIClassMethods {
    public static void main(String[] args) {

        try {
            URI uri = new URI("abc://admin:admin@geeksforgeeks.org:1234/path/data?key=value&key2=value2#fragid1");

            System.out.println("URI = "+uri);
            System.out.println("Scheme = "+uri.getScheme());
            System.out.println("RawAuthority  = "+uri.getRawAuthority());
            System.out.println("Fragment  = "+uri.getFragment());
            System.out.println("Port = "+uri.getPort());
            System.out.println("Query = "+uri.getQuery());
            System.out.println("Path = "+uri.getPath());
            System.out.println("UserInfo = "+uri.getUserInfo());
            System.out.println("isAbsolute = "+uri.isAbsolute());
            System.out.println("isOpaque = "+uri.isOpaque());


            System.out.println("RawSchemeSpecificPart = "+uri.getRawSchemeSpecificPart());

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
