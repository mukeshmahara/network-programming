package SocketForServers;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class ServingBinaryData {
	public final static int PORT = 8000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (ServerSocket server = new ServerSocket(PORT)) {
			while (true) {

				try (Socket connection = server.accept()) {

					OutputStream out = connection.getOutputStream();
					byte[] test = new byte[40];
					
					test = "Hello".getBytes();
					
					for (byte b : test) {
						System.out.println((char) b);
						
					}

					out.write(test);
					out.flush();
				} catch (IOException ex) {
					System.err.println(ex.getMessage());
				}
			}
		} catch (IOException ex) {
			System.err.println(ex);
		}

	}

}
