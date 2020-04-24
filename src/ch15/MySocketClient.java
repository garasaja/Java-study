package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class MySocketClient {
	
	Socket socket;
	BufferedWriter bw;
	BufferedReader br;
	public MySocketClient() throws Exception {
		socket = new Socket("192.168.0.15",15000); // 서버 소켓의 accept()함수를 호출
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		br = new BufferedReader(new InputStreamReader(System.in));

		String msg = "";
		while((msg = br.readLine()) != null) {
			bw.write(msg + "\n");
			bw.flush();
		}
		
		bw.close();
		br.close();
		socket.close();
	}
	
	public static void main(String[] args) {
		try {
			new MySocketClient();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
