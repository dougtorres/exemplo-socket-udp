import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class main {

	public static void main(String[] args) {
		
		try {
			DatagramSocket socket = new DatagramSocket(55000);
			byte[] buffer = new byte[1024];
			DatagramPacket dg = new DatagramPacket(buffer, 1024);
			socket.receive(dg);

			System.out.println("Recebido: "+dg.getData().toString());
			
			socket.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
