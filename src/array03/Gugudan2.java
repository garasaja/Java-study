package array03;

import java.util.Scanner;


public class Gugudan2 {

	static void calc()
	{
		System.out.println("���ϴ� ������ ���� �Է��ϼ���(1~9)");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	
		System.out.println(num + "���� ����մϴ�.");
		for(int i=1;i<10;i++)
		{
			System.out.println(num + " * " + i + " = " + (num*i));						
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Gugudan2 gugudan = new Gugudan2();
		int ans=1;
		
		/*while(ans==1)
		{
			calc();
			System.out.println("�ٽ��Է��Ͻðڽ��ϱ�? 1: yes 2 : no");
			ans=sc.nextInt();
		}
		System.out.println("���α׷��� �����մϴ�.");*/
		
		while(true)
		{
			System.out.println("���ϴ� ������ ���� �Է��ϼ���(1~9)");
			Scanner sc1 = new Scanner(System.in);
			int num = sc1.nextInt();	
			System.out.println(num + "���� ����մϴ�.");
			for(int i=1;i<10;i++)
			{
				System.out.println(num + " * " + i + " = " + (num*i));						
			}
		}
	}

}
