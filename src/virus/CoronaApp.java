package virus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

public class CoronaApp {

	public static int getTotalPages() {
		try {
			// 1. �ּ� ��ü �����
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=1");

			// 2. ��Ʈ�� ����
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 3. ���� ���� (���ڿ�)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			// 4. ���� ���ϱ�
			StringBuilder sb = new StringBuilder();

			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}

			System.out.println(sb.toString());
			System.out.println();

			br.close();
			con.disconnect();

			// 5. �ڹ� ������Ʈ�� ��ȯ
			Gson gson = new Gson();
			Corona corona = gson.fromJson(sb.toString(), Corona.class);
			
			int totalPages = corona.getTotalPages();
			return totalPages;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return 0;
	}

	
	public static Corona getCorona(int page) {
		
		try {
			// 1. �ּ� ��ü �����
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page="+ page);

			// 2. ��Ʈ�� ����
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 3. ���� ���� (���ڿ�)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			// 4. ���� ���ϱ�
			StringBuilder sb = new StringBuilder();

			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}

			System.out.println(sb.toString());
			System.out.println();

			br.close();
			con.disconnect();

			// 5. �ڹ� ������Ʈ�� ��ȯ
			Gson gson = new Gson();
			Corona corona = gson.fromJson(sb.toString(), Corona.class);

			return corona;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		System.out.println();
		System.out.println("������ �Է��ϼ���.");
		Scanner sc = new Scanner(System.in);
		String loc = sc.nextLine(); // �λ�

		//int page = 1;

		ArrayList<Corona> coronas = new ArrayList<>();
		
		int totalPages = getTotalPages();
		
		for (int page = 1; page <= totalPages; page++) {
			Corona corona = getCorona(page);
			//page++;
			coronas.add(corona);
		}
		
	

		for (Corona corona : coronas) {
			List<StoreInfo> storeInfos = corona.getStoreInfos();

			for (StoreInfo storeInfo : storeInfos) {
				if (storeInfo.getAddr().contains(loc)) {
					System.out.println("�౹��: " + storeInfo.getName());
					System.out.println("�ּ�: " + storeInfo.getAddr());
				}

			}
		}

	}

}
