package ch08;

import java.io.IOException;
import java.io.InputStream;

//��Ʈ��(Byte) = ���� �帧
//���� �带�� ���������� ��ŵ�� ���� �帣�� �ʴ´�.
//���� �带�� ���������� ���� �帥��.(��� ����)
// �� = ����Ʈ
public class InputEx01 {

	public static void main(String[] args) {
		InputStream in = System.in;
		try {
			int data = in.read();
			System.out.println(data);
		} catch (IOException e) {
			System.out.println("IO���� �߻�");
		}

	}

}
