
package com.mukeshmahara.networkprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author mukesh
 */
public class MyClient {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            DataInputStream din = new DataInputStream(s.getInputStream());

            String str = din.readUTF(); //return utf to string
            System.out.println("Server Says= " + str);

            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
//            System.out.println(e);
            System.out.println("Error :"+ e.getMessage());
        }
    }
}
