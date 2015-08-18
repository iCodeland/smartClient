import java.io.IOException;

import Socket.*;

public class ClientCtrl {
	int port, ip;
	public Client clientSkt;		//Client Thread

	public ClientCtrl() {

	}

	public void setPort(int port) {
		this.port = port;
	}
	public void setIP(int ip) {
		this.ip = ip;
	}

	private void startClient(int port, String IP) { // «È¤áºÝ
		clientSkt = new Client(IP, port);
		clientSkt.start();
	}

	public boolean stopClient() {
		boolean tt = false;
		try {
			Client.skt.close();
			tt = true;
		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println("Disconnect!\n");
		return tt;
	}
}
