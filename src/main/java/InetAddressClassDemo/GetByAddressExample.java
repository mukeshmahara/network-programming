package InetAddressClassDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class GetByAddressExample {
    public static void main(String[] args) {
        byte[] ip = {(byte) 157, (byte) 256, 0, 35};

        byte[] ipv4 = {1, 127, 0, 35};
        byte[] ipv6 = {(byte) 2999, 59, 99, 100, 80, 70, 50, 10, 50, 98, 65, 54, 80, 30, 40, 10};
        try {
            //creates an InetAddress based on hostname and ip address
            //The system-wide resolver is not used to check the validity of the address.
            //The host name can either be a machine name, such as "www.example.com",
            // or a textual representation of its IP address.
            //No validity checking is done on the host name either.
            InetAddress address = InetAddress.getByAddress("www.facebook.com", ipv6);

            System.out.println(address);

            System.out.println("CanonicalHostname = " + address.getCanonicalHostName());//Gets the fully qualified domain name for this IP address.
            System.out.println("HostName = " +address.getHostName());//gets the hostname for the ip address
            System.out.println("HostAddress = " +address.getHostAddress());//Returns the IP address string in textual presentation.
            System.out.println(Arrays.toString(address.getAddress())); //Returns the IP address string in textual presentation.

            InetAddress address1 = InetAddress.getByAddress(null, ip);

//            for (byte adrr : ip) {
//                System.out.println(adrr & 0xff); //bitwise AND operation with octet
//            }
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }

    }
}
