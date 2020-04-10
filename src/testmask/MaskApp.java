package testmask;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import com.google.gson.Gson;

import airplane.FlightInfo;
import airplane.FlightInfoService;

public class MaskApp {

	public static Maskinfo maskInfo(int page) {
		// �Ű������� �������� �Է��ϸ� �ش���������ü�� ��ȯ��
		try {
			// 1�� �ּ� ��ü �����
			URL url = new URL("https://8oi9s0nnth.apigw.ntruss.com/corona19-masks/v1/stores/json?page=" + page);

			// 2�� ��Ʈ�� ����
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			// 3�� ���� ���� (���ڿ�)
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

			// 4. ���� ���ϱ�
			StringBuilder sb = new StringBuilder();

			String input = "";
			while ((input = br.readLine()) != null) {
				sb.append(input);
			}

			System.out.println(sb.toString());
			System.out.println();

			br.close(); // ���� �ݱ�
			con.disconnect(); // ��Ʈ�� �ݱ�

			// 5. �ڹ� ������Ʈ�� ��ȯ
			Gson gson = new Gson();
			Maskinfo maskInfo = gson.fromJson(sb.toString(), Maskinfo.class);

			return maskInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		// �౹ �ּҿ� �̸��� �˻�
		// ���� �ּҸ� Ÿ�����ؼ� �˻�����
		Scanner sc = new Scanner(System.in);
		String location = sc.nextLine();

		for (int j = 1; j <= maskInfo(1).getTotalPages(); j++) {
			
			Maskinfo test = maskInfo(j);
			
			for (int i = 0; i < test.getStoreInfos().size(); i++) {
				if (test.getStoreInfos().get(i).getAddr().contains(location)) {
					System.out.println(test.getStoreInfos().get(i).getAddr());
					System.out.println(test.getStoreInfos().get(i).getName());
					System.out.println();
				}
			}
		}

	}
}
