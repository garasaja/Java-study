package virus;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

import airplane.FlightInfo;
import airplane.Item;

public class CoronaApp2 {
	public static int getTotalCount(int page) {
		try {
			// 1번 주소 객체 만들기
						URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1&_type=json");
						
						// 2번 스트림 연결
						HttpURLConnection con = 
								(HttpURLConnection) url.openConnection();
						
						// 3번 버퍼 연결 (문자열)
						BufferedReader br = 
								new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
				
						// 4. 문자 더하기
						StringBuilder sb = new StringBuilder();
						
						String input = "";
						while((input = br.readLine()) != null) {
							sb.append(input);
						}

						System.out.println(sb.toString());
						System.out.println();
						
						br.close(); // 버퍼 닫기
						con.disconnect(); // 스트림 닫기
						
						// 5. 자바 오브젝트로 변환
						Gson gson = new Gson();
						Corona corona = gson.fromJson(sb.toString(), Corona.class);

						//return corona;
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		return 0;
		
	}
	
	
	public static Corona getStoreInfo(int page) {
		try {
			// 1번 주소 객체 만들기
						URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1&_type=json");
						
						// 2번 스트림 연결
						HttpURLConnection con = 
								(HttpURLConnection) url.openConnection();
						
						// 3번 버퍼 연결 (문자열)
						BufferedReader br = 
								new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
				
						// 4. 문자 더하기
						StringBuilder sb = new StringBuilder();
						
						String input = "";
						while((input = br.readLine()) != null) {
							sb.append(input);
						}

						System.out.println(sb.toString());
						System.out.println();
						
						br.close(); // 버퍼 닫기
						con.disconnect(); // 스트림 닫기
						
						// 5. 자바 오브젝트로 변환
						Gson gson = new Gson();
						Corona corona = gson.fromJson(sb.toString(), Corona.class);

						return corona;
			} catch (Exception e) {
				e.printStackTrace();
			}
		return null;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력하세요.");
		String addr = sc.next();
		
		
		
		int totalCount = getTotalCount(1);
		
		
		ArrayList<StoreInfo> storeInfo = new ArrayList<>();
		
		
		
		for (StoreInfo storeinfo : storeInfo) {
			System.out.println("주소 :" + storeinfo.addr);			
			System.out.println("이름 :" + storeinfo.name);
			
		}
		
	
}
}



