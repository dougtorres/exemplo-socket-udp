import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Main {

	public static void main(String[] args) {
		
		try {
			InetAddress address = InetAddress.getByName("localhost");
			
			DatagramSocket socket = new DatagramSocket();
			
			byte[] req = "Teste".getBytes();
			
			DatagramPacket dg1 = new DatagramPacket(req, req.length, address, 55000);
			socket.send(dg1);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
