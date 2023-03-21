package InetAddressClassDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class ExampleGetbyname {

    public static void main(String[] args) {

//      Display all the numeric address for the given hostname

        try {

            //Determines the IP address of a host, given the host's name.
            //The host name can either be a machine name, such as "www.example.com",
            // or a textual representation of its IP address. If a literal IP address
            // is supplied, only the validity of the address format is checked.

            InetAddress address = InetAddress.getByName("www.gmail.com");

            System.out.println("\nDetermines the IP address of a host, given the host's name");
            System.out.println(address);

        } catch (UnknownHostException exception) {

            System.out.println(exception.getMessage());
        }

//
    }
}
