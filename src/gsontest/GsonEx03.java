package gsontest;

//{"name":"�ڽ�","age":40}

import com.google.gson.Gson;

public class GsonEx03 {

	public static void main(String[] args) {
		//1. �ٿ���� json ������
		String jsonData ="{\"name\":\"�ڽ�\",\"age\":40}";
		System.out.println(jsonData);
		
		//2.json�����͸� �ڹ� ������Ʈ�� ��ȯ
		Gson gson = new Gson();
		People people = gson.fromJson(jsonData,People.class);
		System.out.println(people.getName());
		System.out.println(people.getAge());
		
	}

}
