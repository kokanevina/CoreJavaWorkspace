package tcp;


import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	
	InetAddress serveraddress;
	
	public TcpClient() throws UnknownHostException {
		System.out.println("Connection Establishment");
		serveraddress=InetAddress.getLocalHost();
		System.out.println(serveraddress);
		System.out.println("Client Establishing Connection with Server");
		try(Socket clientSocket=new Socket(serveraddress,2020)){
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connection gets autoclosed");
		

	}
	
	
	public static void main(String[] args) {
		try {
			TcpClient client=new TcpClient();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
