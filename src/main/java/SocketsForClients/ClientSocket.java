package SocketsForClients;

import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class ClientSocket {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8000);
//            socket.setSoTimeout(15000);
            Scanner scanner = new Scanner(System.in);

            while(true) {
                InputStream in = socket.getInputStream();
                OutputStream dout = socket.getOutputStream();

                System.out.print("message : ");

                DataOutputStream dataOutputStream = new DataOutputStream(dout);

                String data = scanner.nextLine();
                dataOutputStream.writeUTF(data);

                DataInputStream dataInputStream = new DataInputStream(in);

                String incommingData = (String) dataInputStream.readUTF(dataInputStream);

                System.out.println(incommingData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
