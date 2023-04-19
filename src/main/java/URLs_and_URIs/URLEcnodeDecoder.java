package URLs_and_URIs;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEcnodeDecoder {
    public static void main(String[] args) {
        String encoded= null;
        String decoded = null;
        try {
            String url = "https://www.google.com/search?hl=en&as_q=Java&as_epq=I/O";
            encoded = URLEncoder.encode(url,"UTF-8");
            decoded = URLDecoder.decode(encoded, "UTF-8");
            System.out.println( "Encoded String = "+encoded);
            System.out.println("Decoded String = "+decoded);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }

    }
}
