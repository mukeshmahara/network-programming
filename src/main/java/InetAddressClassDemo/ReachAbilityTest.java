package InetAddressClassDemo;

import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.UnknownHostException;
import java.util.Arrays;


public class ReachAbilityTest {
    public static void main(String[] args) throws IOException {


        InetAddress address = InetAddress.getByName("127.0.0.1");
        NetworkInterface networInt = NetworkInterface.getByName("lo");
        System.out.println(networInt);

        System.out.println(address.isReachable(50));
        System.out.println(address.isReachable(networInt, 500, 20));
    }
}
