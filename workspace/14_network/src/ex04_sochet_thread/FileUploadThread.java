package ex04_sochet_thread;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
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
		File dir=new File("c:\\myserver");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		DataInputStream dis=null;
		File file=null;
		BufferedOutputStream bos=null;
		try {
			//client가 파일명+파일내용을 보내주고있음. 
			//client가 dos.writeUTF(fileName)을 보내고있기 때문에
			//datainput을 이용해야함
			dis=new DataInputStream(client.getInputStream());
			String filename=dis.readUTF();//clirent가 파일명을writeUTF로 보냈기 때문 
		
			//client가 보낸 내용을 c:my
			//파일을 저장하기 위해서 fileoutputstream이 필요하다.
			//성능을 높이기 위해서 bufferoutputstream을 이용함
			file=new File(dir,filename);
			bos=new BufferedOutputStream(new FileOutputStream(file));
			byte[] b=new byte[1024];
			int length=0;
			while((length=dis.read(b))!=-1) {
				bos.write(b, 0,length);
			}
			System.out.println(file.getAbsolutePath()+"파일이 저장되었습니다.");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos!=null)bos.close();
				if(dis!=null)dis.close();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}
