package ch01;

import java.util.Scanner;

public class ConEx02 {
	static void calc()
	{
		System.out.println("국어, 영어, 수학 점수를 입력하세요");
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
					System.out.println("다시입력하세요.(0~100)");
					kor = sc.nextInt();
					eng = sc.nextInt();
					math = sc.nextInt();				
				}											
				System.out.println("국어 영어 수학 점수는 : " + kor + " " + eng + " " + math + "입니다.");
				if (avg >= 90) 
				{
					System.out.println(" 당신의 평균점수가 " + avg + " 이므로 당신의 성적은 A입니다.");
				} 
				else if (avg >= 80) 
				{
					System.out.println(" 당신의 평균점수가 " + avg + " 이므로 당신의 성적은 B입니다.");
				} 
				else if (avg >= 70) 
				{
					System.out.println(" 당신의 평균점수가 " + avg + " 이므로 당신의 성적은 C입니다.");
				} 
				else if (avg >= 60) 
				{
					System.out.println(" 당신의 평균점수가 " + avg + " 이므로 당신의 성적은 D입니다.");
				} 
				else 
				{
					System.out.println(" 당신의 평균점수가 " + avg + " 이므로 당신의 성적은 F입니다.");
				}										
		} 
		catch (Exception E) 
		{
			System.out.println("제대로쓰세요");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int back = 1;
		
		while(back == 1) {
			calc();
			System.out.println(" 다시 하시겠습니까? 1: 다시함 2: 종료");
			back = sc.nextInt();
		}
		System.out.println("프로그램을 종료합니다.");
	}	
		
		
		

}
