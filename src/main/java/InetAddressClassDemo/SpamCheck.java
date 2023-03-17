package InetAddressClassDemo;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

public class SpamCheck  {
    public static  final String BLACKHOLE = "cleantalk.org";
    public static void main(String[] args) throws UnknownHostException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ip addres to check:");
        String ip = sc.nextLine();

//        for (String arg: Arrays.asList(ip)) {
            if(isSpammer(ip)){
                System.out.println(ip +" is a known spammer");
            }else{
                System.out.println(ip+" appears legitmate");
            }

//        }
    }

    private static boolean isSpammer(String arg) {
        try{
            InetAddress address = InetAddress.getByName(arg);
            byte[] quad = address.getAddress();
            String query = BLACKHOLE;

            for (byte octet:quad) {
                int unsignedByte = octet<0 ? octet+256 : octet;
                query = unsignedByte+"."+query;
            }

            InetAddress.getByName(query);
            return true;
        }catch(UnknownHostException e){
            System.out.println(e);
            return false;
        }
    }
}
