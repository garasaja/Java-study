package coffeeshop.test;

class Data<T> {
	T value;
}

//제네릭 클래스 타입결정
//E- element , K-key , V-vaule T-type N- number
class Str<K,V> {
	K k;
	V v;
}

public class GenericEx01 {
	public static void main(String[] args) {
		Data<String> data = new Data();
		data.value = "문자열";
		System.out.println(data.value);
		
		//wrapper 클래스 : 기본자료형을 클래스화 시키는 클래스
		Data<Integer> data2 = new Data<>();
		data2.value = 10;
		System.out.println(data2.value);
		
		Str<String,String> s =new Str<>();
		s.k = "비밀번호";
		s.v = "bitc5500";
		
		System.out.println(s.k);
		System.out.println(s.v);
	}
	
}
