package SocketForServers;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.net.Socket;

public class BinaryDataClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Socket socket = new Socket("localhost", 8000);
			System.out.println("Connected to " + socket.getRemoteSocketAddress());

			InputStream in = socket.getInputStream();
			byte[] bindata = in.readAllBytes();
			DataInputStream dataInputStream = new DataInputStream(in);
			String data =null;
			for (byte b : bindata) {
				
				System.out.println((char) b);
			}

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}

}
