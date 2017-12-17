import java.io.*;
import java.net.*;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UdpSocket socket = new UdpSocket("166.104.46.95", 6000);
		while(true){
			try {
				
				Storage msg = new Storage(socket.receiveBytes(2048));
				
				System.out.println(msg.readFloat() + " , " + msg.readFloat());				
				
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		

	}

}
