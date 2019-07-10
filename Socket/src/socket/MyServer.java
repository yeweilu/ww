package socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {
	public static void main(String[] args) throws IOException {
		ServerSocket server =  new ServerSocket(9999);
		Socket socket = server.accept();
		System.out.println("与客户端连接成功");
		OutputStream out = socket.getOutputStream();
		String info = "hello!";
		//String -> byte[]
		out.write(info.getBytes());
		
		//接受客户端发来的信息
		InputStream in = socket.getInputStream();
		byte[] bs = new byte[100];
		in.read(bs);
		System.out.println("接受客户端发来的信息" + new String(bs));
		out.close();
		server.close();
		in.close();
		socket.close();
	}
	
}
