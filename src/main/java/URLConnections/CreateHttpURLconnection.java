package URLConnections;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
public class CreateHttpURLconnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.mukeshmahara.com.np");
//            URLConnection uc = url.openConnection();
            HttpURLConnection httpconn = (HttpURLConnection) url.openConnection();
//            httpconn.connect();
            System.out.println("http connection has been established...");
            httpconn.setRequestMethod("GET");
            httpconn.setRequestMethod("HEAD");
            httpconn.setDoInput(false);
            System.out.println(url + " was last modified at "+ new Date(httpconn.getLastModified()));
            System.out.println(httpconn.getResponseCode());

//            System.out.println(httpconn.getPermission());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
