package SocketsForClients;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        int port = 8000;
        try {
            ServerSocket server = new ServerSocket( port);
            System.out.println("Server listening at port "+port);
            Socket socket = server.accept();

            while(true) {
                DataInputStream dis = new DataInputStream(socket.getInputStream());
                DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
                String str = (String) dis.readUTF(); //return utf to string
                System.out.println("Client Says= " + str);
                Scanner s = new Scanner(System.in);
                String data = s.nextLine();
                dos.writeUTF(data);

                dis=null;
                dos=null;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
