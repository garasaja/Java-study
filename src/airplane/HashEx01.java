package airplane;

import java.util.HashMap;

public class HashEx01 {

	public static void main(String[] args) {
		HashMap<String,String> auth = new HashMap<>();
		
		auth.put("아이디", "ssarmango");
		auth.put("비밀번호", "1234");
		auth.put("아이디", "asd");// 같을경우 덮어씌운다.
		System.out.println(auth.get("아이디"));
	}

}
