
package com.mukeshmahara.networkprogramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author mukesh
 */
public class MyServer {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(6666);
            System.out.println("Server listening at port:"+ss.getLocalPort());

            Socket s = ss.accept();//establishes connection

            DataInputStream dis = new DataInputStream(s.getInputStream()
            );
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeUTF("Hello Client, How can I help you ?");

            String str = (String) dis.readUTF(); //return utf to string
            System.out.println("Client Says= " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
