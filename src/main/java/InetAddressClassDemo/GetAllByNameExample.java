package InetAddressClassDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetAllByNameExample {
    public static void main(String[] args) {

//      Display all the numeric address for the given hostname
        System.out.println("\nDisplaying all the numeric address of the host");
        try {
//
            InetAddress[] address = InetAddress.getAllByName("www.facebook.com");
            for (InetAddress adr: address) {
                System.out.println(adr);
            }
        } catch (UnknownHostException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
