package ch05;

class ��� {
	int num = 10;
}
class �ƽþ��� extends ���{
	int num = 30;
}
class �ѱ��� extends �ƽþ���{
	
}

class �ڼ��� extends �ѱ���{
	int num = 20;
}

public class EveryPerson {

	public static void main(String[] args) {
		�ڼ��� b1 = new �ڼ���();
		System.out.println(b1.num);
		
		�ѱ��� b2 = new �ڼ���();
		System.out.println(b2.num);
		
		�ڼ��� downB2 = (�ڼ���)b2;  // �ٿ�ĳ��ŷ�� ū�� = (ū��Ŭ������)������
		System.out.println("�ٿ�ĳ���� "+downB2.num);
		
		�ѱ��� upB1 = b1;		//��ĳ������ ������ = ū��
		System.out.println("upĳ��ŷ "+b1.num);
		
		//�ڼ��� downB3 = (�ڼ���)b3;
		
		��� b3 = new �ڼ���();
		System.out.println(b3.num);
	}

}
