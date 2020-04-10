package airplane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class FlightApp {

	
	public static FlightInfo getFlightInfo(String depAirportId, String arrAirportId, long depPlandTime, int page) {
		
		FlightInfo flightInfo = null;
		
		try {
			// 1번 주소 객체 만들기
			URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=6Aj6QvTKUdFZT5TLrIZQGfv6iEyrS2GiE1EUSE1nkNCSv81UudjGXMKgW1LD3uR2UtxJVDG5w5Kf7h4zO7itJQ%3D%3D&numOfRows=50&pageNo=" + page + "&depAirportId=" + FlightInfoService.airPortId.get(depAirportId) + "&arrAirportId=" + FlightInfoService.airPortId.get(arrAirportId) + "&depPlandTime=" + depPlandTime + "&_type=json");
			// 2번 스트림 연결
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			// 3번 버퍼 연결 (문자열)
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
			// 4. 문자 더하기
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine())!=null) {
				sb.append(input);
			}
		
			br.close(); // 버퍼 닫기
			conn.disconnect(); // 스트림 닫기
			
			// 5. 자바 오브젝트로 변환
			Gson gson = new Gson();
			flightInfo = gson.fromJson(sb.toString(), FlightInfo.class);
		
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return flightInfo;
	}
	
	
	public static void main(String[] args) {
		FlightInfoService.setAirLineId();
		FlightInfoService.setAirPortId();
		
		for (String key : FlightInfoService.airPortId.keySet()) {
			System.out.print(key + " ");
		}
		
		System.out.println();
		System.out.println("출발지를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String depAirportId = sc.next();	// 김포
		
		System.out.println("도착지를 입력하세요");
		String arrAirportId = sc.next();
		
		System.out.println("출발일자를 입력하세요");
		String depPlandTimeTemp = sc.next();
		
		long depPlandTime = Long.parseLong(depPlandTimeTemp);
//		Integer depPlandTimeInteger = Integer.parseInt(depPlandTimeTemp);
//		Double depPlandTimeDouble = Double.parseDouble(depPlandTimeTemp);
//		
		
		
		// 
//		String strTemp = depPlandTime + "";
//		String strTemp2 = depPlandTimeInteger.toString();
//		String strTemp3 = depPlandTimeDouble.toString();
		
		int page = 1;
		//int totalCount = getTotalCount(depAirportId, arrAirportId, depPlandTime);
		
		FlightInfo flightInfo = getFlightInfo(depAirportId, arrAirportId, depPlandTime, page);
		List<Item> flightItems = flightInfo.getResponse().getBody().getItems().getItem();
		
		
		
		
		// forEach문 : Iterable 인터페이스 구현한 모든 클래스가 들어올 수
		for (Item it : flightItems) {	// forEach 문
			System.out.println("항공사 : "+it.getAirlineNm());
			System.out.println("출발지 : "+it.getDepAirportNm());
			System.out.println("도착지 : "+it.getArrAirportNm());
			System.out.println("출발시간 : "+it.getDepPlandTime());
			System.out.println("도착시간 : "+it.getArrPlandTime());
			System.out.println("요금 : "+it.getEconomyCharge());
			System.out.println();
		}
	}
	

	/*
	public static void main(String[] args) {
	
		String jsonData = "{\"response\":{\"header\":{\"resultCode\":\"00\",\"resultMsg\":\"NORMAL SERVICE.\"},\"body\":{\"items\":{\"item\":[{\"airlineNm\":\"아시아나항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071045,\"depAirportNm\":\"광주\",\"depPlandTime\":202004070955,\"economyCharge\":57900,\"prestigeCharge\":0,\"vihicleId\":\"OZ8141\"},{\"airlineNm\":\"아시아나항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071340,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071245,\"economyCharge\":57900,\"prestigeCharge\":0,\"vihicleId\":\"OZ8143\"},{\"airlineNm\":\"아시아나항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071530,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071440,\"economyCharge\":57900,\"prestigeCharge\":0,\"vihicleId\":\"OZ8145\"},{\"airlineNm\":\"아시아나항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004071855,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071800,\"economyCharge\":57900,\"prestigeCharge\":0,\"vihicleId\":\"OZ8147\"},{\"airlineNm\":\"아시아나항공\",\"arrAirportNm\":\"제주\",\"arrPlandTime\":202004072015,\"depAirportNm\":\"광주\",\"depPlandTime\":202004071920,\"economyCharge\":57900,\"prestigeCharge\":0,\"vihicleId\":\"OZ8149\"}]},\"numOfRows\":10,\"pageNo\":1,\"totalCount\":5}}}\r\n" + 
				"";
		
		System.out.println(jsonData);
		
		Gson gson = new Gson();
		FlightInfo ai = gson.fromJson(jsonData, FlightInfo.class);
		
		
		Response res = ai.getResponse();
		Body body = res.getBody();
		Items items = body.getItems();
		List<Item> itemList = items.getItem();
		
		for (Item it : itemList) {
			System.out.println("도착공항명 : " + it.getArrAirportNm());
			System.out.println("도착시간 : " + it.getArrPlandTime());
			System.out.println("출발공항명 : " + it.getDepAirportNm());
			System.out.println("출발시간 : " + it.getDepPlandTime());
			System.out.println("항공편 : " + it.getAirlineNm());
			
			System.out.println();
		}
		
	}
	*/

}
