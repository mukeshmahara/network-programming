package URLConnections;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
public class OpeningURLConn {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection( );
            connection.connect();
            System.out.println("Connection to "+connection.getHeaderField("server")+" has been creted");
        }catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}
