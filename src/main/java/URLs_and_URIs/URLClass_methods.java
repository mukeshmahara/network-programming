package URLs_and_URIs;

import java.net.MalformedURLException;
import java.net.URL;

public class URLClass_methods {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.study.com/index/profile.pngx");
            System.out.println("host:" + url.getHost());
            System.out.println("Protocol:" + url.getProtocol());
            System.out.println("Port :" + url.getPort());
            System.out.println("Path:" + url.getPath());
            System.out.println("Query:" + url.getQuery());
            System.out.println("Authority:" + url.getAuthority());

        } catch (MalformedURLException ex) {
            System.out.println(ex);
        }

    }
}
