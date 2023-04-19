package URLs_and_URIs;

//import java.lang.reflect.Proxy;
import java.net.Proxy;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class ProxiesProperties {
//    proxy properties
    public static void main(String[] args) {
//        Sets the system property indicated by the specified key
        System.setProperty("xyx", "14.97.2.105");

        System.out.println( System.getProperty("xyx"));


        System.setProperty("http.proxyPort", "9000");
        System.setProperty("http.nonProxyHosts", "www.facebook.com");

        System.out.println(System.getProperty("http.proxyHost"));
        SocketAddress addr = new InetSocketAddress("webcache.example.com", 8080);
        Proxy proxy = new Proxy(Proxy.Type.SOCKS, addr);
        System.out.println(proxy);
    }
}
