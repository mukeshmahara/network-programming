package InetAddressClassDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPCharaceristics {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("224.0.0.0");

        System.out.println(address.isLoopbackAddress());
        System.out.println(address.isAnyLocalAddress());
        System.out.println(address.isLinkLocalAddress());
        System.out.println(address.isSiteLocalAddress());
        System.out.println(address.isMulticastAddress());
        System.out.println(address.isMCOrgLocal());
        System.out.println(address.isMCSiteLocal());
        System.out.println(address.isMCLinkLocal());
        System.out.println(address.isMCNodeLocal());
    }
}
