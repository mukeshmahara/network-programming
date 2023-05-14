package SocketForServers_Client;

import java.io.IOException;
import java.net.Socket;

public class ServerClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Socket socket = new Socket("localhost", 8000);
		}catch (IOException e) {
            throw new RuntimeException(e);
        }

	}

}
