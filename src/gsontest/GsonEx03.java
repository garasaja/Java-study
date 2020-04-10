package gsontest;

//{"name":"코스","age":40}

import com.google.gson.Gson;

public class GsonEx03 {

	public static void main(String[] args) {
		//1. 다운받은 json 데이터
		String jsonData ="{\"name\":\"코스\",\"age\":40}";
		System.out.println(jsonData);
		
		//2.json데이터를 자바 오브젝트로 변환
		Gson gson = new Gson();
		People people = gson.fromJson(jsonData,People.class);
		System.out.println(people.getName());
		System.out.println(people.getAge());
		
	}

}
