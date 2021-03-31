package ex04_sochet_thread;

import java.net.Socket;

public class FileUploadThread extends Thread{

	private Socket client;
	
	
	
	public Socket getClient() {
		return client;
	}

	public void setClient(Socket client) {
		this.client = client;
	}



	@Override
	public void run() {
		super.run();
	}
}
