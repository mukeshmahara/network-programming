package URLs_and_URIs;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class PrintURLData {
    public static void main(String[] args) {

        try {
            System.setProperty("http.proxyHost","https://hosteagle.club");
            URL u = new URL("https://www.pornhub.com");
            InputStream in = u.openStream();
            int c;
            while ((c = in.read()) != -1) System.out.write(c);
            in.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
}
