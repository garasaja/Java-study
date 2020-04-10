package ch15;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.google.gson.Gson;

public class NetworkEx01 {
	
public static void main(String[] args) {
	try {
		// 1�� �ּ� ��ü �����
		URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=X44rZmxq1Gd0HhAhvhi8XFyEw0viyu9MaYp3DgJ2kN%2Fs83wPO9PADuyYRsAcZEyp7k%2Fx7ETfO2WCULGVotGWkQ%3D%3D&numOfRows=50&pageNo=1&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20200407&_type=json");
		
		//2�� ��Ʈ�� ����
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		
		//3�� ���ۿ��� (���ڿ�)
		BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));

		//���ο� ���� ����
		//���Ͽ� ��Ʈ�� ����
		FileWriter fr = new FileWriter("c:\\utils\\test.html");
		
		//4�� ���� ���ϱ�
		StringBuilder sb = new StringBuilder();
		String input = "";
		while((input = br.readLine()) != null) {
			sb.append(input);
			//System.out.println(input);
		}
		fr.write(sb.toString());
		System.out.println(sb.toString());
		
		Gson gson = new Gson();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

}



