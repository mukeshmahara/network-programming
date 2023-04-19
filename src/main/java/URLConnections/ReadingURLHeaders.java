package URLConnections;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class ReadingURLHeaders {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection( );

            //Listing all the headers
            Map headers = connection.getHeaderFields();

            for (Object header : headers.entrySet()) {
                System.out.println(header);
            }
        }catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException();
        }

    }
}
