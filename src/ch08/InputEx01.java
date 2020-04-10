package ch08;

import java.io.IOException;
import java.io.InputStream;

//스트림(Byte) = 물의 흐름
//물이 흐를때 수도꼭지를 잠궈드면 물이 흐르지 않는다.
//물이 흐를때 수도꼭지를 열면 흐른다.(통신 시작)
// 물 = 바이트
public class InputEx01 {

	public static void main(String[] args) {
		InputStream in = System.in;
		try {
			int data = in.read();
			System.out.println(data);
		} catch (IOException e) {
			System.out.println("IO오류 발생");
		}

	}

}
