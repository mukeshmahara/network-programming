package URLConnections;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Objects;

public class OpeningURLConn {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection( );
//
            InputStream raw = connection.getInputStream();
            InputStream buffer = new BufferedInputStream(raw);
            // chain the InputStream to a Reader
            Reader reader = new InputStreamReader(buffer);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
//            String contentType = connection.getContentType( );

            //Listing all the headers
            Map headers = connection.getHeaderFields();
            for (Object header : headers.entrySet()) {
                System.out.println(header);
            }
//            System.out.println(" The Content type is : "+contentType);
        }catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException();
        }


    }
}
