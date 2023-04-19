package URLs_and_URIs;

import java.io.IOException;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class LocalProxySelector extends ProxySelector {
    private List<URI> failed = new ArrayList<URI>();
    public List<Proxy> select(URI uri) {
        List<Proxy> result = new ArrayList<Proxy>();
        if (failed.contains(uri)
                || !"http".equalsIgnoreCase(uri.getScheme())) {
            result.add(Proxy.NO_PROXY);
        } else {
            SocketAddress proxyAddress
                    = new InetSocketAddress( "182.255.45.165", 8080);
            Proxy proxy = new Proxy(Proxy.Type.HTTP, proxyAddress);
            result.add(proxy);
        }

        return result;
    }

    public void connectFailed(URI uri, SocketAddress address, IOException ex) {
        failed.add(uri);
    }
    public static void main(String[] args) {
        LocalProxySelector lps = new LocalProxySelector();
        try {
            URI uri = new URI("http:103.88.127.178:8080");
            lps.select(uri);
            System.out.println(lps.failed);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
