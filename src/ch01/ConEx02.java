package ch01;

import java.util.Scanner;

public class ConEx02 {
	static void calc()
	{
		System.out.println("����, ����, ���� ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);

		int kor, eng, math;
		int sum = 0;
		int avg = 0;
		int back;
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();

		
		sum = kor + eng + math;
		avg = sum / 3;
		try 
		{						
				while(kor < 0 || kor > 100 || eng < 0 || eng > 100 || math < 0 || math > 100)
				{
					System.out.println("�ٽ��Է��ϼ���.(0~100)");
					kor = sc.nextInt();
					eng = sc.nextInt();
					math = sc.nextInt();				
				}											
				System.out.println("���� ���� ���� ������ : " + kor + " " + eng + " " + math + "�Դϴ�.");
				if (avg >= 90) 
				{
					System.out.println(" ����� ��������� " + avg + " �̹Ƿ� ����� ������ A�Դϴ�.");
				} 
				else if (avg >= 80) 
				{
					System.out.println(" ����� ��������� " + avg + " �̹Ƿ� ����� ������ B�Դϴ�.");
				} 
				else if (avg >= 70) 
				{
					System.out.println(" ����� ��������� " + avg + " �̹Ƿ� ����� ������ C�Դϴ�.");
				} 
				else if (avg >= 60) 
				{
					System.out.println(" ����� ��������� " + avg + " �̹Ƿ� ����� ������ D�Դϴ�.");
				} 
				else 
				{
					System.out.println(" ����� ��������� " + avg + " �̹Ƿ� ����� ������ F�Դϴ�.");
				}										
		} 
		catch (Exception E) 
		{
			System.out.println("����ξ�����");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int back = 1;
		
		while(back == 1) {
			calc();
			System.out.println(" �ٽ� �Ͻðڽ��ϱ�? 1: �ٽ��� 2: ����");
			back = sc.nextInt();
		}
		System.out.println("���α׷��� �����մϴ�.");
	}	
		
		
		

}
