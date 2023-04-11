package URLConnections;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class OpeningURLConn {
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("http://www.gmail.com");
            URLConnection connection = url.openConnection( );
            String mimeType = connection.getContentType( );
            System.out.println(" The mime type is : "+mimeType);
            System.out.println(" The time out time of connection is : "+connection.getConnectTimeout());
        }catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }catch (IOException e){
            throw new RuntimeException();
        }


    }
}
