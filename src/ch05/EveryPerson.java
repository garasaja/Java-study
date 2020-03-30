package ch05;

class 사람 {
	int num = 10;
}
class 아시아인 extends 사람{
	int num = 30;
}
class 한국인 extends 아시아인{
	
}

class 박서준 extends 한국인{
	int num = 20;
}

public class EveryPerson {

	public static void main(String[] args) {
		박서준 b1 = new 박서준();
		System.out.println(b1.num);
		
		한국인 b2 = new 박서준();
		System.out.println(b2.num);
		
		박서준 downB2 = (박서준)b2;  // 다운캐스킹은 큰거 = (큰거클래스명)작은거
		System.out.println("다운캐스팅 "+downB2.num);
		
		한국인 upB1 = b1;		//업캐스팅은 작은거 = 큰거
		System.out.println("up캐스킹 "+b1.num);
		
		//박서준 downB3 = (박서준)b3;
		
		사람 b3 = new 박서준();
		System.out.println(b3.num);
	}

}
