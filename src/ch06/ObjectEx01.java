package ch06;

class Animal {
	@Override
	public int hashCode() { // 오브젝트가 해시코드 가지고 잇음
		return super.hashCode();
	}
}


public class ObjectEx01 {

	public static void main(String[] args) {
		String d1 = "물";
		String d2 = "물";

		System.out.println(d1.equals(d2));
		System.out.println(d1==d2);
		System.out.println("-------------------------------");
		String d3 = new String("물");
		String d4 = new String("물");
		System.out.println(d3.equals(d4));
		System.out.println(d3==d4);
		
		System.out.println(d3.getClass());
		
		//해시코드 - 동일한 길이의 숫자로 리턴
		
		Animal a1 = new Animal();
		Animal a2 = new Animal();
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		System.out.println(a1 instanceof Animal);
	}

}
