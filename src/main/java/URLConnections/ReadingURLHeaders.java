package URLConnections;

import java.io.*;
import java.net.*;
import java.util.List;
import java.util.Map;

public class ReadingURLHeaders {
    public static void main(String[] args) {
        try {
            String uri = "https://www.javatpoint.com";
            //Calling the constructor of the URI class
            URI uri1 = new URI(uri);
            URL url = new URL("http://www.google.com");
            URLConnection connection = url.openConnection( );
            ResponseCache responseCache = new ResponseCache() {
                @Override
                public CacheResponse get(URI uri, String rqstMethod, Map<String, List<String>> rqstHeaders) throws IOException {
                    return null;
                }

                @Override
                public CacheRequest put(URI uri, URLConnection conn) throws IOException {
                    return null;
                }
            };
            //The sets the system-wide response cache.
            ResponseCache.setDefault(responseCache);
            //The getDefault() method returns the system-wide ResponseCache .

            System.out.println("The put() method returns: " + responseCache.put(uri1, connection));
            System.out.println("GetDefault"+ResponseCache.getDefault().toString());

            //Listing all the headers
            Map headers = connection.getHeaderFields();

            for (Object header : headers.entrySet()) {
                System.out.println(header);
            }
        }catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }catch (IOException | URISyntaxException e){
            throw new RuntimeException();
        }

    }
}
