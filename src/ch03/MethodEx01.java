package ch03;

import ch03.MethodEx01;

// �޼���(�Լ�)�� �޼��� �ȿ� �ۼ��� �� ����. Ŭ���� �ȿ��� ����� �� �ִ�.
public class MethodEx01 {

	
	static int add(int n1, int n2)//return x
	{
		
		int total = n1+n2;
		return total; // return�� ���� �������� �۾���
		//System.out.println(sum);
		
		//minus(�Ű������� int�� �ΰ�) return�� int ��
	}
	static int minus(int n1, int n2)
	{
		int total = n1-n2;
		System.out.println(total);
		return total;
	}
	static int divide(int n1, int n2)
	{
		int total = n1/n2;
		System.out.println(total);
		return total;
	}
	static int multi(int n1, int n2)
	{
		int total = n1*n2;
		System.out.println(total);
		return total;
	}
	
	public static void main(String[] args) {
		
		//MethodEx01.add(4, 5);
		int num = MethodEx01.add(5,3);
		System.out.println(num);
		
		add(5,3);
		minus(5,3);
		divide(5,3);
		multi(5,3);

	}

}
