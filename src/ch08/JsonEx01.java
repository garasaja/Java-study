package ch08;

import com.google.gson.Gson;

class Family {
	int 샵 = 2;
	String 아버지 = "홍판서";
	String 어머니 = "춘섬";
}

class Person {
	String 이름 = "홍길동"; 
	int 나이 = 25; 
	String 성별 = "여";
	String 주소 = "서울시 양천구 목동";
	String[] 특기 = {"농구","도술"};
	Family 가족관계 = new Family();
	String 회사 = "경기 수원시 팔달구 우만동";
}

public class JsonEx01 {

	public static void main(String[] args) {
		Gson gson = new Gson();
		//fromJson() 함수 : json을 자바오브젝토로 변환
		//toJson() 함수 : 자바오브젝트를 json(String)으로 변환
		String personJson = gson.toJson(new Person());
		System.out.println(personJson);
	}

}
