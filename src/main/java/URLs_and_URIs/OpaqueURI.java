package URLs_and_URIs;

import java.net.URI;
import java.net.URISyntaxException;

public class OpaqueURI {
    public static void main(String[] args) {

        try {
//            URI opq_uri = new URI("mailto:a@b.com");
//            An opaque URI is an absolute URI whose
//            scheme-specific part does not begin with
//            a slash character ('/'). Opaque URIs are
//            not subject to further parsing. Some
//            examples of opaque
//            URIs are: mailto:java-net@java.sun.com.
            URI opq_uri = new URI("mailto:a@b.com");
            System.out.println(opq_uri.isOpaque());
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }

    }
}
