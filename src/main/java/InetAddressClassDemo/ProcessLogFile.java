package InetAddressClassDemo;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ProcessLogFile {
    public static void main(String[] args)  {

        try(FileInputStream fin = new FileInputStream("/home/mukesh/Desktop/BCA/network programming/Assignments/networkprogramming/src/main/java/InetAddressClassDemo/logfile");
            Reader in  = new InputStreamReader(fin);

            BufferedReader bin = new BufferedReader(in);){

            for(String entry = bin.readLine();
            entry!=null;
            entry = bin.readLine()){
                int index = entry.indexOf( ' ');
                String ip = entry.substring(0, index);
                String theRest = entry.substring(index);

                try{
                    InetAddress address = InetAddress.getByName(ip);
                    System.out.println(address.getHostName()  + theRest);
                }catch (UnknownHostException e){
                    System.out.println(e);
                    System.err.println(entry);
                }
            }
        }catch (IOException e){
            System.out.println(e);
        }

    }
}
