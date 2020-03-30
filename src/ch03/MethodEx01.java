package ch03;

import ch03.MethodEx01;

// 메서드(함수)는 메서드 안에 작성할 수 없다. 클래스 안에는 사용할 수 있다.
public class MethodEx01 {

	
	static int add(int n1, int n2)//return x
	{
		
		int total = n1+n2;
		return total; // return은 가장 마지막에 작업함
		//System.out.println(sum);
		
		//minus(매개변수는 int형 두개) return은 int 형
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
