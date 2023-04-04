package URLs_and_URIs;

//import java.lang.reflect.Proxy;
import java.net.Proxy;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

public class ProxiesProperties {
//    proxy properties
    public static void main(String[] args) {
//        Sets the system property indicated by the specified key
        System.setProperty("http.proxyHost", "192.168.254.254");
        System.setProperty("http.proxyPort", "9000");
        System.setProperty("http.nonProxyHosts", "www.pornhub.com");

        System.out.println(System.getProperty("http.proxyHost"));
        SocketAddress addr = new InetSocketAddress("webcache.example.com", 8080);
        Proxy proxy = new Proxy(Proxy.Type.SOCKS, addr);
        System.out.println(proxy);
    }
}
