package nonblockingIO;

import java.nio.*;
import java.nio.channels.*;
import java.net.*;
import java.io.IOException;

public class ChargenClient {

	public static void main(String[] args) {
		
		int port = 8000;
		String host = "localhost";
		try {
			SocketAddress address = new InetSocketAddress(host, port);
			SocketChannel client = SocketChannel.open(address);
			ByteBuffer buffer = ByteBuffer.allocate(74);
			WritableByteChannel out = Channels.newChannel(System.out);
			while (client.read(buffer) != -1) {
				buffer.flip();
				out.write(buffer);
				buffer.clear();
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
