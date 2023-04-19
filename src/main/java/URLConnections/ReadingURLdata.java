package URLConnections;

import java.io.*;
import java.net.*;

public class ReadingURLdata {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.google.com/");
            URLConnection connection = url.openConnection();
            SimpleCacheRequest simpleCacheRequest = new SimpleCacheRequest();
            SimpleCacheResponse simpleCacheResponse = new SimpleCacheResponse(simpleCacheRequest,connection,null);

            System.out.println(simpleCacheResponse.getBody());

            InputStream rawdata = connection.getInputStream();
            InputStream buffer = new BufferedInputStream(rawdata);
            // chain the InputStream to a Reader
            Reader reader = new InputStreamReader(buffer);
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print( (char) c);
            }
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException();
        }

    }
}
