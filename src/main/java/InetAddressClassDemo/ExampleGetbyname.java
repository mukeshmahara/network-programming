package InetAddressClassDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;


public class ExampleGetbyname  {

    public static void main(String[] args) {

        InetAddress address ;
        InetAddress[] addressess =null;

//        Display the numeric address for the given hostname
        try {
            address = InetAddress.getByName("facebook.com");
            System.out.println("Address :" +address);

        } catch ( UnknownHostException exception) {
            System.out.println(exception.getMessage());
        }

//        Display all the numeric address for the given hostname
        System.out.println("\nDisplaying all the numeric address of the host");
        try {
            addressess = InetAddress.getAllByName("google.com");
        }catch (UnknownHostException exception){
            System.out.println(exception.getStackTrace());

        }

        for (InetAddress ip : addressess){
            System.out.println("\nADDRESS \t" +ip);
            System.out.println("Type \t" +ip.getClass());

        }
    }




}
