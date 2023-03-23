package URLs_and_URIs;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class PrintURLData {
    public static void main(String[] args) {

        try {
            URL u = new URL("https://www.google.com");
            InputStream in = u.openStream();
            int c;
            while ((c = in.read()) != -1) System.out.write(c);
            in.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }

    }
}
