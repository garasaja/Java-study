package coffeeshop.test;

class Data<T> {
	T value;
}

//���׸� Ŭ���� Ÿ�԰���
//E- element , K-key , V-vaule T-type N- number
class Str<K,V> {
	K k;
	V v;
}

public class GenericEx01 {
	public static void main(String[] args) {
		Data<String> data = new Data();
		data.value = "���ڿ�";
		System.out.println(data.value);
		
		//wrapper Ŭ���� : �⺻�ڷ����� Ŭ����ȭ ��Ű�� Ŭ����
		Data<Integer> data2 = new Data<>();
		data2.value = 10;
		System.out.println(data2.value);
		
		Str<String,String> s =new Str<>();
		s.k = "��й�ȣ";
		s.v = "bitc5500";
		
		System.out.println(s.k);
		System.out.println(s.v);
	}
	
}
