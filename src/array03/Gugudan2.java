package array03;

import java.util.Scanner;


public class Gugudan2 {

	static void calc()
	{
		System.out.println("원하는 구구단 단을 입력하세요(1~9)");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	
		System.out.println(num + "단을 출력합니다.");
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
			System.out.println("다시입력하시겠습니까? 1: yes 2 : no");
			ans=sc.nextInt();
		}
		System.out.println("프로그램을 종료합니다.");*/
		
		while(true)
		{
			System.out.println("원하는 구구단 단을 입력하세요(1~9)");
			Scanner sc1 = new Scanner(System.in);
			int num = sc1.nextInt();	
			System.out.println(num + "단을 출력합니다.");
			for(int i=1;i<10;i++)
			{
				System.out.println(num + " * " + i + " = " + (num*i));						
			}
		}
	}

}
